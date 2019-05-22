package ObjectAsArgument;

public class RunCostumer
{

    public static void main(String[] args)
    {

       RunCostumer runCostumer = new RunCostumer();

       Customer c = runCostumer.getData();

       runCostumer.displayCustomerInfo(c);

    }

    void displayCustomerInfo(Customer c)
    {
        System.out.println(c.getName()+" "+c.getId());
    }

    Customer getData()
    {
        Customer c = new Customer();

        c.setId(23);
        c.setName("Ram Kumar");


        return c;
    }

}
