import java.util.*;

public class Person
{
    public Person(String name, int numberOfPets)
    {
        this.name = name;
        this.numberOfPets = numberOfPets;
    }

    // public accessor functions
    public String getName() { return name; }
    public int getNumberOfPets() { return numberOfPets; }

    // private variables
    private String name;
    private int numberOfPets;

    public static void main(String[] args)
    {
        System.out.println("Hello, people!\n");

        ArrayList<Person> people = new ArrayList<Person>();

        people.add(new Person("Ava", 1));
        people.add(new Person("Ben", 3));
        people.add(new Person("Cara", 2));
        people.add(new Person("Dylan", 0));

        System.out.println("people:");
        PersonStats.printPeople(people);

        System.out.println("average pets: " + PersonStats.averagePets(people));
        System.out.println();

        System.out.println("person with the most pets: " +
                           PersonStats.mostPets(people));
        System.out.println();

        ArrayList<Person> twoOrMore = PersonStats.atLeastTwoPets(people);
        System.out.println("people with at least 2 pets:");
        PersonStats.printPeople(twoOrMore);

        if (PersonStats.averagePets(people) == 1.5)
            System.out.println("averagePets test passed");
        else
            System.out.println("averagePets test failed");

        if (PersonStats.mostPets(people).equals("Ben"))
            System.out.println("mostPets test passed");
        else
            System.out.println("mostPets test failed");

        if (twoOrMore.size() == 2 &&
            twoOrMore.get(0).getName().equals("Ben") &&
            twoOrMore.get(1).getName().equals("Cara"))
            System.out.println("atLeastTwoPets test passed");
        else
            System.out.println("atLeastTwoPets test failed");
    }
}

class PersonStats
{
    public static double averagePets(ArrayList<Person> people)
    {
        double sum = 0;

        for (Person p : people)
            sum += p.getNumberOfPets();

        return sum / people.size();
    }

    public static String mostPets(ArrayList<Person> people)
    {
        Person most = people.get(0);

        for (Person p : people)
        {
            if (p.getNumberOfPets() > most.getNumberOfPets())
                most = p;
        }

        return most.getName();
    }

    public static ArrayList<Person> atLeastTwoPets(ArrayList<Person> people)
    {
        ArrayList<Person> result = new ArrayList<Person>();

        for (Person p : people)
        {
            if (p.getNumberOfPets() >= 2)
                result.add(p);
        }

        return result;
    }

    public static void printPeople(ArrayList<Person> people)
    {
        for (Person p : people)
        {
            System.out.println(p.getName() + " has " +
                               p.getNumberOfPets() + " pets");
        }
        System.out.println();
    }
}
