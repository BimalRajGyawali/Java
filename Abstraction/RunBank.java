package Abstraction;

public class RunBank
{

    public static void main(String[] args) {

        Bank b = new Nbil();

        System.out.println("Name = "+b.getName());
        System.out.println("Rate = "+b.getInterestRate());

        b.moneyExchangeRate();

        UserService us = new UserServiceImpl();

        us.addUser();
        us.deleteUser();





    }


}
