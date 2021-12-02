package tdd.fizzbuzz;

public class FizzBuzz {

    public String countoff(int order) {
        String Sound = "";
        if (order % 3 == 0){
            Sound+= "Fizz";
//            return "Fizz";
        }
        if (order % 5 == 0){
            Sound+= "Buzz";
//            return "Buzz";
        }
        if (order % 7 == 0){
            Sound+= "Whizz";
//            return "Whizz";
        }

        if (Sound.equals("")){
            return String.valueOf(order);
        }
        return Sound;

    }
}
