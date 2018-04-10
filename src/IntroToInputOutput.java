
import javax.swing.JOptionPane;

public class IntroToInputOutput {
 public static void main(String[] args) {
  JOptionPane.showMessageDialog(null,"Press F to pay respect");
  System.out.print("bug!");
  System.out.println("bug2");
  System.out.println("bug3");
  String CreditCardInfo = JOptionPane.showInputDialog("Insert Credit Card Information Here");
  JOptionPane.showMessageDialog(null,"Thanks for your credit card information!"+ CreditCardInfo+" Thanks");
  System.out.println(CreditCardInfo);
  
 }
}
