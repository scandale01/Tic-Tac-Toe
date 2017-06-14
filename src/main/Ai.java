package main; /**
 * Created by Серов on 14.06.2017.
 */
import java.util.*;

class Ai {
    Random random = new Random();
    private final char DOT;

    Ai(char ch) { DOT = ch; }

    void turn(Field field) {
        int x, y;
        do {
            x = random.nextInt(field.getSize());
            y = random.nextInt(field.getSize());
        } while (!field.isCellEmpty(x, y));
        field.setDot(x, y, DOT);
    }
}