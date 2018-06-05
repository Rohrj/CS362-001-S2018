
/** A JUnit test class to test the class DataHandler. */


package calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import calendar.Appt;
import calendar.CalDay;
import calendar.DataHandler;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class DataHandlerTest{

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
  	DataHandler dataHandler;
	dataHandler = new DataHandler();
   	int thisMonth = 5;
	int thisDay = 5;
 	int thisYear = 2018;
	Calendar calendar = new GregorianCalendar(thisYear, thisMonth, thisDay);
	Appt appt0 = new Appt(15, 30, 9, 11, 2018, "Bachelor Party", "This is my bachelor party", "bach@gmail.com");
	assertTrue(dataHandler.save());
	assertTrue(dataHandler.saveAppt(appt0));
	assertTrue(dataHandler.deleteAppt(appt0));
  }
 //  @Test(timeout = 4000)
 //  public void test01()  throws Throwable  {
 //  	DataHandler dataHandler = new DataHandler();
 //  	GregorianCalendar today1 = new GregorianCalendar(2000, 4, 20);
 // 	GregorianCalendar tomorrow1 = new GregorianCalendar(2018, 4, 20);
 // // 	Appt appt11 = new Appt(15, 30, 5, 5, 2018, "Bachelor Party", "This is my bachelor party", "bach@gmail.com");
	// // dataHandler.saveAppt(appt11);
	// // Appt appt12 = new Appt(15, 30, 6, 5, 2018, "Bachelor Party", "This is my bachelor party", "bach@gmail.com");
	// // dataHandler.saveAppt(appt12);
	// dataHandler.getApptRange(today1,tomorrow1);
  // }
 //  @Test(timeout = 4000)
 //  public void test02()  throws Throwable  {
 //  	DataHandler dataHandler;
	// dataHandler = new DataHandler();
 //  	Calendar rightnow = Calendar.getInstance();
 //   	int thisMonth = rightnow.get(Calendar.MONTH);
	// int thisDay = rightnow.get(Calendar.DAY_OF_MONTH);
 // 	int thisYear = rightnow.get(Calendar.YEAR);
 //  	GregorianCalendar today = new GregorianCalendar(thisYear, thisMonth, thisDay);
 //  	GregorianCalendar tomorrow = new GregorianCalendar(thisYear,thisMonth,thisDay);
	// tomorrow.add(today.DAY_OF_MONTH,1);
 //    LinkedList<CalDay> calDays = new LinkedList<CalDay>();
	
	// Appt appt2 = new Appt(15, 30, 9, 11, 2018, "Bachelor Party", "This is my bachelor party", "bach@gmail.com");
	// dataHandler.saveAppt(appt2);
	// Appt appt3 = new Appt(15, 30, 10, 11, 2018, "Bachelor Party", "This is my bachelor party", "bach@gmail.com");
	// dataHandler.saveAppt(appt3);

	// DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyy");
 //  	calDays = (LinkedList<CalDay>) dataHandler.getApptRange(today,tomorrow);	
	// for (int i = 0; i < calDays.size(); i++){
		
	// 	CalDay calday= calDays.get(i);
		
	// 	String str= calday.getFullInfomrationApp(calday);
	// 	System.out.println(str);

	// 	LinkedList<Appt>  appts =calDays.get(i).getAppts();
	// 	for(int index=0; index < appts.size();index++){
	// 		Appt appt_=appts.get(index);
	// 		System.out.println("\n\n"+appt_.toString());
	// 	}
	// }
	
 //  }
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
  	DataHandler dataHandler;
	dataHandler = new DataHandler();
   	int thisMonth = 5;
	int thisDay = 5;
 	int thisYear = 2018;
	Calendar calendar = new GregorianCalendar(thisYear, thisMonth, thisDay);
	Appt appt3 = new Appt(15, 30, 9, 24, 2018, "Bachelor Party", "This is my bachelor party", "bach@gmail.com");
	appt3.setValid();
	dataHandler.saveAppt(appt3);
	int[] recurDaysArr = null;
	appt3.setRecurrence(recurDaysArr, 1, 2, 1);
	assertFalse(dataHandler.deleteAppt(appt3));
  }
 //  @Test(timeout = 4000)
 //  public void test04()  throws Throwable  {
 //  	DataHandler dataHandler4;
	// dataHandler4 = new DataHandler();
 //  	int thisMonth = 5;
	// int thisDay = 5;
 // 	int thisYear = 2018;
 //  	GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
 // 	GregorianCalendar tomorrow = new GregorianCalendar(thisYear,thisMonth,thisDay + 1);
 //    LinkedList<CalDay> calDays4 = new LinkedList<CalDay>();
	// calDays4 = (LinkedList<CalDay>) dataHandler4.getApptRange(today,tomorrow);
 //  }
}