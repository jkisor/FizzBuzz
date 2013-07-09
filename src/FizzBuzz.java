
import rules.Rule;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz
{
    private List<Rule> rules;

    public FizzBuzz()
    {
        rules = new ArrayList<Rule>();
    }

    public String apply(int n)
    {
        String result = "";

        for(Rule r : rules)
            result += r.apply(n);

        if(result.equals(""))
            result += n;

        return result;
    }

    public void addRule(Rule rule)
    {
        rules.add(rule);
    }
}
