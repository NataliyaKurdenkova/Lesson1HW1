package Lesson7.online;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {
    private static final int WIN_WIDTH=500;
    private static final int WIN_HEIGHT=500;
    private static final int WIN_POS_X=350;
    private static final int WIN_POS_Y=250;
    //ссылка на класс
    private SettingsWindow winSettings;
    private GameMap gameMap;
    MainWindow() {

        //параметры самого окна

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//действие на кнопку крестик
        setSize(WIN_WIDTH,WIN_HEIGHT);//высота и ширина окна
        setLocation(WIN_POS_X,WIN_POS_Y);//позиция окна
        setTitle("Игра Крестики-Нолики");// название окна
        setResizable(false);//запрет (false) изменения размера окна, если true, то можно изменять
        
        //создание экземпляра класса
        winSettings=new SettingsWindow(this);
        //gameMap= new GameMap();
        gameMap= new GameMap(5);
        //обработка событий (нажатие кнопок)
        JButton btnStartGame=new JButton("Новая игра");
        btnStartGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                winSettings.setVisible(true);
            }
        });

        JButton btnClose=new JButton("Закрыть игру");
        btnClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        //setLayout(new GridLayout(2,2));
        JPanel panelButton =new JPanel();
        panelButton.setLayout(new GridLayout(1,2));
        panelButton.add(btnStartGame);
        panelButton.add(btnClose);

        //добавление на окно
        add(panelButton, BorderLayout.SOUTH);
        add(gameMap);
        //окно стало видимым
        setVisible(true);




    }
    //метод для запуска окна с настройками игры
    void startNewGame(int modGame,int fieldSizeX,int fieldSizeY, int winLength){

        //gameMap= new GameMap(fieldSizeX);
        //add(gameMap);
        gameMap.startGame(modGame,fieldSizeX,fieldSizeY,winLength);


    }
}
