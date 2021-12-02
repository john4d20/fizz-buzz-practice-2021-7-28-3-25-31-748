package tdd.fizzbuzz;

public class FizzBuzz {

    public String countOff(int order) {
        String Sound = "";
        if (order % 3 == 0){
            Sound+= "Fizz";
        }
        if (order % 5 == 0){
            Sound+= "Buzz";
        }
        if (order % 7 == 0){
            Sound+= "Whizz";
        }
        if (Sound.equals("")){
            return String.valueOf(order);
        }
        return Sound;

    }
}
