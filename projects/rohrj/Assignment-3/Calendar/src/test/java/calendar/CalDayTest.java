/** A JUnit test class to test the class CalDay. */

package calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import calendar.Appt;
import calendar.CalDay;
import calendar.DataHandler;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;


public class CalDayTest{

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
    DataHandler datahandler = new DataHandler();
    int thisMonth = 5;     	/** todays date **/
	int thisDay = 5;
   	int thisYear = 2018;
	GregorianCalendar calendar = new GregorianCalendar(thisYear, thisMonth, thisDay);
  	Appt appt0 = new Appt(15, 30, 9, 10, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
	CalDay calday = new CalDay(calendar);
	calday.addAppt(appt0);
    assertEquals(thisDay, calday.getDay());
    assertEquals(thisMonth + 1, calday.getMonth());
    assertEquals(thisYear, calday.getYear());
    assertEquals(1, calday.getSizeAppts());
    calday.getAppts();
  }
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
    //Calendar rightnow = Calendar.getInstance();
    int thisMonth = 5;     	/** todays date **/
	int thisDay = 5;
   	int thisYear = 2018;
	GregorianCalendar calendar = new GregorianCalendar(thisYear, thisMonth, thisDay);
  	Appt appt1 = new Appt(15, 30, 20, 4, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
	CalDay calday = new CalDay(calendar);
	calday.addAppt(appt1);
	String date = calday.toString();
	String buffer = calday.getFullInfomrationApp(calday);
	//assertEquals("4-19-2018 3:30pm Birthday Party This is my birthday party ", buffer);

  }
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
    //Calendar rightnow = Calendar.getInstance();
    int thisMonth = 5;     	/** todays date **/
	int thisDay = 5;
   	int thisYear = 2018;
	GregorianCalendar calendar = new GregorianCalendar(thisYear, thisMonth, thisDay);
  	Appt appt2 = new Appt(20, 4, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
	CalDay calday = new CalDay(calendar);
	calday.addAppt(appt2);
	String buffer = calday.getFullInfomrationApp(calday);
	//assertEquals("4-19-2018 3:30pm Birthday Party This is my birthday party ", buffer);
  }
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
    DataHandler datahandler = new DataHandler();
    //Calendar rightnow = Calendar.getInstance();
    int thisMonth = 5;     	/** todays date **/
	int thisDay = 5;
   	int thisYear = 2018;
	GregorianCalendar calendar = new GregorianCalendar(thisYear, thisMonth, thisDay);
  	Appt appt3 = new Appt(11, 30, 20, 4, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
	CalDay calday = new CalDay(calendar);
	calday.addAppt(appt3);
	String buffer = calday.getFullInfomrationApp(calday);
	//assertEquals("4-19-2018 3:30pm Birthday Party This is my birthday party ", buffer);
  }
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
    //Calendar rightnow = Calendar.getInstance();
    int thisMonth = 5;     	/** todays date **/
	int thisDay = 5;
   	int thisYear = 2018;
	GregorianCalendar calendar = new GregorianCalendar(thisYear, thisMonth, thisDay);
  	Appt appt4 = new Appt(0, 30, 20, 4, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
	CalDay calday = new CalDay(calendar);
	calday.addAppt(appt4);
	String buffer = calday.getFullInfomrationApp(calday);
	//assertEquals("4-19-2018 3:30pm Birthday Party This is my birthday party ", buffer);
  }
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
    //Calendar rightnow = Calendar.getInstance();
    int thisMonth = 5;     	/** todays date **/
	int thisDay = 5;
   	int thisYear = 2018;
	GregorianCalendar calendar = new GregorianCalendar(thisYear, thisMonth, thisDay);
  	Appt appt5 = new Appt(15, 5, 20, 4, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
	CalDay calday = new CalDay(calendar);
	// calday.valid = false;
	calday.addAppt(appt5);
	String date = calday.toString();
	String buffer = calday.getFullInfomrationApp(calday);
	//assertEquals("4-19-2018 3:30pm Birthday Party This is my birthday party ", buffer);
  }
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
    CalDay calday = new CalDay();
    String date6 = calday.toString();
    assertEquals(0, calday.getDay());
    assertEquals(0, calday.getMonth());
    assertEquals(0, calday.getYear());
    calday.getAppts();
  }
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
    DataHandler datahandler = new DataHandler();
    GregorianCalendar calendar = new GregorianCalendar(2018, 4, 20);
    CalDay calday = new CalDay(calendar);
    Appt appt7 = new Appt(15, 30, 9, 10, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
    calday.addAppt(appt7);
     Appt appt8 = new Appt(12, 30, 9, 10, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
    calday.addAppt(appt8);
    calday.getFullInfomrationApp(calday);
    assertEquals(2, calday.getSizeAppts());
    String string7 = calday.toString();
  }
}
