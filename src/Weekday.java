import javax.swing.JOptionPane;

public class Weekday {
	public static void main(String[] args) {
		String questionV = JOptionPane.showInputDialog("Is it a weekday?");
		String questionW = "";
		if (questionV.equals("yes")) {
			questionW = JOptionPane.showInputDialog("Since it's a weekday, are you on vacation?");
		} else {
			JOptionPane.showMessageDialog(null, "Wake up!");
		}
		if (questionW.equals("yes")) {
			JOptionPane.showMessageDialog(null,"Sleep in");

		}
	}
}