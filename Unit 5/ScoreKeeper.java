
public class ScoreKeeper
{ 	

	public static void testScoreKeeper(int expected){
		if (getScore() == expected) {
			System.out.println("success");
		}
		else {
			System.out.println("fail");
		}
	}

	private static int score = 0;

	public static void scoreNormal(){
		score = score + 100;
	}

	public static void scoreBonus(){
		score = score + 1000;
	}

	public static int getScore(){
		return score;
	}

	public static void main(String[] args){

		scoreNormal();
		testScoreKeeper(100);

		scoreNormal();
		testScoreKeeper(200);

		scoreBonus();
		testScoreKeeper(1200);

		scoreBonus();
		testScoreKeeper(2200);
	}
}
