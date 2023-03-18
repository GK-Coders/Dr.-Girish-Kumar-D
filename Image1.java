import javax.swing.*;
import java.awt.*;
public class Image1 extends JFrame
{
public static void main(String[] args)
{
JFrame jf=new JFrame("Image Icon"); 
jf.setLayout(null);
Icon icon = new ImageIcon("GK.JPG");
JLabel label1= new JLabel("Welcome AIML  ",icon,JLabel.CENTER);
label1.setBounds(200, 200, 600, 600);
//label1.setBounds(120, 120, 464, 444); 

jf.add(label1);
jf.setSize(800,800); jf.setVisible(true);
}
}