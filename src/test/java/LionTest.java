import com.example.Animal;
import com.example.Lion;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LionTest {

    @Mock
    private Animal animal;

    private Lion lion;

    @BeforeEach
    void setUp() throws Exception {
        MockitoAnnotations.initMocks(this); // Инициализация моков
        lion = new Lion("Самец", animal);
    }


    @Test
    void lionShouldReturnCorrectFood() throws Exception {
        // Определяем поведение мок-объекта при вызове метода getFood()
        when(animal.getFood("predator")).thenReturn(List.of("Животные", "Птицы", "Рыба"));

        // Вызываем метод getFood() у объекта Lion и проверяем, что он возвращает ожидаемый результат
        assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }

    @Test
    void lionShouldReturnCorrectKittensCount() throws Exception {
        // Определяем поведение мок-объекта при вызове метода getKittens()
        when(animal.getKittens()).thenReturn(3);

        // Вызываем метод getKittens() у объекта Lion и проверяем, что он возвращает ожидаемый результат
        assertEquals(3, lion.getKittens());
    }

    @Test
    void lionShouldHaveManeForMale() throws Exception {
        Animal animalMock = mock(Animal.class);
        Lion lion = new Lion("Самец", animalMock);

        boolean hasMane = lion.doesHaveMane();

        assertTrue(hasMane);
    }

    @Test
    void lionShouldNotHaveManeForFemale() throws Exception {
        Animal animalMock = mock(Animal.class);
        Lion lion = new Lion("Самка", animalMock);

        boolean hasMane = lion.doesHaveMane();

        assertFalse(hasMane);
    }

    @Test
    void lionShouldThrowExceptionForUnexpectedSex() {
        Animal animalMock = mock(Animal.class);

        assertThrows(Exception.class, () -> new Lion("Unexpected", animalMock));
    }
}
