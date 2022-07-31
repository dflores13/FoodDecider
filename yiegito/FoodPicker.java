package yiegito;

import java.util.Random;
import java.util.Scanner;

public class FoodPicker {

	public static void main(String[] args) {
		getFood(foodStyle());
	}
	public static String foodStyle() {
		Scanner input = new Scanner(System.in);
		Random r = new Random();
		int rand = r.nextInt(11);
		System.out.println("Randomly Pick Style of Food?");
		char answer = input.next().charAt(0);
		
		String response = "";
		if(answer == 'y' || answer == 'Y') {
			switch(rand) {
			case 0: response = "Poke"; break;
			case 1: response = "Sandwich"; break;
			case 2: response = "Chicken"; break;
			case 3: response = "Mexican"; break;
			case 4: response = "Burger"; break;
			case 5: response = "Sushi"; break;
			case 6: response = "Dessert"; break;
			case 7: response = "Breakfast"; break;
			case 8: response = "Pizza"; break;
			case 9: response = "Japanese"; break;
			case 10: response = "Seafood"; break;
			
			}
			System.out.println("I picked " + response);
			return response;
		}
		else {
			System.out.println("What Style of food do you want?\n 1.Sandwiches, 2.Chicken, 3.Pizza, 4.Mexican, 5.Seafood, 6.Japanese, 7.Desserts, 8.Burgers, 9.Breakfast, 10.Sushi , 11.Poke");
			int ans = input.nextInt();	
			String resp = null;
			switch(ans) {
			case 1: resp = "Sandwich";break;
			case 2: resp = "Chicken";break;
			case 3: resp = "Pizza";break;
			case 4: resp = "Mexican";break;
			case 5: resp = "Seafood";break;
			case 6: resp = "Japanese";break;
			case 7: resp = "Dessert";break;
			case 8: resp = "Burger";break;
			case 9: resp = "Breakfast";break;
			case 10: resp = "Sushi";break;
			case 11: resp = "Poke";break;
			}
			System.out.println("You chose " + resp);
			return resp;
			
		}
		
		
	}
	public static void getFood(String food) {
		String[] foods = new String[] {"Chicken", "Sandwich", "Pizza", "Mexican", "Seafood", "Japanese", "Dessert", "Burger", "Breakfast", "Sushi", "Poke" };
		
		String[] chicken =new String[] {"Canes", "Chick fil a" ,"Chicken Now" };
		String[] sandwich =new String[] {"Mikes Deli", "Phillys CheeseSteak" };
		String[] pizza =new String[] {"Costco", "Alondras", "Dominos" };
		String[] mexican =new String[] {"El Guerro", "Taco bell" };
		String[] seafood =new String[] {"San Pedro", "Boiling crab" };
		String[] japanese =new String[] {"SUshi n terri", "daikokuya or orochan" };
		String[] dessert =new String[] {"portos", "boba" };
		String[] burger =new String[] {"in n out", "five guys" };
		String[] breakfast =new String[] {"doublz", "Chick fil a" };
		String[] sushi =new String[] {"Tenno Sushi ", "Sushi treadmill" };
		String[] poke =new String[] {"Poke go!" };
		
		Random r = new Random();
		int randChicken = r.nextInt(chicken.length); int randSandw = r.nextInt(sandwich.length); int randPizza = r.nextInt(pizza.length); int randMexican = r.nextInt(mexican.length); int randSeafood = r.nextInt(seafood.length); int randJapanese = r.nextInt(japanese.length); int randDessert = r.nextInt(dessert.length); int randBurger = r.nextInt(burger.length); int randBreakfast = r.nextInt(breakfast.length); int randSushi = r.nextInt(sushi.length); int randPoke = r.nextInt(poke.length);
		Integer[] randos = new Integer[] {randChicken, randSandw, randPizza, randMexican, randSeafood, randJapanese, randDessert, randBurger, randBreakfast, randSushi, randPoke};
		Scanner input = new Scanner(System.in);
		System.out.println("-----------------\nPick a random " + food + " place?");
		char answer = input.next().charAt(0);
		
		if(answer == 'y' || answer == 'Y') {
			for(int i = 0; i < foods.length; i++) {
				if(food == foods[i]) {
					switch(i) {
					case 0: System.out.println("i picked " + chicken[randos[i]]); break;
					case 1: System.out.println("i picked " + sandwich[randos[i]]); break;
					case 2: System.out.println("i picked " + pizza[randos[i]]); break;
					case 3: System.out.println("i picked " + mexican[randos[i]]);break;
					case 4: System.out.println("i picked " + seafood[randos[i]]);break;
					case 5: System.out.println("i picked " + japanese[randos[i]]);break;
					case 6: System.out.println("i picked " + dessert[randos[i]]);break;
					case 7: System.out.println("i picked " + burger[randos[i]]);break;
					case 8: System.out.println("i picked " + breakfast[randos[i]]);break;
					case 9: System.out.println("i picked " + sushi[randos[i]]);break;
					case 10: System.out.println("i picked " + poke[randos[i]]);break;
					}
					
				}
			}	
		}
		else {
			System.out.println("----------------\nHere are your options!");
			switch(food) {
			case "Chicken":
				for(int i = 0; i< chicken.length; i++) {
					System.out.println(chicken[i]);
				}
				break;
			case "Sandwich":
				for(int i = 0; i< sandwich.length; i++) {
					System.out.println(sandwich[i]);
				}
				break;
			case "Pizza":
				for(int i = 0; i< pizza.length; i++) {
					System.out.println(pizza[i]);
				}
				break;
			case "Mexican":
				for(int i = 0; i< mexican.length; i++) {
					System.out.println(mexican[i]);
				}
				break;
			case "Seafood":
				for(int i = 0; i< seafood.length; i++) {
					System.out.println(seafood[i]);
				}
				break;
			case "Japanese":
				for(int i = 0; i< japanese.length; i++) {
					System.out.println(japanese[i]);
				}
				break;
			case "Dessert":
				for(int i = 0; i< dessert.length; i++) {
					System.out.println(dessert[i]);
				}
				break;
			case "Burger":
				for(int i = 0; i< burger.length; i++) {
					System.out.println(burger[i]);
				}
				break;
			case "Breakfast":
				for(int i = 0; i< breakfast.length; i++) {
					System.out.println(breakfast[i]);
				}
				break;
			case "Sushi":
				for(int i = 0; i< sushi.length; i++) {
					System.out.println(sushi[i]);
				}
				break;
			case "Poke":
				for(int i = 0; i< poke.length; i++) {
					System.out.println(poke[i]);
				}
				break;
			}
		}
		
	}

}
