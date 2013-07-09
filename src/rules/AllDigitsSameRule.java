package rules;

/**
 * Created with IntelliJ IDEA.
 * User: jkisor
 * Date: 7/9/13
 * Time: 7:12 AM
 * To change this template use File | Settings | File Templates.
 */
public class AllDigitsSameRule extends Rule
{
    public AllDigitsSameRule(String word)
    {
        this.word = word;
    }

    public String apply(int n)
    {
        String result = "";

        String numAsString = Integer.toString(n);
        char firstChar = numAsString.charAt(0);

        for (int i = 1; i < numAsString.length(); i++)
        {
            if(numAsString.charAt(i) != firstChar)
                break;
            if(i == numAsString.length()-1)
                result += word;
        }
        return result;
    }
}
