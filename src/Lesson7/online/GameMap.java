package Lesson7.online;

import javax.swing.*;
import java.awt.*;


public class GameMap extends JPanel {
    public static final int GAME_MODE_PVE = 1;
    public static final int GAME_MODE_PVP = 2;
    private GameMap gameMap;
    GameMap() {
        setBackground(Color.BLUE);


    }

    GameMap(int fieldSize) {
        setLayout(new GridLayout(fieldSize, fieldSize));
        JButton[][] jbn = new JButton[fieldSize][fieldSize];

        for (int y = 0; y < jbn.length; y++) {
            for (int x = 0; x < jbn.length; x++) {
                jbn[y][x] = new JButton("№" + x+y);
                add(jbn[y][x]);
            }
        }
        setVisible(true);
    }

    void startGame(int modGame, int fieldSizeX, int fieldSizeY, int winLength) {

        System.out.println("mode: " + modGame);
        System.out.println("fieldSizeX: " + fieldSizeX);
        System.out.println("fieldSizeY: " + fieldSizeY);
        System.out.println("winLength: " + winLength);


    }


}
