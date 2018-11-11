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
		
		JOptionPane.showMessageDialog(null, "��������� ������� ����� (�� 1 �� 100) , �������� ������� �� ������� ���������� �������");
		while( !userCorrect ) {
			userInputString = JOptionPane.showInputDialog(null, "������� �����: ", "", JOptionPane.QUESTION_MESSAGE);
			while( userInputString.isEmpty())
			{
			userInputString = JOptionPane.showInputDialog(null, "������� �����: ", "", JOptionPane.QUESTION_MESSAGE);
			}
			userGuessedNumber = Integer.parseInt( userInputString );
			if ( userGuessedNumber > randomNumber) {
				JOptionPane.showMessageDialog(null, "�����, ����� ��� ���!");
			} else if ( userGuessedNumber < randomNumber) {
				JOptionPane.showMessageDialog(null, "����, ����� ��� ���!");
			} else if ( userGuessedNumber == randomNumber ) {
				JOptionPane.showMessageDialog(null, "�����!" + "\n���������� �����: " + randomNumber + "\n����� �������: " + tryCount, "������!", JOptionPane.WARNING_MESSAGE);
				userCorrect = true;
			}
			tryCount++;
		}
		System.exit(0);
	}
	

}
