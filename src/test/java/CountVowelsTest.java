import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class CountVowelsTest {
    @Test void lowercase() { assertEquals(2, CountVowels.countVowels("hello")); }
    @Test void uppercase() { assertEquals(5, CountVowels.countVowels("AEIOU")); }
    @Test void mixedCase() { assertEquals(5, CountVowels.countVowels("Education")); }
    @Test void noVowels() { assertEquals(0, CountVowels.countVowels("rhythm")); }
    @Test void emptyString() { assertEquals(0, CountVowels.countVowels("")); }
    @Test void nullInput() { assertThrows(IllegalArgumentException.class, () -> CountVowels.countVowels(null)); }
    @Test void spacesAndPunctuation() { assertEquals(3, CountVowels.countVowels("Hello, World!")); }
}
