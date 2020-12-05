package ticketMechineExercise2Try;

import java.util.ArrayList;

public class TicketMachine {

	Movie movie;
	ArrayList<String> movies;
	private String customerName;
	MoneyToPay moneyToPay;

	public TicketMachine(String customerName) {

		this.customerName = customerName;
		this.movies = new ArrayList<String>();
		this.movies.add("Cars");
		this.movies.add("StarWars");
		this.movies.add("Terminator");
		this.movies.add("BeautyAndTheBeast");
		this.movies.add("KungFuPanda");
		this.movies.add("Up");
		this.movies.add("FastAndFurious");

		MoneyToPay moneyToPay = new MoneyToPay();
	}

	public boolean chooseMovie(String movieName) {

		for (int i = 0; i < movies.size(); i++) {
			if (movies.contains(movieName)) {
				this.movie = new Movie(movieName);
				System.out.println(movieName + " is great, you gonna love it!");
				return false; // movie was found
			}
		}
		System.out.println(movieName + " Wasn't found, please try again!");
		return true;
	}

	public void printMovies() {
		for (String movieName : movies)
			System.out.println(movieName);
	}

	public void chooseDay(String movieDay) {
		this.movie.setDay(movieDay);
	}

	public void chooseHour(String movieHour) {
		this.movie.setHour(movieHour);
	}

	public void pay(String money) {
		if (moneyToPay.payInCreditCard(money, movie.getPrice()))
			printTicket();
		//else
			
	}

	public void printTicket() {
		System.out.println("Let's print your ticket!");
		System.out.println("Customet Name: " + this.customerName + "\n" + movie.printTicket() + "\n" + "Have fun!");
	}

	public String getCustomerName() {
		return customerName;
	}
}
