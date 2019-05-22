package aggregation;

public class Teacher
{
    int id;
    String name;
    double salary;
    Car car; // Has A

    public static void main(String[] args)
    {
         Car c = new Car();
         c.setColor("Color");
         c.setModel("Toyota");
         c.setPrice(456.67);

         Teacher teacher = new Teacher();

         teacher.name = "Ram Kumar";
         teacher.salary = 56789;
         teacher.id = 121;
         teacher.car = c;

        System.out.println("Id = "+teacher.id);
        System.out.println("Name = "+teacher.name);
        System.out.println("Salary = "+teacher.salary);
        System.out.println("===Car Info===");
        System.out.println("Model = "+teacher.car.getModel());
        System.out.println("Color = "+teacher.car.getColor());
        System.out.println("Price = "+teacher.car.getPrice());
    }
}

