import javax.swing.*;
import java.awt.*;

public class ScreenView {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        Container pane = frame.getContentPanel();
        pane.setLayout(new BorderLayout());
    }
    
    frame.setSize(800, 1020);
    frame.setVisible(true);
}
