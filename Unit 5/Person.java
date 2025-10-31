public class Person{ 	

	public static void testPerson(String name, int pets, String expected){
		if (greeting(name, pets).equals(expected)) {
			System.out.println("success");
		}
		else {
			System.out.println("fail");
		}
	}

	public static String greeting(String name, int numberOfPets){
		String message = "Hello, my name is " + name + " and I have " + numberOfPets + " pets.";
		return message;
	}

	public static void main(String[] args)	{
		testPerson("Sam", 4, "Hello, my name is Sam and I have 4 pets.");
		testPerson("Samuel", 0, "Hello, my name is Samuel and I have 0 pets.");
		testPerson("Samantha", 5, "Hello, my name is Samantha and I have 5 pets.");
		testPerson("Dr. Kessner", 1, "Hello, my name is Dr. Kessner and I have 1 pets.");
	}
}
