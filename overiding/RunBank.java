package overiding;

public class RunBank
{
    public static void main(String[] args)
    {
        //static or early binding of object
        Everest everest = new Everest();

        System.out.println("Bank Name = "+everest.getName());
        System.out.println("Interest Rate "+everest.getRate());
        everest.moneyExchangeRate();


        //up-casting

        CentralBank b = new Everest();
        System.out.println("Bank Name = "+b.getName());





    }


    // this method can take object of any child
    // so run time maa matra thaha hunxa
    // dynamic/late binding of object

    public void displayBankInfo(CentralBank b)
    {
        System.out.println("Bank Name = "+b.getName());
        System.out.println("Interest Rate "+b.getRate());
        b.moneyExchangeRate();

    }

}
