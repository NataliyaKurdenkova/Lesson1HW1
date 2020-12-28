package Lesson7.online;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingsWindow extends JFrame {
    private static final int WINDOW_WIDTH=350;
    private static final int WINDOW_HEIGHT=370;

    private static final int MIN_FIELD_SIZE = 3;
    private static final int MAX_FIELD_SIZE = 10;
    private static final int MIN_WIN_LENGTH = 3;

    private static final String WIN_LENGTH_PREFIX = "Длина выигрышной комбинации ";
    private static final String FIELD_SIZE_PREFIX = "Размер поля ";

    private JRadioButton humVsAI;
    private JRadioButton humVsHum;

    private JSlider sliderFieldSize;
    private JSlider sliderWinLength;

    private MainWindow mainWindow;
    //конструктор окна в которое мы передаем главное окно, чтобы взять из него параметры для отображения этого окна ровно посередине
    SettingsWindow(MainWindow mainWindow){
        this.mainWindow=mainWindow;
        setSize(WINDOW_WIDTH,WINDOW_HEIGHT); // получаем размер
        Rectangle mainWindowBounds = mainWindow.getBounds();// рисуем прямоугольник
        // высчитываем позицию
        int posX = (int) mainWindowBounds.getCenterX() - WINDOW_WIDTH / 2; // центр-половина ширины
        int posY = (int) mainWindowBounds.getCenterY() - WINDOW_HEIGHT / 2;// центр-половина длины
        // встаем в позицию
        setLocation(posX, posY);
        //запрещаем изменение размеров окна
        setResizable(false);
        //заголовок
        setTitle("Параметры новой игры");
        //выбираем компоновщик 10 строк, 1 столбец
        setLayout(new GridLayout(10, 1));
        //вызываем метод для отображения выбра режима игры
        addGameModeControl();
        //вызываем метод для отображения слайдеров выбора размера карты и выйгрышной позиции
        addFieldWinControl();
        //создаем новую кнопку
        JButton btnStart = new JButton("Начать новую игру");
        //отрабатывапем ее нажатие
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnStartClick();
            }
        });
        //добавляем эту кнопку на форму
        add(btnStart);

    }
    //метод для выбора режима игры
    private void addGameModeControl(){
        add(new JLabel("Выберите режим игры"));
        humVsAI = new JRadioButton("Человек против ИИ", true);
        humVsHum = new JRadioButton("Человек против Человека");
        ButtonGroup gameMode = new ButtonGroup();
        gameMode.add(humVsAI);
        gameMode.add(humVsHum);
        add(humVsAI);
        add(humVsHum);
    }
    //метод со слайдерами для выбора размера поля и выйграшной комбинации
    private void addFieldWinControl() {
        //отображение минимальных параметров в лейблах
        JLabel lbFieldSize = new JLabel(FIELD_SIZE_PREFIX + MIN_FIELD_SIZE);
        JLabel lbWinLength = new JLabel(WIN_LENGTH_PREFIX + MIN_WIN_LENGTH);
// создание слайдера с указанием минимального значения, максимального и текущего выйграшной комбинации
        sliderWinLength = new JSlider(MIN_WIN_LENGTH, MIN_FIELD_SIZE, MIN_FIELD_SIZE);
       //обработка переключения слайдера для отображения выйграшной комбинации
        sliderWinLength.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lbWinLength.setText(WIN_LENGTH_PREFIX + sliderWinLength.getValue());
            }
        });
//создание слайдера для задания значения размера поля
        sliderFieldSize = new JSlider(MIN_FIELD_SIZE, MAX_FIELD_SIZE, MIN_FIELD_SIZE);

      //обработка события измененния значения слайдера для выбора размера поля
        sliderFieldSize.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int currentValue = sliderFieldSize.getValue();
                lbFieldSize.setText(FIELD_SIZE_PREFIX + currentValue);
                sliderWinLength.setMaximum(currentValue);
            }
        });
//добавление на форму лейблов и слайдера для отображения размера игрового поля
        add(new JLabel("Выберите размер поля"));
        add(lbFieldSize);
        add(sliderFieldSize);
//добавление на форму лейблов и слайдера для выбора выйграшной комбинации (то есть сколько х или 0 нужно собрать в ряд)
        add(new JLabel("Выберите выигрушную комбинацию"));
        add(lbWinLength);
        add(sliderWinLength);
    }
//метод
    private void btnStartClick() {
       // отпределение режима игры и передача его на форму GameMap
        int gameMode;

        if (humVsAI.isSelected()) {
            gameMode = GameMap.GAME_MODE_PVE;
        } else if (humVsHum.isSelected()) {
            gameMode = GameMap.GAME_MODE_PVP;
        } else {
            throw new RuntimeException("Неизвестный тип режима игры");
        }
//получение значений слайдеров
        int fieldSize = sliderFieldSize.getValue();
        int winLength = sliderWinLength.getValue();


//вызов метода, который передаст форме MainWindows значения режим игры размер поля по х по у (они равны) и длинну выйграшной комбинации
        mainWindow.startNewGame(gameMode, fieldSize, fieldSize, winLength);

    }


}
