
package finalprojectB;

import junit.framework.TestCase;

//You can use this as a skeleton for your 3 different test approach
//It is an optional to use this file, you can generate your own test file(s) to test the target function!
// Again, it is up to you to use this file or not!





public class UrlValidatorTest extends TestCase {


   public UrlValidatorTest(String testName) {
      super(testName);
   }

   
   
   public void testManualTest()
   {
// You can use this function to implement your manual testing
	System.out.printf("\nTesting manually...\n");
	String goodURL = "http://www.google.com:80";
	String badURL = "http://badurl";
	UrlValidator whee = new UrlValidator();

//	assertTrue(whee.isValid(goodURL));
	System.out.printf("\nAsserting true for isValid(http://www.google.com:80):" + whee.isValid(goodURL) + "\n");
//	assertFalse(whee.isValid(badURL));
	System.out.printf("\nAsserting false for isValid(badurl):" + whee.isValid(badURL) + "\n\n");
   }
   
   
   public void testPartitionTest()
   {
	// You can use this function to implement your First Partition testing	   
	System.out.printf("\nTesting partitions...\n");
	String goodURL = "http://www.google.com:80";
	UrlValidator uValidate1 = new UrlValidator();

	// assertTrue(uValidate1.isValid(goodURL));
	System.out.printf("\nConfirming base case true for isValid(http://www.google.com:80):" + uValidate1.isValid(goodURL) + "\n");

	String badURL1 = "3ht://www.google.com";
	// assertFalse(uValidate1.isValid(badURL1));
	System.out.printf("\nAsserting false for isValid(3ht://www.google.com)... Testing the scheme:" + uValidate1.isValid(badURL1) + "\n");
	
	String badURL2 = "http://go.a";
	// assertFalse(uValidate1.isValid(badURL2));
	System.out.printf("\nAsserting false for isValid(http://go.a)... Testing the authority:" + uValidate1.isValid(badURL2) + "\n");

	String badURL3 = "http://www.google.com:fde";
	// assertFalse(uValidate1.isValid(badURL3));
	System.out.printf("\nAsserting false for isValid(http://www.google.com:fde)... Testing the port:" + uValidate1.isValid(badURL3) + "\n");
	
    String goodURl2 = "file://www.google.com";
    System.out.printf("\nAsserting true for isValid(file://www.google.com)... Testing when scheme = \"file\":" + uValidate1.isValid(goodURl2) + "\n\n");

   }
   
   public void testIsValid()
   {
	   //You can use this function for programming based testing
   		System.out.printf("\nTesting programming based...\n");
   		UrlValidator uValidate2 = new UrlValidator();
   		String goodURL = "http://www.google.com:80";
   		String goodScheme = "http";
   		String goodAuthority = "www.google.com:80";
   		String goodPath = "";
   		String goodQuery = "";
   		String goodFragment = "";

   		String badURL = "http://google.www.moc:11";
   		String badScheme = "http";
   		String badAuthority = "google.www.moc:11";
   		String badPath = "";
   		String badQuery = "";
   		String badFragment = "";
   		Boolean isValid = false;

   		if (goodURL == null) {
            isValid = false;
        }

        if (goodURL != "http://www.google.com:80") {
            isValid = false;
        }

        if ((goodScheme != "http") || (goodScheme != "https") || (goodScheme != "ftp")) {
            isValid = false;
        }

        if (goodAuthority != "www.google.com:80") {
            isValid = false;
        }

        if (goodPath != "") {
            isValid = false;
        }

        if (goodQuery != "") {
            isValid = false;
        }

        if (goodFragment != "") {
            isValid = false;
        }

        isValid = true;

         System.out.printf("\nComparing testIsValid(http://www.google.com:80) with isValid(http://www.google.com:80)... Expecting True:" + (isValid && uValidate2.isValid(goodURL)) + "\n");

        if (badURL == null) {
            isValid = false;
        }

        if (badURL != "http://www.google.com:80") {
            isValid = false;
        }

        if ((badScheme != "http") || (badScheme != "https") || (badScheme != "ftp")) {
            isValid = false;
        }

        if (badAuthority != "www.google.com:80") {
            isValid = false;
        }

        if (badPath != "") {
            isValid = false;
        }

        if (badQuery != "") {
            isValid = false;
        }

        if (badFragment != "") {
            isValid = false;
        }

        isValid = true;

        System.out.printf("\nComparing testIsValid(http://google.www.moc:11) with isValid(http://www.google.com:80)... Expecting False:" + (isValid && uValidate2.isValid(badURL)) + "\n\n");
   }
   


}
