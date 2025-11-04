import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InventoryApp {
	public static HashMap<String, Tool> invList = new HashMap<>();
	public static Scanner read = new Scanner(System.in);

	public static void main(String[] args) {
		addTool("T001", "Wrench", 2, 10.00);
		addTool("T002", "Knife", 3, 8.50);
		addTool("T003", "Scissor", 2, 2.50);
		addTool("T004", "Hammer", 1, 7.00);
		addTool("T005", "Saw", 1, 13.25);
		
		displayInventory();
		
		removeTool("T002");
		removeTool("T003");
		
		displayInventory();
	}
	
	public static void addTool(String pid, String pname, Integer qty, Double uprice) {
		if (invList.containsKey(pid)) {
			System.out.println("A product already exists under this code..!");
			System.out.print("Do ypu want to update the product ? : ");
			if (read.next().equalsIgnoreCase("yes")) {				
				invList.put(pid, new Tool(pname, qty, uprice));
				System.out.println("Product updated successfully");
			}
			else if (read.next().equalsIgnoreCase("no")) {
				return;
			}
			else {
				return;
			}
		}
		invList.put(pid, new Tool(pname, qty, uprice));
		System.out.println("Product added successfully");
	}
	
	public static void removeTool(String pid) {
		if (invList.containsKey(pid)) {
			invList.remove(pid);
			System.out.println("Product removed successfully");
			System.out.println();
		}
	}
	
	public static void displayInventory() {
		for (Map.Entry<String, Tool> tool : invList.entrySet()) {
			System.out.println("Product ID : " + tool.getKey());
			System.out.println("\tProduct Name : " + tool.getValue().getProductName());
			System.out.println("\tProduct Quantity : " + tool.getValue().getQuantity());
			System.out.println("\tProduct Unit Price : " + tool.getValue().getUnitPrice());
			System.out.println();
		}
	}
}

