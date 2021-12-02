package tdd.fizzbuzz;

public class FizzBuzz {

    public String countoff(int order) {
        if (order % 3 == 0){
            return "Fizz";
        }
        return String.valueOf(order);
    }
}
