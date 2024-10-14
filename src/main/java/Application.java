import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        try {
            Game game = new Game(); // Create a new Game object
            game.run(); // Run the game
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

