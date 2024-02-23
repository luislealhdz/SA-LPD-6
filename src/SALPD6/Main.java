package SALPD6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingresa un texto: ");
		String userInput = scanner.next();
		
		scanner.close();
		
		char[] lyricsList = userInput.toCharArray();
		
		String invertedText = "";
		
		for(int i = lyricsList.length - 1; i >= 0; i--) {
			invertedText += lyricsList[i];
		}
		
		System.out.print(invertedText);
	}

}
