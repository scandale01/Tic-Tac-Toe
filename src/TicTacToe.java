/**
 * Created by Серов on 05.06.2017.
 */
import javax.swing.*;
import java.awt.*;
import  java.awt.event.*;
import java.lang.reflect.Field;

public class TicTacToe extends JFrame {
    final String TITLE_OF_PROGRAM = "Tic Tac Toe";
    final int START_POSITION = 300;
    final int WINDOW_SIZE = 300;
    final int WINDOW_DX = 9;
    final int WINDOW_DY = 57;
    final int FIELD_SIZE = 3;
    final int CELL_SIZE = WINDOW_SIZE / FIELD_SIZE;
    final String BTN_INIT = "New game";
    final String BTN_EXIT = "Exit";

    Canvas canvas = new Canvas();
    Field field = new Field(FIELD_SIZE, CELL_SIZE);
    Human human = new Human(field.getHumanDot());
    AI ai = new AI(field.getAIDot());

    public static void main(String args[]) {
        new TicTacToe();
    }

    TicTacToe() {
        setTitle(TITLE_OF_PROGRAM);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(START_POSITION, START_POSITION, WINDOW_SIZE + WINDOW_DX, WINDOW_SIZE + WINDOW_DY);

        canvas.setBackground(Color.white);
        canvas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
            }
        });
    }

}
