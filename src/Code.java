import javax.swing.JOptionPane;

public class Code {
public static void main(String[] args) {
String codePro = JOptionPane.showInputDialog("Do you know how to code?");
if(codePro.equals("yes")) {
JOptionPane.showMessageDialog(null,"You will rule the world!");
}else {
JOptionPane.showMessageDialog(null,"You should go practice mop some floors!");

}
}
}
