package inheritence;

public class Programmer extends Employee
{
        String proLang,projectName;
        double bonus;


    public static void main(String[] args)
    {
        Programmer programmer = new Programmer();

        programmer.name="Ram Kumar";
        programmer.address = "Patan";
        programmer.phone = "98456783434";
        programmer.bonus = 7872.27;
        programmer.projectName = "Web dev";
        programmer.proLang = "PHP";
        programmer.salary = 456767;


        System.out.println(programmer.name+" "+programmer.address+" "+programmer.phone+" " +
                " "+programmer.proLang+" "+programmer.projectName);
    }
}
