package SST;

import javax.swing.*;
import java.awt.*;

public class ScanCanvas extends JFrame {

    ScanCanvas(){
        super("defCanvas");

        Canvas canvas = new Canvas() {
            public void paint(Graphics graphics) {
                graphics.setColor(Color.white);
                graphics.setFont(new Font("White Rabbit", 1, 20));
            }
        };

        canvas.setBackground(Color.getHSBColor(236, 50, 26));

        add(canvas);
        setSize(400, 300);
        setVisible(true);
    }

    ScanCanvas(String canvasTitle){
        super(canvasTitle);

        Canvas canvas = new Canvas() {
            public void paint(Graphics graphics) {
                graphics.setColor(Color.white);
                graphics.setFont(new Font("White Rabbit", 1, 20));
            }
        };

        canvas.setBackground(Color.getHSBColor(236, 50, 26));

        add(canvas);
        setSize(400, 400);
        setVisible(true);
    }

    ScanCanvas(String canvasTitle, int canvasWidth, int canvasHeight){
        super(canvasTitle);

        Canvas canvas = new Canvas() {
            public void paint(Graphics graphics) {
                graphics.setColor(Color.white);
                graphics.setFont(new Font("White Rabbit", 1, 20));
            }
        };

        canvas.setBackground(Color.getHSBColor(236, 50, 26));

        add(canvas);
        setSize(canvasWidth, canvasHeight);
        setVisible(true);
    }
}
