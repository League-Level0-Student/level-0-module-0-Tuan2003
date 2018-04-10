import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
String nameF =JOptionPane.showInputDialog("Enter your name here");
JOptionPane.showMessageDialog(null,"How is your morning," + nameF + " ? ");
}
}
