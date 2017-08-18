package testList;
/*
 * Practice 010.3_ List
 * Date 20170817
 */

import java.util.Scanner;

public class TestList {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		AdvancedSearchList intList = new AdvancedSearchList();
		int input;
		
		while (true) {
			System.out.print("Options: 1) Append, 2)Search, 3)Max, 4)remove(index), 5)remove(value,number), -1)Quit:");
			input = scanner.nextInt();
			if (input == -1) 
				break;
			else if (input == 1) {
				System.out.print("Append: ");
				input = scanner.nextInt();
				if (intList.add(input) == true) {
					System.out.printf("'%d' appended succeeded!\n", input);
					System.out.println("Input: " + intList);
				}
				else
					System.out.printf("'%d' appended failed!", input);
			}
			else if (input == 2) {
				System.out.print("Search: ");
				input = scanner.nextInt();
				int a = intList.search(input);
				if (a == -1)
					System.out.printf("'%d' is not in the array!", input);
				else
					System.out.printf("'%d' is at %d", input, a);
			}
			else if (input == 3) 
				System.out.println(intList.findMax());
			else if (input == 4) {
				System.out.print("Remove(index): ");
				input = scanner.nextInt();
				if (intList.remove(input) == false)
					System.out.println("Input index is out of boundary!");
				else {
					System.out.println("Remove succeeded!");
					System.out.println("Input: " + intList);
				}
			}
			else if (input == 5) {
				System.out.print("Remove(value,number): ");
				int value = scanner.nextInt(), number = scanner.nextInt();
				if (intList.remove(value, number) == false)
					System.out.println("Input value is not in the array!");
				else
					System.out.println("Input: " + intList);
			}
			else 
				System.out.println("Input error!");
		}
		
		System.out.println("Program terminate.");
		

	}

}
