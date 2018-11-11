package ru.nerdyfeed.hglite;

import java.util.Random;
import javax.swing.JOptionPane;

public class Game {
	public static void main(String[]args) {
		Random random = new Random();
		int randomNumber = random.nextInt( 101 );
		int tryCount = 1;
		boolean userCorrect = false;
		String userInputString;
		int userGuessedNumber;
		
		JOptionPane.showMessageDialog(null, "Компьютер загадал число (от 1 до 100) , попробуй угадать за меньшее количество попыток");
		while( !userCorrect ) {
			userInputString = JOptionPane.showInputDialog(null, "Введите число: ", "", JOptionPane.QUESTION_MESSAGE);
			while( userInputString.isEmpty())
			{
			userInputString = JOptionPane.showInputDialog(null, "Введите число: ", "", JOptionPane.QUESTION_MESSAGE);
			}
			userGuessedNumber = Integer.parseInt( userInputString );
			if ( userGuessedNumber > randomNumber) {
				JOptionPane.showMessageDialog(null, "Много, давай ещё раз!");
			} else if ( userGuessedNumber < randomNumber) {
				JOptionPane.showMessageDialog(null, "Мало, давай ещё раз!");
			} else if ( userGuessedNumber == randomNumber ) {
				JOptionPane.showMessageDialog(null, "Верно!" + "\nЗагаданное число: " + randomNumber + "\nЧисло попыток: " + tryCount, "Угадал!", JOptionPane.WARNING_MESSAGE);
				userCorrect = true;
			}
			tryCount++;
		}
		System.exit(0);
	}
	

}
