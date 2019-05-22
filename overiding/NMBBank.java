package overiding;

public class NMBBank extends CentralBank
{
    @Override
    protected String getName()
    {
        return "NMB BANK";
    }

    @Override
    protected int getRate()
    {
        return 10;
    }
}
