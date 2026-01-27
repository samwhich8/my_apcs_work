public class ItemCalc
{
    public ItemCalc(String name)
    {
        this.name = name;
    }

    public void greeting()
    {
        System.out.println("Hello, my name is " + name); 
    }

    protected String name; // subclasses can access protected variables
}
//
// Student.java
//


public class Student extends Person
{
    public Student(String name)
    {
        super(name); // call the superclass (Person) constructor
    }

    public void greeting()
    {
        System.out.println("Hello, I'm a student, and my name is " + name); 
    }
}
//
// PersonTest.java
//


public class PersonTest
{
    public static void main(String[] args)
    {
        Person drkessner = new Person("Dr. Kessner");
        drkessner.greeting();

        // a Student is a Person

        Person briley = new Student("Briley");
        briley.greeting();
    }
}

