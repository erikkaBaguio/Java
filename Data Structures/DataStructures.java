import java.util.ArrayList;
import java.util.HashMap;

public class DataStructures {
	public static void main(String[] args) {

		// [2 - For Loop]
		for (int waterLevel = 0; waterLevel < 7; waterLevel++) {

			System.out.println("The pool's water level is at " + waterLevel + " feet.");

		}

		// [3 - ArrayList]
		ArrayList<Integer> weeklyTemperatures = new ArrayList<Integer>();

		// [4 - ArrayList : Manipulation]
		weeklyTemperatures.add(78);
	    weeklyTemperatures.add(67);
	    weeklyTemperatures.add(89);
	    weeklyTemperatures.add(94);

		// [5 - ArrayList : Access]
		System.out.println(weeklyTemperatures.get(1));

		// [6 - ArrayList : Insertion]
		weeklyTemperatures.add(2,111);    
    	System.out.println(weeklyTemperatures.get(3));

		// [7 - Iterating Over an ArrayList]
		for(int j = 0; j < weeklyTemperatures.size(); j++)
	    {
	      System.out.println(weeklyTemperatures.get(j));
	    }

		// [8 - For Each Loop]
	    for (Integer temperature : weeklyTemperatures)
	    {
	    	System.out.println(temperature);
	    }	

		// [9 - HashMap]
		HashMap<String, Integer> restaurantMenu = new HashMap<String, Integer>();

		// [10 - HashMap : Manipulation]
		restaurantMenu.put("Turkey Burger", 13);
	    restaurantMenu.put("Naan Pizza", 11);
	    restaurantMenu.put("Cranberry Kale Salad", 10);
		
		// [11 - HashMap : Access]
		System.out.println(restaurantMenu.get("Naan Pizza"));

		// [12 - Iterating over a HashMap]
		System.out.println(restaurantMenu.size());

		for (String item : restaurantMenu.keySet()) {

			System.out.println("A " + item + " costs " + restaurantMenu.get(item) + " dollars.");

		}

		// [13 - Generalizations]	
		ArrayList<String> sports = new ArrayList<String>();
	
		sports.add("Football");
		sports.add("Boxing");

		for(String sport : sports) {
			System.out.println(sport);
		}

		//Major cities and the year they were founded
		HashMap<String, Integer> majorCities = new HashMap<String, Integer>();

		majorCities.put("New York", 1624);
		majorCities.put("London", 43);
		majorCities.put("Mexico City", 1521);
		majorCities.put("Sao Paulo", 1554);


		for (String city : majorCities.keySet()) {

			System.out.println(city + " was founded in " + majorCities.get(city));

		}	
	}

}