import static org.junit.Assert.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;
import com.example.Feline;

public class FelineTest {

    @Test
    public void testEatMeat() throws Exception {
        Feline feline = new Feline();
        feline.getFood("Predator");
        List<String> foodList = feline.eatMeat();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), foodList);
    }


    @Test
    public void testGetFamily() {
        Feline feline = new Feline();
        String family = feline.getFamily();
        assertEquals("CatMeow", family);
    }

    @Test
    public void testGetKittens() {
        Feline feline = new Feline();
        int kittensCount = feline.getKittens();
        assertEquals(1, kittensCount);
    }
}