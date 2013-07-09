package rules;

public class MultipleRule extends Rule
{
    public int multiple;

    public MultipleRule(String word, int multiple)
    {
        this.word = word;
        this.multiple = multiple;
    }

    public String apply(int n)
    {
        String result = "";

        if( n % multiple == 0 )
            result = word;

        return result;
    }
}
