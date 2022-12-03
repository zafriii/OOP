
// fig 3.13
import javax.swing.JOptionPane;

public class NameDialog {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(" what's your name? ");

        String message = String.format(
                "Congratilations ,%s, You got 10 out of 10 on attendance, Cause your course teacher fuad bro is a cool person ! ",
                name);

        JOptionPane.showMessageDialog(null, message);
    }
}
