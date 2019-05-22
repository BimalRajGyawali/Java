package overiding;

public class CentralBank
{
    protected String getName()
    {
        return "Central Bank";
    }

    protected int getRate()
    {
        return 0;
    }

    public void moneyExchangeRate()
    {
        System.out.println("1$ = 113");
        System.out.println("Yen 10 = 10.6");
        System.out.println("KDD 1 = 15");
    }
}
