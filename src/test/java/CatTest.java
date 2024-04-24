import com.example.Cat;
import com.example.Feline;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CatTest {

    @Mock
    private Feline feline;

    private Cat cat;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this); // Инициализация моков
        cat = new Cat(feline);
    }

    @ParameterizedTest
    @MethodSource("provideFood")
    void catShouldReturnCorrectFood(List<String> expectedFood) throws Exception {
        when(feline.eatMeat()).thenReturn(expectedFood);
        assertEquals(expectedFood, cat.getFood());
    }

    private static Stream<Arguments> provideFood() {
        return Stream.of(
                Arguments.of((Object) List.of("Животные", "Птицы", "Рыба")),
                Arguments.of((Object) List.of("Кролики", "Птицы", "Рыба"))
        );
    }

    @Test
    void catShouldReturnCorrectSound() {
        Feline felineMock = mock(Feline.class);
        Cat cat = new Cat(felineMock);

        String sound = cat.getSound();

        assertEquals("Mew", sound);
    }
}
