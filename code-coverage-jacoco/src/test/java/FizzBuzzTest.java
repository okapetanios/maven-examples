import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertNull;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author Petri Kainulainen
 */
public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    // FizzBuzz

    @Test
    public void getFizzBuzzWord_NumberIsMultipleOfThree_ShouldReturnFizz() {
        assertThat(fizzBuzz.getFizzBuzzWord(3), is("Fizz"));
    }

    @Test
    public void getFizzBuzzWord_NumberIsMultipleOfFive_ShouldReturnBuzz() {
        assertThat(fizzBuzz.getFizzBuzzWord(5), is("Buzz"));
    }

    @Test
    public void getFizzBuzzWord_NumberIsMultipleOfThreeAndFive_ShouldReturnFizzBuzz() {
        assertThat(fizzBuzz.getFizzBuzzWord(15), is("FizzBuzz"));
    }

    @Test
    public void getFizzBuzzWord_NumberIsNotMultipleOfThreeOrFive_ShouldReturnNull() {
        assertNull(fizzBuzz.getFizzBuzzWord(4));
    }



    // 


    @Test
    public void getGizzBuzzWord_NumberIsMultipleOfThree_ShouldReturnFizz() {
        assertThat(fizzBuzz.getGizzBuzzWord(3), is("Fizz"));
    }

    @Test
    public void getGizzBuzzWord_NumberIsMultipleOfFive_ShouldReturnBuzz() {
        assertThat(fizzBuzz.getGizzBuzzWord(5), is("Buzz"));
    }

    @Test
    public void getGizzBuzzWord_NumberIsMultipleOfThreeAndFive_ShouldReturnFizzBuzz() {
        assertThat(fizzBuzz.getGizzBuzzWord(15), is("FizzBuzz"));
    }

    @Test
    public void getGizzBuzzWord_NumberIsNotMultipleOfThreeOrFive_ShouldReturnNull() {
        assertNull(fizzBuzz.getGizzBuzzWord(4));
    }

    // 
    @Test
    public void getHizzBuzzWord_NumberIsMultipleOfThree_ShouldReturnFizz() {
        assertThat(fizzBuzz.getHizzBuzzWord(3), is("Fizz"));
    }

    @Test
    public void getHizzBuzzWord_NumberIsMultipleOfFive_ShouldReturnBuzz() {
        assertThat(fizzBuzz.getHizzBuzzWord(5), is("Buzz"));
    }

    @Test
    public void getHizzBuzzWord_NumberIsMultipleOfThreeAndFive_ShouldReturnFizzBuzz() {
        assertThat(fizzBuzz.getHizzBuzzWord(15), is("FizzBuzz"));
    }

    @Test
    public void getHizzBuzzWord_NumberIsNotMultipleOfThreeOrFive_ShouldReturnNull() {
        assertNull(fizzBuzz.getHizzBuzzWord(4));
    }

    // 




    

}
