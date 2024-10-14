import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;
import java.io.IOException;

public class Game {
    private final Screen screen;

    // Constructor to initialize the terminal and screen
    public Game() throws IOException {
        Terminal terminal = new DefaultTerminalFactory().createTerminal();
        screen = new TerminalScreen(terminal);
        screen.setCursorPosition(null);
        screen.startScreen();
        screen.doResizeIfNecessary();
        KeyStroke key = screen.readInput();

    }

    private void draw() throws IOException {
        screen.clear(); // Clear the screen
        int x = 10;
        int y = 10;
        screen.setCharacter(x, y, TextCharacter.fromCharacter('X')[0]);
        screen.refresh(); // Refresh to display changes
    }

    public void run() throws IOException {
        draw(); // Call the draw method
         //read a key stroke and send it to  processkey method
    }

    private void processKey(KeyStroke key) {
        System.out.println(key);
    }
}
