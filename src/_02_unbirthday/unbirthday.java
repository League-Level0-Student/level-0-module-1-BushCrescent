package _02_unbirthday;
import javax.swing.JOptionPane;
public class unbirthday {
	public static void main(String[] args) {
String birthday = JOptionPane.showInputDialog("When is your birthday? (mm/dd) ");
if(birthday.equals("11/02")) {
	JOptionPane.showMessageDialog(null, "Happy Brithday!");
}else {
	JOptionPane.showMessageDialog(null, "Ha sucker it's not your birthday");
}
	}
}