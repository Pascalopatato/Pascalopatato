package Chess;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

public class ChessFrame extends JFrame {
    private static final long serialVersionUID = 1L;
    private ChessBoardPanel chessBoard;

    public ChessFrame() {
        setTitle("Chess Game"); // Set the title of the window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit application when window is closed
        setBounds(100, 100, 650, 650); // Size of the frame

        // Create the main panel with black background
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(new Color(0, 0, 0)); // Black background
        mainPanel.setLayout(new BorderLayout()); // Use BorderLayout

        // Create and add chessboard
        chessBoard = new ChessBoardPanel(); 
        mainPanel.add(chessBoard, BorderLayout.CENTER); // Add chessboard to the center of the panel
        
        // Set the content pane to the main panel
        setContentPane(mainPanel);
        
        // Set the frame's background color to black
        setBackground(new Color(0, 0, 0)); // Black background for the frame
        
        // Ensure the frame is visible
        setVisible(true);
    }
}
