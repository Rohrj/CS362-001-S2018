package calendar;

import java.util.Random;
import calendar.Appt;
import calendar.CalDay;
import calendar.DataHandler;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for DataHandler class.
 */

public class DataHandlerRandomTest {
	
    private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;

	/**
	 * Return a randomly selected method to be tests !.
	 */
    public static String RandomSelectMethod(Random random){
        String[] methodArray = new String[] {"setRecurrence", "deleteApp"};// The list of the of methods to be tested in the Appt class

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
     * Generate Random Tests that tests DataHandler Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {
		 
		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

		 
		 System.out.println("Start testing...");
		 
		// try{
		// 	DataHandler dataHandler;
		// 	DataHandler dataHandler2;
		// 	DataHandler dataHandler3;
		// 	dataHandler = new DataHandler("datafile2", true);
		// 	dataHandler2 = new DataHandler("datafile", false);
		// 	dataHandler3 = new DataHandler();

			for (int iteration = 0; elapsed < TestTimeout; iteration++) {
				try{
					// DataHandler dataHandler;
					// DataHandler dataHandler2;
					// DataHandler dataHandler3;
					// dataHandler = new DataHandler("datafile2", true);
					// dataHandler2 = new DataHandler("datafile", false);
					// dataHandler3 = new DataHandler();
				long randomseed =System.currentTimeMillis(); //10
	//			System.out.println(" Seed:"+randomseed );
				Random random = new Random(randomseed);				

				 int startHour=ValuesGenerator.getRandomIntBetween(random, 1, 23);
				 int startMinute=ValuesGenerator.getRandomIntBetween(random, 1, 59);
				 int startDay=ValuesGenerator.getRandomIntBetween(random, 2, 31);
				 int startMonth=ValuesGenerator.getRandomIntBetween(random, 2, 12);
				 int startYear=ValuesGenerator.getRandomIntBetween(random, 2, 2018);
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

			     int startHour2=ValuesGenerator.getRandomIntBetween(random, 0, 23);
				 int startMinute2=ValuesGenerator.getRandomIntBetween(random, 0, 59);
				 int startDay2=ValuesGenerator.getRandomIntBetween(random, 1, 31);
				 int startMonth2=ValuesGenerator.getRandomIntBetween(random, 1, 12);
				 int startYear2=ValuesGenerator.getRandomIntBetween(random, 1, 2018);
				 String title2="Birthday Party";
				 String description2="This is my birthday party.";
				 String emailAddress2="xyz@gmail.com";

				 //Construct a new Appointment object with the initial data	 
				 //Construct a new Appointment object with the initial data	 
		         Appt appt2 = new Appt(startHour2,
		                  startMinute2 ,
		                  startDay2 ,
		                  startMonth2 ,
		                  startYear2 ,
		                  title2,
		                 description2,
		                 emailAddress2);

		   //       int startHour3=ValuesGenerator.getRandomIntBetween(random, 0, 23);
				 // int startMinute3=ValuesGenerator.getRandomIntBetween(random, 0, 59);
				 // int startDay3=ValuesGenerator.getRandomIntBetween(random, 1, 31);
				 // int startMonth3=ValuesGenerator.getRandomIntBetween(random, 1, 12);
				 // int startYear3=ValuesGenerator.getRandomIntBetween(random, 2, 2018);
				 // String title3="Birthday Party";
				 // String description3="This is my birthday party.";
				 // String emailAddress3="xyz@gmail.com";

				 // //Construct a new Appointment object with the initial data	 
				 // //Construct a new Appointment object with the initial data	 
		   //       Appt appt3 = new Appt(startHour3,
		   //                startMinute3 ,
		   //                startDay3 ,
		   //                startMonth3 ,
		   //                startYear3 ,
		   //                title3,
		   //               description3,
		   //               emailAddress3);

		   //       int startHour4=ValuesGenerator.getRandomIntBetween(random, 1, 23);
				 // int startMinute4=ValuesGenerator.getRandomIntBetween(random, 1, 59);
				 // int startDay4=ValuesGenerator.getRandomIntBetween(random, 2, 31);
				 // int startMonth4=ValuesGenerator.getRandomIntBetween(random, 2, 12);
				 // int startYear4=ValuesGenerator.getRandomIntBetween(random, 2, 2018);
				 // String title4="Birthday Party";
				 // String description4="This is my birthday party.";
				 // String emailAddress4="xyz@gmail.com";

				 // //Construct a new Appointment object with the initial data	 
				 // //Construct a new Appointment object with the initial data	 
		   //       Appt appt4 = new Appt(startHour4,
		   //                startMinute4 ,
		   //                startDay4 ,
		   //                startMonth4 ,
		   //                startYear4 ,
		   //                title4,
		   //               description4,
		   //               emailAddress4);

		   //       int startHour5=ValuesGenerator.getRandomIntBetween(random, 0, 23);
				 // int startMinute5=ValuesGenerator.getRandomIntBetween(random, 0, 59);
				 // int startDay5=ValuesGenerator.getRandomIntBetween(random, 1, 31);
				 // int startMonth5=ValuesGenerator.getRandomIntBetween(random, 1, 12);
				 // int startYear5=ValuesGenerator.getRandomIntBetween(random, 2000, 2018);
				 // String title5="Birthday Party";
				 // String description5="This is my birthday party.";
				 // String emailAddress5="xyz@gmail.com";

				 // //Construct a new Appointment object with the initial data	 
				 // //Construct a new Appointment object with the initial data	 
		   //       Appt appt5 = new Appt(startHour5,
		   //                startMinute5 ,
		   //                startDay5 ,
		   //                startMonth5 ,
		   //                startYear5 ,
		   //                title5,
		   //               description5,
		   //               emailAddress5);


			    GregorianCalendar today = new GregorianCalendar(startYear-1,startMonth-1,startDay-1);
			    GregorianCalendar tomorrow = new GregorianCalendar(startYear2,startMonth2,startDay2);
		        // LinkedList<CalDay> calDays = new LinkedList<CalDay>();

		         DataHandler dataHandler;
				 DataHandler dataHandler2;
				 DataHandler dataHandler3;
				 dataHandler = new DataHandler("datafile1", true);
				 dataHandler2 = new DataHandler("datafile2", false);
				 dataHandler3 = new DataHandler();

			 if(!appt.getValid())continue;
			for (int i = 0; i < NUM_TESTS; i++) {
				try{
					String methodName = DataHandlerRandomTest.RandomSelectMethod(random);
					   if (methodName.equals("setRecurrence")){
						   int sizeArray=ValuesGenerator.getRandomIntBetween(random, 0, 8);
						   int[] recurDays=ValuesGenerator.generateRandomArray(random, sizeArray);
						   int recur=DataHandlerRandomTest.RandomSelectRecur(random);
						   int recurIncrement = ValuesGenerator.RandInt(random);
						   int recurNumber=DataHandlerRandomTest.RandomSelectRecurForEverNever(random);
						   appt.setRecurrence(recurDays, recur, recurIncrement, recurNumber);

						   dataHandler.saveAppt(appt);
						   dataHandler.saveAppt(appt1);

						   // calDays = (LinkedList<CalDay>) dataHandler3.getApptRange(today,tomorrow);
						   // calDays = (LinkedList<CalDay>) dataHandler3.getApptRange(tomorrow,today);
						   // calDays = (LinkedList<CalDay>) dataHandler3.getApptRange(today,tomorrow);
						   // calDays = (LinkedList<CalDay>) dataHandler3.getApptRange(tomorrow,today);
						   dataHandler.getApptRange(today,tomorrow);
						   // dataHandler3.getApptRange(tomorrow,today);

						   // dataHandler3.deleteAppt(appt2);
						   // dataHandler3.deleteAppt(appt3);
						   // dataHandler3.deleteAppt(appt4);
						   // dataHandler3.deleteAppt(appt5);
						}
						else if (methodName.equals("deleteApp")){
							appt.setValid();
							appt.getValid();
							dataHandler2.saveAppt(appt);
							dataHandler2.deleteAppt(appt);
							dataHandler.saveAppt(appt);
							dataHandler.deleteAppt(appt);
							appt1.setValid();
							appt1.getValid();
							dataHandler2.saveAppt(appt1);
							dataHandler2.deleteAppt(appt1);
							dataHandler2.save();
							dataHandler2.deleteAppt(appt);

						}
					}catch(DateOutOfRangeException e){
						System.out.println("DateOutOfRangeException " + e);
					}
				}
				
				 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			        if((iteration%10000)==0 && iteration!=0 )
			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
			 
			}catch(NullPointerException e){
				System.out.println("NullPointerException " + e);
			}
		}
	 
		 System.out.println("Done testing...");
	 }


	
}
