import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestingGame<expected> {
    @Test
    public void Tests() {
        Players Players = new Players(false, 3);

        String[] players = {"Vasya 5", "Kolya 0", "Petya 2"};


        String[] expected = {"Kolya","Petya"};
        String[] actual = Players.winners(players);


        Assertions.assertArrayEquals(expected, actual);
    }
}


