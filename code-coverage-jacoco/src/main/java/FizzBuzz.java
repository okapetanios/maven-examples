/**
 * @author Petri Kainulainen
 */
public class FizzBuzz {

    public static final String PASSWORD = "password";

    public String getFizzBuzzWord(int number) {
        StringBuilder fizzBuzzWord = new StringBuilder();

        if (number % 3 == 0) {
            fizzBuzzWord.append("Fizz");
        }

        if (number % 5 == 0) {
            fizzBuzzWord.append("Buzz");
        }

        return (fizzBuzzWord.length() == 0) ? null : fizzBuzzWord.toString();
    }

    //  NEW LINES TO TRIGGER SONAR CLOUD ANALYSIS - MUST BE GREATER THAN 20 LINES OF NEW CODE
     public String getFizzBuzzWord(int number) {
        StringBuilder fizzBuzzWord = new StringBuilder();

        if (number % 3 == 0) {
            fizzBuzzWord.append("Fizz");
        }

        if (number % 5 == 0) {
            fizzBuzzWord.append("Buzz");
        }

        return (fizzBuzzWord.length() == 0) ? null : fizzBuzzWord.toString();
    }
     public String getFizzBuzzWord(int number) {
        StringBuilder fizzBuzzWord = new StringBuilder();

        if (number % 3 == 0) {
            fizzBuzzWord.append("Fizz");
        }

        if (number % 5 == 0) {
            fizzBuzzWord.append("Buzz");
        }

        return (fizzBuzzWord.length() == 0) ? null : fizzBuzzWord.toString();
    }
    //  END NEW CODE TO TRIGGER ANALYSIS BY SONARCLOUD.
}
