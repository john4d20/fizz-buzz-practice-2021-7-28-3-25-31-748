package tdd.fizzbuzz;

public class FizzBuzz {

    public String countOff(int order) {
        String context = "";
        if (order % 3 == 0){
            context+= "Fizz";
        }
        if (order % 5 == 0){
            context+= "Buzz";
        }
        if (order % 7 == 0){
            context+= "Whizz";
        }
        if (context.equals("")){
            return String.valueOf(order);
        }
        return context;

    }
}
