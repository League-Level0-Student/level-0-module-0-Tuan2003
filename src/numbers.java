import javax.swing.JOptionPane;

public class numbers {
public static void main(String[] args) {
String numbers = JOptionPane.showInputDialog("Enter a number");
int numbers2 = Integer.parseInt(numbers);
String numbers1 = JOptionPane.showInputDialog("Enter another number");
int numbers3 = Integer.parseInt(numbers1);

JOptionPane.showMessageDialog(null, numbers2 + numbers3);

}
}
