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
    Calendar rightnow = Calendar.getInstance();
    int thisMonth = rightnow.get(Calendar.MONTH);     	/** todays date **/
	int thisDay = rightnow.get(Calendar.DAY_OF_MONTH);
   	int thisYear = rightnow.get(Calendar.YEAR);
	GregorianCalendar calendar = new GregorianCalendar(thisYear, thisMonth, thisDay);
  	Appt appt0 = new Appt(15, 30, 9, 11, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
	CalDay calday = new CalDay(calendar);
	calday.addAppt(appt0);
    assertEquals(19, calday.getDay());
    assertEquals(4, calday.getMonth());
    assertEquals(2018, calday.getYear());
    assertEquals(0, calday.getSizeAppts());
  }
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
    Calendar rightnow = Calendar.getInstance();
    int thisMonth = rightnow.get(Calendar.MONTH);     	/** todays date **/
	int thisDay = rightnow.get(Calendar.DAY_OF_MONTH);
   	int thisYear = rightnow.get(Calendar.YEAR);
	GregorianCalendar calendar = new GregorianCalendar(thisYear, thisMonth, thisDay);
  	Appt appt1 = new Appt(15, 30, 20, 4, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
	CalDay calday = new CalDay(calendar);
	calday.addAppt(appt1);
	String date = calday.toString();
	String buffer = calday.getFullInfomrationApp(calday);
	assertEquals("4-19-2018 3:30pm Birthday Party This is my birthday party ", buffer);

  }
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
    Calendar rightnow = Calendar.getInstance();
    int thisMonth = rightnow.get(Calendar.MONTH);     	/** todays date **/
	int thisDay = rightnow.get(Calendar.DAY_OF_MONTH);
   	int thisYear = rightnow.get(Calendar.YEAR);
	GregorianCalendar calendar = new GregorianCalendar(thisYear, thisMonth, thisDay);
  	Appt appt2 = new Appt(20, 4, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
	CalDay calday = new CalDay(calendar);
	calday.addAppt(appt2);
	String buffer = calday.getFullInfomrationApp(calday);
	assertEquals("4-19-2018 3:30pm Birthday Party This is my birthday party ", buffer);
  }
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
    Calendar rightnow = Calendar.getInstance();
    int thisMonth = rightnow.get(Calendar.MONTH);     	/** todays date **/
	int thisDay = rightnow.get(Calendar.DAY_OF_MONTH);
   	int thisYear = rightnow.get(Calendar.YEAR);
	GregorianCalendar calendar = new GregorianCalendar(thisYear, thisMonth, thisDay);
  	Appt appt3 = new Appt(11, 30, 20, 4, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
	CalDay calday = new CalDay(calendar);
	calday.addAppt(appt3);
	String buffer = calday.getFullInfomrationApp(calday);
	assertEquals("4-19-2018 3:30pm Birthday Party This is my birthday party ", buffer);
  }
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
    Calendar rightnow = Calendar.getInstance();
    int thisMonth = rightnow.get(Calendar.MONTH);     	/** todays date **/
	int thisDay = rightnow.get(Calendar.DAY_OF_MONTH);
   	int thisYear = rightnow.get(Calendar.YEAR);
	GregorianCalendar calendar = new GregorianCalendar(thisYear, thisMonth, thisDay);
  	Appt appt4 = new Appt(0, 30, 20, 4, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
	CalDay calday = new CalDay(calendar);
	calday.addAppt(appt4);
	String buffer = calday.getFullInfomrationApp(calday);
	assertEquals("4-19-2018 3:30pm Birthday Party This is my birthday party ", buffer);
  }
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
    Calendar rightnow = Calendar.getInstance();
    int thisMonth = rightnow.get(Calendar.MONTH);     	/** todays date **/
	int thisDay = rightnow.get(Calendar.DAY_OF_MONTH);
   	int thisYear = rightnow.get(Calendar.YEAR);
	GregorianCalendar calendar = new GregorianCalendar(thisYear, thisMonth, thisDay);
  	Appt appt5 = new Appt(15, 5, 20, 4, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
	CalDay calday = new CalDay(calendar);
	calday.valid = false;
	calday.addAppt(appt5);
	String date = calday.toString();
	String buffer = calday.getFullInfomrationApp(calday);
	assertEquals("4-19-2018 3:30pm Birthday Party This is my birthday party ", buffer);
  }

}
