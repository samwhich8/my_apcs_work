public class DieRolling{
            public int roll(){
            int value = (int)(Math.random() * 6 + 1);
            return(value);
		}

public static void main(String[] args){
        DieRolling die = new DieRolling();
        for (int i=0; i<11; i++)
            System.out.println(die.roll());
}
}
