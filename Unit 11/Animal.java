import java.util.*;

class Animal
{
    public Animal(String name, int legCount, boolean furry)
    {
        this.name = name;
        this.legCount = legCount;
        this.furry = furry;
    }

    public String getName()
    {
        return name;
    }

    public int getLegCount()
    {
        return legCount;
    }

    public boolean isFurry()
    {
        return furry;
    }

    private String name;
    private int legCount;
    private boolean furry;
}

class Human extends Animal
{
    public Human(String name)
    {
        super(name, 2, false);
    }
}

class Cat extends Animal
{
    public Cat(String name)
    {
        super(name, 4, true);
    }
}

class Sponge extends Animal
{
    public Sponge(String name)
    {
        super(name, 0, false);
    }
}

class Centipede extends Animal
{
    public Centipede(String name)
    {
        super(name, 100, false);
    }
}

class AnimalCalculator
{
    public static void printAnimals(ArrayList<Animal> animals)
    {
        for (Animal a : animals)
        {
            if (a.isFurry())
            {
                System.out.println(a.getName() + " " +
                                   a.getLegCount() + " furry");
            }
            else
            {
                System.out.println(a.getName() + " " +
                                   a.getLegCount() + " not furry");
            }
        }
    }

    public static double averageLegs(ArrayList<Animal> animals)
    {
        int total = 0;

        for (Animal a : animals)
        {
            total += a.getLegCount();
        }

        return (double) total / animals.size();
    }

    public static Animal fewestLegs(ArrayList<Animal> animals)
    {
        Animal smallest = animals.get(0);

        for (Animal a : animals)
        {
            if (a.getLegCount() < smallest.getLegCount())
            {
                smallest = a;
            }
        }

        return smallest;
    }
}

public class AnimalTest
{
    public static void main(String[] args)
    {
        ArrayList<Animal> animals = new ArrayList<Animal>();

        animals.add(new Human("Alice"));
        animals.add(new Cat("Milo"));
        animals.add(new Sponge("Bob"));
        animals.add(new Centipede("Centi"));

        AnimalCalculator.printAnimals(animals);

        double avg = AnimalCalculator.averageLegs(animals);
        System.out.println("Average legs: " + avg);

        Animal fewest = AnimalCalculator.fewestLegs(animals);
        System.out.println("Fewest legs: " + fewest.getName());

        if (avg == 26.5)
        {
            System.out.println("averageLegs test passed");
        }
        else
        {
            System.out.println("averageLegs test failed");
        }

        if (fewest.getName().equals("Bob"))
        {
            System.out.println("fewestLegs test passed");
        }
        else
        {
            System.out.println("fewestLegs test failed");
        }
    }
}
