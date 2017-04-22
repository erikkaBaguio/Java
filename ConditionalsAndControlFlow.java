public class ConditionalsAndControlFlow
{
	public static void main (String[] args)
	{
		// 2
		System.out.println(true && false);

		//3
		System.out.println( 3 > 1 || 3 < 1);

		//4
		System.out.println(!false);
		System.out.println( !(5>=1) );

		//5
		boolean riddle = !( 1 < 8 && (5 > 2 || 3 < 5));
		System.out.println(riddle);

		//6
		if (10 < 11) {

			System.out.println("Access granted.");

		}

		//7
		if (7 < 7) {

			System.out.println("Try again...");

		} else {

			System.out.println("Success!");

		}

		// 8
		int round = 5;

		if (round > 12) {

			System.out.println("The match is over!");

		} else if (round > 0) {

			System.out.println("The match is underway!");

		}	else {

			System.out.println("The boxing match hasn't started yet.");

		}	

		// 9
		int fuelLevel = 3;

		char canDrive = (fuelLevel > 0) ? 'Y' : 'N';
		System.out.println(canDrive);

		//10
		char penaltyKick = 'L';

		switch (penaltyKick) {

			case 'L': System.out.println("Messi shoots to the left and scores!");
								break; 
			case 'R': System.out.println("Messi shoots to the right and misses the goal!");
								break;
			case 'C': System.out.println("Messi shoots down the center, but the keeper blocks it!");
								break;
			default:
				System.out.println("Messi is in position...");

		}

		//11
		// ( 3 >= 3 && !(true || true) ) 
		boolean tricky	= false;	

		if(false) {

			System.out.println("Stuck in the past...");

		}else {

			System.out.println("Upgraded to the future!");

		}
		

		int subwayTrain = 5;

		switch (subwayTrain){

			case 1 : System.out.println("This is a South Ferry bound train!");
								break; 
			case 5 : System.out.println("This is a Brooklyn bound train!");
								break;
			case 7 : System.out.println("This is a Queens bound train!");
								break;
			default:
				System.out.println("I'm not sure where that train goes...");
	
		}


	}
}