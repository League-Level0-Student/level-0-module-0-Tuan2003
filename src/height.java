import javax.swing.JOptionPane;

public class height {
	public static void main(String[] args) {
		String height = JOptionPane.showInputDialog("How tall are you?");
		int height2 = Integer.parseInt(height);
		if (height2 > 60) {
			JOptionPane.showMessageDialog(null, "You are tall enough to ride the roller coaster");
		} else {
			JOptionPane.showMessageDialog(null, "You are too short to ride the roller coaster");
		}
	}
}
