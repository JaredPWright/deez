package SST;

import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import java.awt.*;

public class ScanCanvas extends JFrame {

    ScanCanvas(String canvasTitle, int canvasWidth, int canvasHeight) {
        super(canvasTitle);

        Canvas canvas = new Canvas() {
            public void paint(Graphics graphics) {
                int gridSize = 40;  // Adjust this value for the grid size
                int sectorX = 6;   // Coordinates of the "Sector"
                int sectorY = 7;

                graphics.setColor(Color.white);
                graphics.fillRect(0, 0, canvasWidth, canvasHeight);

                graphics.setColor(Color.black);

                // Draw the grid of dots
                for (int y = 0; y < canvasHeight; y += gridSize) {
                    for (int x = 0; x < canvasWidth; x += gridSize) {
                        graphics.fillOval(x, y, 5, 5);
                    }
                }

                // Draw the asterisks and text
                for (int y = 0; y < canvasHeight; y += gridSize) {
                    for (int x = 0; x < canvasWidth; x += gridSize) {
                        if (x / gridSize == sectorX && y / gridSize == sectorY) {
                            graphics.drawString("Sector (" + sectorX + ", " + sectorY + ")", x, y + gridSize);
                        } else if (x / gridSize == 3 && y / gridSize == 6) {
                            graphics.drawString("<e />", x, y + gridSize);
                        } else if (x / gridSize == 7 && y / gridSize == 6) {
                            graphics.drawString("<E>.", x, y + gridSize);
                        } else {
                            graphics.drawString("*", x, y + gridSize);
                        }
                    }
                }
            }
        };

        canvas.setBackground(Color.getHSBColor(236, 50, 26));

        add(canvas);
        setSize(canvasWidth, canvasHeight);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ScanCanvas("Custom Pattern", 320, 320);
        });
    }
}
