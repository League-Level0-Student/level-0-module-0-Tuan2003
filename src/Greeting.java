import javax.swing.JOptionPane;

public class Greeting {
public static void main(String[] args) {
String userName = JOptionPane.showInputDialog("What's your name?");	
if(userName.equals("Trump")) {
	JOptionPane.showMessageDialog(null, "Greetings president Trump!"");"
}else {
	JOptionPane.showMessageDialog(null, "You are not the president! Begone!");
}
}
}
