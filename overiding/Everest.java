package overiding;

public class Everest extends CentralBank
{
    @Override
    protected String getName()
    {
        return "Everest Bank";
    }

    @Override
    protected int getRate()
    {
        return 15;
    }

}
