public class Coinflip{
    public String flip(){
        if (Math.random() < .5)
            return "Heads";
        else
            return "Tails";
    }

public static void main(String[] args){
        Coinflip coin = new Coinflip();
        for (int i=0; i<25; i++)
            System.out.println(coin.flip());
}
}
