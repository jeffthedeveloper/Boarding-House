package pensionato;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		String[] names = new String[n];
		String[] emails = new String[n];
		int[] rooms = new int[n];
		
		for (int i=0; i<n; i++) {
			
			
			System.out.println("Rent" + "#" + (i+1));

			System.out.println("Name: ");
			names[i] = sc.next();
			sc.nextLine();
			System.out.println("Email: ");
			emails[i] = sc.next();
			
			System.out.println("Room: ");
			rooms[i] = sc.nextInt();
		}
		
		System.out.println("Busy Rooms:");
		
		for(int i =0 ; i<n; i++) {
			System.out.printf("%d : %s, %s %n",rooms[i],names[i],emails[i]);
		}
		sc.close();
			
	}
	

	
}
