package ca.uwo.csd.cs2212.team08;
import java.util.Calendar;

import javax.swing.SwingUtilities;

public class App {

	public static void main (String args[]){
		System.out.println("Hello World");
		//set the default date to the current date
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		//add an extra zero to the month if it is needed
		String monthString;
		if (month<10)
		{
			monthString = "0" + Integer.toString(month);
		}
		else
		{
			monthString = Integer.toString(month); 
		}
		//save the date to a string
		String date = Integer.toString(year) +  "-" + monthString + "-" + Integer.toString(day);
		System.out.println(date);
		MainScreen window = new MainScreen(date);
		window.setVisible(true);

		/*
		 SwingUtilities.invokeLater(new Runnable() {
             @Override
             public void run() {
                   MainScreen window = new MainScreen();
                   window.setVisible(true);
             }
        }); }
		 */
	}
}
