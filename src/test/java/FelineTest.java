import com.example.Feline;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class FelineTest {

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
}