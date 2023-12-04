import javax.swing.*;
import java.awt.*;
import java.util.Map;
import SST.Quadrant;

public class LongRangeScan {
    public void scan(Quadrant quadrant) {
        // Implement logic for long-range scanning
        // This could involve displaying information about entities in the quadrant
        // For simplicity, let's assume displaying entity names and positions

        JFrame frame = new JFrame("Long Range Scanner");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 400);

        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);

        // Get the entities in the quadrant
        Map<String, Entity> entities = quadrant.getEntities();

        // Display information about each entity
        for (Entity entity : entities.values()) {
            Position2D position = entity.getPosition();
            String entityInfo = entity.getName() + " - Position: (" + position.getX() + ", " + position.getY() + ")\n";
            textArea.append(entityInfo);
        }

        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}

