import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test
    public void test() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Movie 1");
        manager.addFilm("Movie 11");
        manager.addFilm("Movie 3");

        String[] expected = {"Movie 1", "Movie 11", "Movie 3"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLast() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Movie 1");
        manager.addFilm("Movie 11");
        manager.addFilm("Movie 3");

        String[] expected = {"Movie 3", "Movie 11", "Movie 1"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
}
