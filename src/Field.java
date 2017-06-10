/**
 * Created by Серов on 10.06.2017.
 */
import java.awt.*;
import java.awt.geom.*;

class Field {
    private final int FIELD_SIZE;
    private final int CELL_SIZE;
    private final char HUMAN_DOT = 'x';
    private final char AI_DOT = 'o';
    private final char EMPTY_DOT = '.';
    private final String MSG_DRAW = "Draw, sorry...";
    private final String MSG_HUMAN_WON = "YOU WON!";
    private final String MSG_AI_WON = "AI WON!";
    private char[][] field;
    private String gameOverMsg;

    Field(int field_size, int cell_size) {
        FIELD_SIZE = field_size;
        CELL_SIZE = cell_size;
        field = new char[FIELD_SIZE][FIELD_SIZE];
        init();
    }
}
