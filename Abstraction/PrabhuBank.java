package Abstraction;

public class PrabhuBank extends Bank {
    @Override
    String getName() {
        return "Prabhu Bank";
    }

    @Override
    int getInterestRate() {
        return 12;
    }
}
