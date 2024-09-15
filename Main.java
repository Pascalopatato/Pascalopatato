package Chess;

import java.awt.EventQueue;

public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ChessFrame frame = new ChessFrame(); // Create the main frame
                    frame.setVisible(true); // Make the frame visible
                } catch (Exception e) {
                    e.printStackTrace(); // Handle any exceptions
                }
            }
        });
    }
}
