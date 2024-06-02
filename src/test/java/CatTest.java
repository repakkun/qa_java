import com.example.Cat;
import com.example.Feline;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CatTest {

    @ParameterizedTest
    @MethodSource("foodProvider")
    public void testGetFood(List<String> expectedFood) throws Exception {
        Feline mockFeline = mock(Feline.class);
        when(mockFeline.eatMeat()).thenReturn(expectedFood);

        Cat cat = new Cat(mockFeline);
        List<String> foodList = cat.getFood();
        assertEquals(expectedFood, foodList);
    }

    static Stream<Arguments> foodProvider() {
        return Stream.of(
                Arguments.of(List.of("Животные", "Птицы", "Рыба")),
                Arguments.of(List.of("Мясо", "Кости")),
                Arguments.of(List.of("Насекомые", "Птицы"))
        );
    }

    @ParameterizedTest
    @MethodSource("soundProvider")
    public void testGetSound(String expectedSound) throws Exception {
        Feline mockFeline = mock(Feline.class);

        Cat cat = new Cat(mockFeline);
        String sound = cat.getSound();
        assertEquals(expectedSound, sound);
    }

    static Stream<Arguments> soundProvider() {
        return Stream.of(
                Arguments.of("Meow")
        );
    }
}