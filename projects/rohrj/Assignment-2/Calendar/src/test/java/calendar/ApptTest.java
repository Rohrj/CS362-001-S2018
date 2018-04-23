/** A JUnit test class to test the class ApptTest. */

package calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import calendar.Appt;
import calendar.CalendarUtil;
public class ApptTest  {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Appt appt0 = new Appt(15, 30, 9, 11, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
      String string0 = appt0.toString();
      assertEquals(2, appt0.getRecurBy());
      assertFalse(appt0.isRecurring());
      assertEquals("\t11/9/2018 at 3:30pm ,Birthday Party, This is my birthday party\n", string0);
      assertEquals(0, appt0.getRecurIncrement());
      appt0.setValid();
  }
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Appt appt1 = new Appt(15, 30, -9, 11, 2018, "Bachelor Party", "This is my bachelor party", "bach@gmail.com");
      appt1.setValid();
      boolean validity = appt1.getValid();
      assertEquals(false, validity);
  }
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Appt appt2 = new Appt(15, 30, 9, 11, 2018, "Bachelor Party", "This is my bachelor party", "bach@gmail.com");
      assertEquals(true, appt2.hasTimeSet());    
      assertTrue(appt2.isOn(9, 12, 2018));
  }
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Appt appt3 = new Appt(15, 30, 9, 11, 2018, "Bachelor Party", "This is my bachelor party", "bach@gmail.com");
      assertEquals("bach@gmail.com", appt3.getEmailAddress());   
      assertTrue(appt3.isOn(9, 11, 2018));
  }
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Appt appt4 = new Appt(15, 30, 40, 11, 2018, "Bachelor Party", "This is my bachelor party", "bach@gmail.com");
      appt4.setValid();
      boolean validity = appt4.getValid();
      assertEquals(true, validity);
  }
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Appt appt5 = new Appt(15, 30, 9, 13, 2018, "Bachelor Party", "This is my bachelor party", "bach@gmail.com");
      appt5.setValid();
      boolean validity = appt5.getValid();
      assertEquals(true, validity);
  }
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Appt appt6 = new Appt(25, 30, 9, 11, 2018, "Bachelor Party", "This is my bachelor party", "bach@gmail.com");
      appt6.setValid();
      boolean validity = appt6.getValid();
      assertEquals(true, validity);
  }
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Appt appt7 = new Appt(15, 30, 9, 11, 2018, "Bachelor Party", "This is my bachelor party", "bach@gmail.com");  
      assertTrue(appt7.isOn(10, 11, 2018));
  }
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Appt appt8 = new Appt(9, 11, 2018, "Bachelor Party", "This is my bachelor party", "bach@gmail.com");    
      appt8.setStartHour(15);
      appt8.setValid();
      assertTrue(appt8.isOn(9, 11, 2017));
  }
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Appt appt9 = new Appt(9, 11, 2018, "", "", "bach@gmail.com");
      appt9.setValid();
      assertTrue(appt9.hasTimeSet());
  }
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Appt appt10 = new Appt(15, 30, 9, -1, 2018, "Bachelor Party", "This is my bachelor party", "bach@gmail.com");
      appt10.setValid();
      // assertTrue(appt10.getValid());
      Appt appt102 = new Appt(15, 30, 9, 11, -2043, "Bachelor Party", "This is my bachelor party", "bach@gmail.com");
      appt102.setValid();
      // assertTrue(appt102.getValid());
      Appt appt103 = new Appt(15, 70, 9, 11, 2043, "Bachelor Party", "This is my bachelor party", "bach@gmail.com");
      appt103.setValid();
      assertTrue(appt103.getValid());
  }
}