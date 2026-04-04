import java.util.*;

interface Vehicle
{
    public String name();
    public int wheelCount();
    public boolean isHumanPowered();
}

class Car implements Vehicle
{
    public String name()
    {
        return "Car";
    }

    public int wheelCount()
    {
        return 4;
    }

    public boolean isHumanPowered()
    {
        return false;
    }
}

class Motorcycle implements Vehicle
{
    public String name()
    {
        return "Motorcycle";
    }

    public int wheelCount()
    {
        return 2;
    }

    public boolean isHumanPowered()
    {
        return false;
    }
}

class Bicycle implements Vehicle
{
    public String name()
    {
        return "Bicycle";
    }

    public int wheelCount()
    {
        return 2;
    }

    public boolean isHumanPowered()
    {
        return true;
    }
}

class Unicycle implements Vehicle
{
    public String name()
    {
        return "Unicycle";
    }

    public int wheelCount()
    {
        return 1;
    }

    public boolean isHumanPowered()
    {
        return true;
    }
}

class VehicleStats
{
    public static int totalWheels(ArrayList<Vehicle> vehicles)
    {
        int total = 0;

        for (Vehicle v : vehicles)
        {
            total += v.wheelCount();
        }

        return total;
    }

    public static ArrayList<Vehicle> humanPowered(ArrayList<Vehicle> vehicles)
    {
        ArrayList<Vehicle> result = new ArrayList<Vehicle>();

        for (Vehicle v : vehicles)
        {
            if (v.isHumanPowered())
            {
                result.add(v);
            }
        }

        return result;
    }
}

public class VehicleTest
{
    public static void main(String[] args)
    {
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

        vehicles.add(new Car());
        vehicles.add(new Motorcycle());
        vehicles.add(new Bicycle());
        vehicles.add(new Unicycle());

        for (Vehicle v : vehicles)
        {
            System.out.println(v.name() + " " +
                               v.wheelCount() + " " +
                               v.isHumanPowered());
        }

        int total = VehicleStats.totalWheels(vehicles);
        System.out.println("Total wheels: " + total);

        ArrayList<Vehicle> human = VehicleStats.humanPowered(vehicles);
        System.out.println("Human powered vehicles:");
        for (Vehicle v : human)
        {
            System.out.println(v.name());
        }

        if (total == 9)
        {
            System.out.println("totalWheels test passed");
        }
        else
        {
            System.out.println("totalWheels test failed");
        }

        if (human.size() == 2 &&
            human.get(0).name().equals("Bicycle") &&
            human.get(1).name().equals("Unicycle"))
        {
            System.out.println("humanPowered test passed");
        }
        else
        {
            System.out.println("humanPowered test failed");
        }
    }
}
