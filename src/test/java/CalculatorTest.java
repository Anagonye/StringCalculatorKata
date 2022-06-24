import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


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
    void test_add_when_given_argument_has_more_than_two_numbers_should_throw_illegal_argument_exception(){
        //given
        String argument = "3,4,6";

        //then
        Assertions.assertThrows(IllegalArgumentException.class, () -> Calculator.Add(argument));
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

    @Test
    void test_add_when_given_argument_has_numbers_separated_by_something_else_than_commas_should_return_illegal_argument_exception(){
        //given
        String argument = "4!5";
        String argument2 = "4;5";
        String argument3 = "4.5";

        //then
        Assertions.assertThrows(IllegalArgumentException.class, () -> Calculator.Add(argument));
        Assertions.assertThrows(IllegalArgumentException.class, () -> Calculator.Add(argument2));
        Assertions.assertThrows(IllegalArgumentException.class, () -> Calculator.Add(argument3));
    }


}