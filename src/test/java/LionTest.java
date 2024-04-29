import com.example.Lion;
import com.example.Predator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class LionTest {

    private Lion lion;

    @Mock
    private Predator predator;

    @BeforeEach
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        when(predator.getKittens()).thenReturn(3);

        lion = new Lion("male", predator);
    }

    @Test
    public void testGetKittens() throws Exception {
        int kittens = lion.getKittens();
        assertEquals(3, kittens);
    }

    @Test
    public void testDoesHaveMane() {
        boolean hasMane = lion.doesHaveMane();
        assertEquals(true, hasMane);
    }

    @Test
    public void testGetFood() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        when(predator.eatMeat()).thenReturn(expectedFood);

        List<String> food = lion.getFood();
        assertEquals(expectedFood, food);
    }
}
