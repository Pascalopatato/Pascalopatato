package Chess;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

public class ChessBoardPanel extends JPanel {
    private static final long serialVersionUID = 1L;
    private JPanel[] squares = new JPanel[64]; // Array to hold the squares

    private Color lightTileColor = new Color(169, 169, 169); // Medium gray color
    private Color darkTileColor = new Color(105, 105, 105); // Dark gray color

    public ChessBoardPanel() {
        setLayout(new GridLayout(8, 8)); // 8x8 grid for chessboard
        setPreferredSize(new Dimension(600, 600)); // Larger size for the chessboard
        setBackground(new Color(0, 0, 0)); // Black background for the board itself
        initializeBoard();
    }

    private void initializeBoard() {
        boolean light = true;
        for (int i = 0; i < 64; i++) {
            JPanel square = new JPanel();
            square.setPreferredSize(new Dimension(75, 75)); // Size of squares
            square.setBackground(light ? lightTileColor : darkTileColor); // Set color
            square.setBorder(null); // Remove borders from the squares
            squares[i] = square; // Store reference to the square
            add(square);
            light = !light; // Alternate color
            if (i % 8 == 7) light = !light; // Switch color at the end of each row
        }
    }

    // Method to set the color of the light tiles
    public void setLightTileColor(Color color) {
        this.lightTileColor = color;
        updateBoardColors();
    }

    // Method to set the color of the dark tiles
    public void setDarkTileColor(Color color) {
        this.darkTileColor = color;
        updateBoardColors();
    }

    // Method to update the colors of the tiles
    private void updateBoardColors() {
        boolean light = true;
        for (int i = 0; i < 64; i++) {
            squares[i].setBackground(light ? lightTileColor : darkTileColor); // Update color
            light = !light; // Alternate color
            if (i % 8 == 7) light = !light; // Switch color at the end of each row
        }
    }
}
