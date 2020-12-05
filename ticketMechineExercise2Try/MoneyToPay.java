package ticketMechineExercise2Try;

import java.util.Scanner;

public class MoneyToPay {

	static Scanner reader = new Scanner(System.in);

	public static boolean payInCreditCard(String creditCardNum, int moviePrice) {
		if (creditCardNum.equals("0")) {
			System.out.println("you chose real Money, please insert it now");
			return payWithActualMoney(reader.nextInt(), moviePrice);
		} else {
			if (creditCardNum.matches("[0-9]+") && creditCardNum.length() == 12) {
				System.out.println("Payment accepted in credit card");
				return true;
			} else
				System.out.println("Payment didnt work please try again!");
			return false;
		}
	}

	public static boolean payWithActualMoney(int money, int moviePrice) {
		if (moviePrice <= money) {
			System.out.println("Payment accepted in actual money, her's your change " + (money - moviePrice));
			return true;
		} else {
			System.out.println("Payment didn't work please try again!");
			return false;
		}
	}
}