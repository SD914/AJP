import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class reportcard extends JFrame
{
	JPanel jp=new JPanel();
	JLabel lname=new JLabel();
	JButton bsubmit=new JButton("Submit");
	JTextField tname=new JTextField(20);
	JLabel lmath=new JLabel();
	JTextField tmath=new JTextField(20);
	JLabel lscience=new JLabel();
	JTextField tscience=new JTextField(20);
	JLabel lenglish=new JLabel();
	JTextField tenglish=new JTextField(20);
	JLabel lcomp=new JLabel();
	JTextField tcomp=new JTextField(20);
	
	public reportcard()
	{
		lname.setText("Enter Name");
		jp.add(lname);
		jp.add(tname);
		lmath.setText("Enter Math Marks");
		jp.add(lmath);
		jp.add(tmath);
		lscience.setText("Enter Science Marks");
		jp.add(lscience);
		jp.add(tscience);
		lenglish.setText("Enter Englis Marks");
		jp.add(lenglish);
		jp.add(tenglish);
		lcomp.setText("Enter Computer Marks");
		jp.add(lcomp);
		jp.add(tcomp);
		jp.add(bsubmit);
		add(jp);
		bsubmit.addActionListener(new ActionListener()
                 {
			public void actionPerformed(ActionEvent arg0)
                           {
				String val=tname.getText();
				JLabel l1=new JLabel("Welcome"+val);
				int sub1=Integer.parseInt(tmath.getText());
				int sub2=Integer.parseInt(tscience.getText());
				int sub3=Integer.parseInt(tenglish.getText());
				int sub4=Integer.parseInt(tcomp.getText());
				int sum=sub1+sub2+sub3+sub4;
				float average=sum/4;
				JLabel l2=new JLabel("\nAverage="+average);
				JPanel jip=new JPanel();
				jip.add(l1);
				jip.add(l2);
				JFrame inf=new JFrame();
				inf.setVisible(true);
				inf.add(jip);
				inf.setSize(300,100);
				
							
				
			}
		});
		
	}
public static void main (String[] args){
	reportcard rc= new reportcard();
	rc.setSize(900,600);
	rc.setVisible(true);
}}
