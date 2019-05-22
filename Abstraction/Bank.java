package Abstraction;

public abstract class Bank
{
    // abstract class is declared by using keyword abstract class
    // it contains both normal and abstract  methods
    // abstract methods are defined by using keyword abstract before it
    // abstract class should have at least one child and should implement
    // all the abstract methods

    abstract String getName();
    abstract int getInterestRate();

    public void moneyExchangeRate()
    {
        System.out.println("$1 == 111");
        System.out.println("Yen 1 = 1.06");
    }


}
