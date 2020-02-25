import java.util.Scanner;

public class ClassDemo {
	public static void main(String[] args) {
 
		
		//Add code to create an object repeatedly
		
		String name,ans;
		int[] ages = new int[10];
		int age, i = 0;
		double average = 0;
		Person p;
		Scanner input = new Scanner(System.in);
		do {
			
			System.out.println("Enter name :");
			name = input.nextLine();
			System.out.println("Enter age :");
			age = input.nextInt();
			ages[i] = age;
			i++;
			
			p = new Person(name,age,20);
			System.out.println(p.getName() + 
					   " You are " +p.getAge() + " Years old");
			input.nextLine();
			System.out.println("Do you want to continue?");
			ans = input.nextLine();
		}while (ans.equals("y") && i < 10 );
		
		for (int j = 0; j < i; j++) {
			if (ages[j] > 0) {
				System.out.print(ages[j] + " ");
			}
			average+=ages[j];
		}
		average/=i;
		System.out.println("\nAverage Age: " + average);
		
		input.close();
	}
}
