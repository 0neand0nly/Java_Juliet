/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE78_OS_Command_Injection__Environment_53b.java
Label Definition File: CWE78_OS_Command_Injection.label.xml
Template File: sources-sink-53b.tmpl.java
*/
/*
 * @description
 * CWE: 78 OS Command Injection
 * BadSource: Environment Read data from an environment variable
 * GoodSource: A hardcoded string
 * Sinks: exec
 *    BadSink : dynamic command execution with Runtime.getRuntime().exec()
 * Flow Variant: 53 Data flow: data passed as an argument from one method through two others to a fourth; all four functions are in different classes in the same package
 *
 * */

package testcases.CWE78_OS_Command_Injection;

import testcasesupport.*;

import javax.servlet.http.*;

public class CWE78_OS_Command_Injection__Environment_53b
{
    public void badSink(String data ) throws Throwable
    {
        (new CWE78_OS_Command_Injection__Environment_53c()).badSink(data );
    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(String data ) throws Throwable
    {
        (new CWE78_OS_Command_Injection__Environment_53c()).goodG2BSink(data );
    }
}
