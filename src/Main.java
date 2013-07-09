import rules.MultipleRule;

public class Main
{
    public static void main (String args[])
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.addRule(new MultipleRule("Fizz", 3));
        fizzBuzz.addRule(new MultipleRule("Buzz", 5));
        fizzBuzz.addRule(new MultipleRule("Pop", 11));

        for(int i = 1; i <= 100; i++)
            System.out.println(fizzBuzz.apply(i));
    }
}
