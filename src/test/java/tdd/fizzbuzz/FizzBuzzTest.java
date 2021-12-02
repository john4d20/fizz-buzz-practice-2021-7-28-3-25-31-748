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
        String result =  fizzBuzz.countOff(order);

        //then
        assertEquals("1", result);
    }

    @Test
    void should_return_order_when_count_off_given_order_number_with_multiples_3(){
        //given
        int order = 3;

        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result =  fizzBuzz.countOff(order);

        //then
        assertEquals("Fizz", result);
    }

    @Test
    void should_return_order_when_count_off_given_order_number_with_multiples_5(){
        //given
        int order = 5;

        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result =  fizzBuzz.countOff(order);

        //then
        assertEquals("Buzz", result);
    }

    @Test
    void should_return_order_when_count_off_given_order_number_with_multiples_7(){
        //given
        int order = 7;

        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result =  fizzBuzz.countOff(order);

        //then
        assertEquals("Whizz", result);
    }

    @Test
    void should_return_order_when_count_off_given_order_number_with_multiples_3_5(){
        //given
        int order = 15;

        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result =  fizzBuzz.countOff(order);

        //then
        assertEquals("FizzBuzz", result);
    }

    @Test
    void should_return_order_when_count_off_given_order_number_with_multiples_5_7(){
        //given
        int order = 35;

        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result =  fizzBuzz.countOff(order);

        //then
        assertEquals("BuzzWhizz", result);
    }

    @Test
    void should_return_order_when_count_off_given_order_number_with_multiples_3_7(){
        //given
        int order = 21;

        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result =  fizzBuzz.countOff(order);

        //then
        assertEquals("FizzWhizz", result);
    }

    @Test
    void should_return_order_when_count_off_given_order_number_with_multiples_3_5_7(){
        //given
        int order = 105;

        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result =  fizzBuzz.countOff(order);

        //then
        assertEquals("FizzBuzzWhizz", result);
    }



}
