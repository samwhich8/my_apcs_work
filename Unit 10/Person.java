public class Person
{
    public Person(String name, int numberOfPets)
    {
        this.name = name;
        this.numberOfPets = numberOfPets;
    }

   
    public String getName() { return name; }
    public int getNumberOfPets() { return numberOfPets; }

 
    private String name;
    private int numberOfPets;
}
