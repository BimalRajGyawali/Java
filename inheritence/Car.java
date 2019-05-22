package inheritence;

public class Car extends Vehicle
{
    int cc,gear;

    void carAttributes()
    {
        System.out.println(cc+" "+gear+" "+speed+" "+price);
        super.attribute();
        // super = parent reference of current obj

    }

    public static void main(String[] args)
    {

        Car car = new Car();

        car.price = 466897;
        car.cc = 220;
        car.gear = 452;
        car.speed = 100;
        car.carAttributes();

    }








}
