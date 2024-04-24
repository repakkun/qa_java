import com.example.Feline;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FeelineTest {

    @Test
    void felineShouldReturnCorrectFoodForCarnivore() throws Exception {
        // Arrange
        Feline feline = new Feline();

        // Act
        int foodCount = feline.eatMeat().size();

        // Assert
        assertEquals(3, foodCount);
    }


    @Test
    void felineShouldReturnCorrectFamily() {
        // Arrange
        Feline feline = new Feline();

        // Act
        String family = feline.getFamily();

        // Assert
        assertEquals("feline", family);
    }

    @Test
    void felineShouldReturnOneKitten() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }

    @Test
    void felineShouldReturnTwoKittens() {
        Feline feline = new Feline();
        assertEquals(2, feline.getKittens(2));
    }

    @Test
    void felineShouldReturnThreeKittens() {
        Feline feline = new Feline();
        assertEquals(3, feline.getKittens(3));
    }
}
