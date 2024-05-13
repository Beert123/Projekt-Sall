package Tests;
import application.model.Fad;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FadTest {

    @Test
    void shouldIncreaseFadContentWhenSpaceIsAvailable() {
        Fad fad = new Fad("Benns kælder", "Sherry", 1, "Spanien", "Ola", 100);
        fad.fyldPåFad(50);
        assertEquals(50, fad.getMængdePåFad());
    }

    @Test
    void shouldNotIncreaseFadContentWhenNoSpaceIsAvailable() {
        Fad fad = new Fad("history", "previousUse", 1, "store", "fadName", 100);
        fad.fyldPåFad(101);
        assertEquals(0, fad.getMængdePåFad());
    }

    @Test
    void shouldFillFadToCapacityWhenExactAmountIsAdded() {
        Fad fad = new Fad("history", "previousUse", 1, "store", "fadName", 100);
        fad.fyldPåFad(100);
        assertEquals(100, fad.getMængdePåFad());
    }

    @Test
    void shouldNotChangeFadContentWhenZeroIsAdded() {
        Fad fad = new Fad("history", "previousUse", 1, "store", "fadName", 100);
        fad.fyldPåFad(0);
        assertEquals(0, fad.getMængdePåFad());
    }
}