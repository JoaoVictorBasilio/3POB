package secao4;

import java.util.*;
import javax.swing.JLabel;

public class AddImport {

    public static void main(String args[]) {
        JLabel label = new JLabel("hello");
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();

        System.out.println(label.getText());
        System.out.println(date);
    }

}
