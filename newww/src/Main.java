import java.awt.*;
import java.io.CharArrayReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Main extends Frame {
    public static void main(String[] args) throws IOException {
        Main frame = new Main();
        Button b1 = new Button("button 1");
        Button b2 = new Button("button 2");
        Button b3 = new Button("button 3");
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);

        frame.setLayout(new FlowLayout());
        frame.setLayout(new GridLayout(2,2));
        frame.setSize(300,200);
        frame.setVisible(true);


    }
}