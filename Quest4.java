/**
 * 
 */
package q3;

import java.util.Scanner;

/**
 * @author Laron
 *
 */
public class Quest4 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Введите значение часовой стрелки: ");
			int hours = scanner.nextInt();
			System.out.println("Введите значение минунтной стрелки: ");
			int min = scanner.nextInt();
			
			double deg = abs((hours * 30 + min * (1 / 2)) - (min * 6));
			System.out.println("Угол между стрелками: " + deg % 360);
		}
	}	
	private static double abs(int i) {
		// TODO Auto-generated method stub
		return i;
		
	}
}