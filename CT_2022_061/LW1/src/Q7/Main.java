package Q7;
import javax.swing.JFrame;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main{
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("hh:mm:ss a");

        JFrame frame = new JFrame(time.format(format));
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}

