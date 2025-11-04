package version_e.q2;

import java.util.PriorityQueue;
import java.util.Scanner;

public class BookApp {
	public static PriorityQueue<String> books = new PriorityQueue<>();

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String bookName;
		String needToRemove;
		
		do {
			System.out.print("Enter the Book Name : ");
			bookName = read.nextLine();
			if (!bookName.equalsIgnoreCase("done")) {
				addBook(bookName);
			}
		} while (!"done".equalsIgnoreCase(bookName));
		
		System.out.print("Do you want to remove a book ? : ");
		needToRemove = read.next();
		
		if (needToRemove.equalsIgnoreCase("Yes")) {
			System.out.print("Enter the book's name that you want to remove : ");
			read.nextLine();
			removeBook(read.nextLine());
		}
		else if (needToRemove.equalsIgnoreCase("No")) {
			System.out.println("Okey");
		}
		else {
			System.out.println("Wrong input");
		}
		
		displayBooks();
		
	}
	
	public static void addBook(String bookName) {
		books.offer(bookName);
	}
	
	public static void removeBook(String bookName) {
		if (books.contains(bookName)) {
			books.remove(bookName);
			System.out.println();
			System.out.println("The book is removed successfully..!");
			System.out.println();
		}
		else {
			System.out.println();
			System.out.println("The book is not in the this list..!");
			System.out.println();
		}
	}
	
	public static void displayBooks() {
		System.out.println();
		System.out.println("The total number of books in the list : " + books.size());
		for (String displayedBook : books) {
			System.out.println(displayedBook);
		}
	}
}
