package calendar;

import java.util.Calendar;
import java.util.Random;
import java.util.GregorianCalendar;
import calendar.CalDay;

import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for CalDay class.
 */

public class CalDayRandomTest {
	
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;

	/**
	 * Return a randomly selected method to be tests !.
	 */
    public static String RandomSelectMethod(Random random){
        String[] methodArray = new String[] {"addAppt"};// The list of the of methods to be tested in the Appt class

    	int n = random.nextInt(methodArray.length);// get a random number between 0 (inclusive) and  methodArray.length (exclusive)
    	            
        return methodArray[n] ; // return the method name 
        }
	/**
	 * Return a randomly selected appointments to recur Weekly,Monthly, or Yearly !.
	 */
    public static int RandomSelectRecur(Random random){
        int[] RecurArray = new int[] {Appt.RECUR_BY_WEEKLY,Appt.RECUR_BY_MONTHLY,Appt.RECUR_BY_YEARLY};// The list of the of setting appointments to recur Weekly,Monthly, or Yearly

    	int n = random.nextInt(RecurArray.length);// get a random number between 0 (inclusive) and  RecurArray.length (exclusive)
        return RecurArray[n] ; // return the value of the  appointments to recur 
        }	
	/**
	 * Return a randomly selected appointments to recur forever or Never recur  !.
	 */
    public static int RandomSelectRecurForEverNever(Random random){
        int[] RecurArray = new int[] {Appt.RECUR_NUMBER_FOREVER,Appt.RECUR_NUMBER_NEVER};// The list of the of setting appointments to recur RECUR_NUMBER_FOREVER, or RECUR_NUMBER_NEVER

    	int n = random.nextInt(RecurArray.length);// get a random number between 0 (inclusive) and  RecurArray.length (exclusive)
        return RecurArray[n] ; // return appointments to recur forever or Never recur 
        }	
    /**
     * Generate Random Tests that tests CalDay Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {
		 
		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

		 
		 System.out.println("Start testing...");
		 
		try{ 
			// < to >
			for (int iteration = 0; elapsed < TestTimeout; iteration++) {
				long randomseed =System.currentTimeMillis(); //10
	//			System.out.println(" Seed:"+randomseed );
				Random random = new Random(randomseed);
				
				Calendar rightnow = Calendar.getInstance();
    			int thisMonth = rightnow.get(Calendar.MONTH);     	/** todays date **/
				int thisDay = rightnow.get(Calendar.DAY_OF_MONTH);
   				int thisYear = rightnow.get(Calendar.YEAR);
				GregorianCalendar calendar = new GregorianCalendar(thisYear, thisMonth, thisDay);
				CalDay calday = new CalDay(calendar);

				 int startHour=ValuesGenerator.getRandomIntBetween(random, 0, 23);
				 int startMinute=ValuesGenerator.getRandomIntBetween(random, 0, 59);
				 int startDay=ValuesGenerator.getRandomIntBetween(random, 1, 31);
				 int startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 12);
				 int startYear=ValuesGenerator.getRandomIntBetween(random, 1, 2018);
				 String title="Birthday Party";
				 String description="This is my birthday party.";
				 String emailAddress="xyz@gmail.com";

				 //Construct a new Appointment object with the initial data	 
				 //Construct a new Appointment object with the initial data	 
		         Appt appt = new Appt(startHour,
		                  startMinute ,
		                  startDay ,
		                  startMonth ,
		                  startYear ,
		                  title,
		                 description,
		                 emailAddress);

		         int startHour1=ValuesGenerator.getRandomIntBetween(random, -100, 100);
			     int startMinute1=ValuesGenerator.getRandomIntBetween(random, -120, 120);
			     int startDay1=ValuesGenerator.getRandomIntBetween(random, -60, 60);
			     int startMonth1=ValuesGenerator.getRandomIntBetween(random, -24, 24);
			     int startYear1=ValuesGenerator.getRandomIntBetween(random, -2018, 2018);
			     String title1="Birthday Party";
			     String description1="This is my birthday party.";
			     String emailAddress1="xyz@gmail.com";

			     Appt appt1 = new Appt(startHour1,
              						   startMinute1,
              						   startDay1,
              						   startMonth1,
              						   startYear1,
              					 	   title1,
             						   description1,
             						   emailAddress1);

			 if(!appt.getValid())continue;
			for (int i = 0; i < NUM_TESTS; i++) {
					String methodName = CalDayRandomTest.RandomSelectMethod(random);
					   if (methodName.equals("addAppt")){
					   	   appt.setValid();
						   calday.addAppt(appt);
						   calday.addAppt(appt1);						   
						}
				}
				
				 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			        if((iteration%10000)==0 && iteration!=0 )
			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
			 
			}
		}catch(NullPointerException e){
			
		}
	 
		 System.out.println("Done testing...");
	 }


	
}
