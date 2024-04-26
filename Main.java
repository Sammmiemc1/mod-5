import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> Temps = new ArrayList<>();
	    ArrayList<String> Days =new ArrayList<>();
	    		  
	       Days.add("Monday");
	       Days.add("Tuesday");
	       Days.add("Wednesday");
	       Days.add("Thursday");
	       Days.add("Friday");
	       Days.add("Saturday");
	       Days.add("Sunday");
	       
	       Temps.add(83);
	       Temps.add(85);
	       Temps.add(87);
	       Temps.add(92);
	       Temps.add(95);
	       Temps.add(84);
	       Temps.add(86);
	       
	       Scanner scnr = new Scanner(System.in);
	       
	       System.out.println("What is the day of the week? ");
	    
	       String wkDay = scnr.nextLine();
	       scnr.close();
           if (wkDay.equalsIgnoreCase("week"))
           {
        	   float tempSum = 0;
               for (int i = 0; i < 7; i++)
               {
                   System.out.println("The temperature on " + Days.get(i) + " is " +  Temps.get(i) + " degrees.");
                   tempSum = tempSum + Temps.get(i);
               }
               float tempAverage = tempSum / 7;
               System.out.println("The average temperature this week is " + tempAverage + " degrees.");
           }
           else
           {
               boolean dayMatched = false;
               int dayIndex = 0;
               while (dayMatched == false)
               {
                   if (wkDay.equalsIgnoreCase(Days.get(dayIndex)))
                   {
                       dayMatched = true;
                   }
                   else
                   {
                       dayIndex++;
                   }
               }

               System.out.println("The temperature on " + Days.get(dayIndex) + " is " +  Temps.get(dayIndex) + " degrees.");

           }
	}
}