package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void should_return_order_when_count_off_given_order_number_normal_case(){
        //given
        int order =1;

        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result =  fizzBuzz.countoff(order);

        //then
        assertEquals("1", result);
    }


}
