package Abstraction;

public class Nbil extends Bank
{

    @Override
    String getName() {
        return "Nabil Bank";
    }

    @Override
    int getInterestRate() {
        return 12;
    }


}
