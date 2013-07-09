package rules;

public class AtleastOneOfDigitRule extends Rule
{
    public int digit;

    public AtleastOneOfDigitRule(String word, int digit)
    {
        this.word = word;
        this.digit = digit;
    }

    public String apply(int n)
    {
        String result = "";
        if(Integer.toString(n).contains(n+""))
            result = this.word;
        return result;
    }
}
