/*
package common;


import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.uncommons.reportng.HTMLReporter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Listeners({ HTMLReporter.class, org.uncommons.reportng.JUnitXMLReporter.class })
public class BaseTest {
    protected static SimpleDateFormat dfRally = new SimpleDateFormat(
            "yyyy-MM-dd'T'hh:mm:ss.SSS'Z'");


    */
/**
     * Use it to log data to HTML test reports
     *
     * @param s
     *            - String to be looged in HTML reports
     *//*

    public static void log(String s) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        Reporter.log(dfRally.format(new Date()) + " :  " + s + "<br/>");
        System.out.println("[" + dateFormat.format(date) + "] " + s);
    }




}
*/
