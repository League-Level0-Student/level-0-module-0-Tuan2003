import javax.swing.JOptionPane;

public class wordNumber {
public static void main(String[] args) {
	String word = JOptionPane.showInputDialog("Enter a word");
	String times = JOptionPane.showInputDialog("Enter a number");
	int times2 = Integer.parseInt(times);
	for (int i=0;i<times2;i++) {
		
		System.out.print(word);
}
}
}