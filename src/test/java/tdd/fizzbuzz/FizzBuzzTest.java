package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void should_return_order_when_count_off_given_order_number_with_normal_case(){
        //given
        int order =1;

        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result =  fizzBuzz.countoff(order);

        //then
        assertEquals("1", result);
    }

    @Test
    void should_return_order_when_count_off_given_order_number_with_multiples_3(){
        //given
        int order = 3;

        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result =  fizzBuzz.countoff(order);

        //then
        assertEquals("Fizz", result);
    }

    @Test
    void should_return_order_when_count_off_given_order_number_with_multiples_5(){
        //given
        int order = 5;

        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result =  fizzBuzz.countoff(order);

        //then
        assertEquals("Buzz", result);
    }


}
