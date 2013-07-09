import org.junit.Assert;
import org.junit.Test;
import rules.AllDigitsSameRule;
import rules.AtleastOneOfDigitRule;
import rules.MultipleRule;

public class FizzBuzzTest
{
    @Test
    public void multiplesOfThreeReturnFizz()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.addRule(new MultipleRule("Fizz", 3));
        Assert.assertEquals("Fizz", fizzBuzz.apply(3));
        Assert.assertEquals("Fizz", fizzBuzz.apply(6));
        Assert.assertEquals("Fizz", fizzBuzz.apply(9));
    }

    @Test
    public void multiplesOfFiveReturnBuzz()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.addRule(new MultipleRule("Buzz", 5));
        Assert.assertEquals("Buzz", fizzBuzz.apply(5));
        Assert.assertEquals("Buzz", fizzBuzz.apply(10));
        Assert.assertEquals("Buzz", fizzBuzz.apply(20));
    }

    @Test
    public void FifteenIsAMultipleOfBothThreeAndFive()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.addRule(new MultipleRule("Fizz", 3));
        fizzBuzz.addRule(new MultipleRule("Buzz", 5));
        Assert.assertEquals("FizzBuzz", fizzBuzz.apply(15));
    }

    @Test
    public void numberReturnsItselfIfDoesntMeetAnyRules()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("1", fizzBuzz.apply(1));
        Assert.assertEquals("2", fizzBuzz.apply(2));
        Assert.assertEquals("4", fizzBuzz.apply(4));
        Assert.assertEquals("7", fizzBuzz.apply(7));
        Assert.assertEquals("8", fizzBuzz.apply(8));
    }

    @Test
    public void testDigitRule()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.addRule(new AtleastOneOfDigitRule("Bam", 1));
        fizzBuzz.addRule(new AtleastOneOfDigitRule("Pow", 2));

        Assert.assertEquals("BamPow", fizzBuzz.apply(21));
    }

    @Test
    public void testAllDigitsSameRule()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.addRule(new AllDigitsSameRule("Boom"));

        Assert.assertEquals("Boom", fizzBuzz.apply(222));
        Assert.assertEquals("Boom", fizzBuzz.apply(44));
        Assert.assertEquals("3", fizzBuzz.apply(3));  //doesnt apply to single digit nums
    }
}
