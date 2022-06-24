import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;


class CalculatorTest {

    @Test
    void test_add_when_given_argument_is_empty_string_should_return_0() {
        //given
        String argument = "";

        //then
        Assertions.assertEquals(0, Calculator.Add(argument));
    }

    @Test
    void test_add_when_given_argument_has_single_number_should_return_that_number(){
        //given
        String argument = "5";

        //then
        Assertions.assertEquals(5, Calculator.Add(argument));
    }

    @Test
    void test_add_when_given_argument_has_two_numbers_separated_by_comma_should_return_sum_of_them(){
        //given
        String argument = "4,6";

        //then
        Assertions.assertEquals(10, Calculator.Add(argument));

    }


    @Test
    void test_add_when_given_argument_is_null_should_throw_null_pointer_exception(){
        //given
        String argument = null;

        //then
        Assertions.assertThrows(NullPointerException.class, () -> Calculator.Add(argument));
    }


    @Test
    void test_add_when_given_argument_has_letters_instead_of_numbers_should_throw_illegal_argument_exception(){
        //given
        String argument = "x,y";

        //then
        Assertions.assertThrows(IllegalArgumentException.class, () -> Calculator.Add(argument));
    }

    @ParameterizedTest
    @ValueSource(strings = {"4!5","4;5","4.5"})
    void test_add_when_given_argument_has_numbers_separated_by_something_else_than_commas_should_return_illegal_argument_exception(String argument){

        Assertions.assertThrows(IllegalArgumentException.class, () -> Calculator.Add(argument));
    }
    @ParameterizedTest
    @CsvSource({
            "90, '4,1,12,6,67'",
            "11, '5,4,2'",
            "3, '1,2'",
            "1, '1'",
            "125, '15,10,70,4,1,12,13'",
            "0, ''",
            "0, '0'",
            "1024, '18,121,93,5,246,2,3,4,5,333,24,23,22,125",
            "125, '15,10\n70,4\n1,12\n13'",
            "90, '4,1,12\n6,67'",
            "1024, '18\n121,93,5,246\n2,3,4,5,333,24,23,22,125",


    })
    void test_add_when_given_argument_has_unknown_number_of_numbers(int expected, String argument){

        Assertions.assertEquals(expected, Calculator.Add(argument));
    }







}