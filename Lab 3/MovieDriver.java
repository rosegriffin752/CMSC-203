
/**
 * Prompts user to input information about a movie and prints it out.
 * @author Rose Griffin
 *
 */
import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Movie firstMovie = new Movie();
		String title, rating, ans;
		int soldTickets;
		
		do {
			System.out.println("Enter the name of a movie");
			title = input.nextLine();
			firstMovie.setTitle(title);
			
			System.out.println("Enter the rating of the movie");
			rating = input.nextLine();
			firstMovie.setRating(rating);
			
			System.out.println("Enter the number of tickets sold for this movie");
			soldTickets = input.nextInt();
			firstMovie.setSoldTickets(soldTickets);
			
			System.out.println(firstMovie.toString());
			
			input.nextLine();
			System.out.println("Do you want to enter another?");
			ans = input.nextLine().toLowerCase();
			
		} while(ans.equals("y"));
		
		System.out.println("Goodbye");
		input.close();
	}

}
