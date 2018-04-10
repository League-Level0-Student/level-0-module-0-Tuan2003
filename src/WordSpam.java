import javax.swing.JOptionPane;

public class WordSpam {
public static void main(String[] args) {
String wordL = JOptionPane.showInputDialog(null,"Enter a word you want repeated 1000 here!");


for (int i=0;i<1000;i++) {
	
	System.out.print(wordL);
}
}
}