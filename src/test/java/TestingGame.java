import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestingGame<expected> {
    @Test
    public void Tests() {
        Players Players = new Players();

        String[] players = {"Vasya 5", "Kolya 0", "Petya 2"};
        Players.maxSpeed = 3;

        String[] expected = {"Kolya"};
        String[] actual = Players.players(players);


        Assertions.assertArrayEquals(expected, actual);
    }
}


