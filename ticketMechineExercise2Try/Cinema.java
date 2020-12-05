package ticketMechineExercise2Try;

import java.util.Scanner;

public class Cinema {
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Hello there!" + "\n" + "What's your name?");
		TicketMachine T = new TicketMachine(reader.next());//create ticket machine with

		System.out.println("Welcome " + T.getCustomerName() + "\n"+ "\n" + "Which movie would you like to choose?"+ "\n");
		T.printMovies();//print all movies available

		boolean ok = true;
		do
			ok = T.chooseMovie(reader.next());  // insure proper movie name entered
		while (ok);

		
		System.out.println("which day would you like to come?");
		T.chooseDay(reader.next()); //user insert day 
		
		System.out.println("Great! now, choose the hour");
		T.chooseHour(reader.next()); //user insert hour 

		System.out.println("You need to pay: " + T.movie.getPrice() + "\n"
				+ "please insert money in credit card or press zero for actual money");
		
		T.pay(reader.next());//user enter credit card or real money

	}

}
