import java.util.Random;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Rectangle a = new Rectangle(6, 4);
		Rectangle b = new Rectangle(3);
		Rectangle c = a;
		
		System.out.println(a + "\n" + b + "\n" + c);
	
		a.setSides(5, 6);
		
		System.out.println(a + "\n" + b + "\n" + c);
		
		a.setBothSides(3);
		
		System.out.println(a == b);
		
		System.out.println(a == c);
		
		System.out.println(a.hasSameSideLenght(b));
		
		
		//2. feladat
		
		Rectangle[] rectangleArray = new Rectangle[10];
		
		Random random = new Random();
		
		for (int i = 0; i < rectangleArray.length; i++) {
			
			rectangleArray[i] = new Rectangle(random.nextInt(8) + 2, random.nextInt(8) + 2);
			
		}
		
		for (int j = 0; j < rectangleArray.length; j++) {
			
			System.out.println(rectangleArray[j]);
		}
		
		int min = 0;
		
		for (int k = 0; k < rectangleArray.length; k++) {
			
				if(rectangleArray[min].getArea() > rectangleArray[k].getArea()) {
					min = k;
				}
		}
		
		System.out.println(rectangleArray[min]);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a and b side! ");
		int aside = scanner.nextInt();
		int bside = scanner.nextInt();
		Rectangle userRectangle = new Rectangle(aside, bside);
		int counter = 0;
		for (Rectangle rectangle : rectangleArray) {
			
			if (userRectangle.hasBiggerAreaThan(rectangle)) {
				counter++;
			}
			
		}
		
		System.out.println("There were "+ counter+ " smaller rectangles than the user's!\n");
		
		int matchIndex = -1;
		
		for (int l = 0; l < rectangleArray.length; l++) {
			
			if (userRectangle.hasSameSideLenght(rectangleArray[l]) && matchIndex != -1) {
				matchIndex = l;
			}
		}
		
		if (matchIndex != -1) {
			System.out.println(matchIndex);
		}
		else System.out.println("There aren't any matching rectangles.\n");
		
	}

}
