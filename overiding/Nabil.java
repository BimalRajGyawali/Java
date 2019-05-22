package overiding;

public class Nabil extends CentralBank
{
    @Override
    protected String getName() {
        return "Nabil";
    }

    @Override
    protected int getRate() {
        return 12;
    }
}

