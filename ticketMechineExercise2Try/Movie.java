package ticketMechineExercise2Try;

public class Movie {

	private String name; 
	private int price;
	private String day;
	private String hour;
	
	
	public Movie (String name) {
		this.name = name;
		this.price=39;
		this.hour="";
		this.day="";
	}


	public int getPrice() {
		return price;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public void setHour(String hour) {
		this.hour = hour;
		System.out.println("You chose the best hour in the day");
	}
	
		
		public String printTicket() {
			return "Movie Name: " + name  + "\n" + "Price: "+ this.price + "\n"+"In: "+this.day+ "\n" + "At: " + this.hour;
		
	}
	
	
	
	
	
}
