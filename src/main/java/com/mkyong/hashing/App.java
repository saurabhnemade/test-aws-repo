package com.mkyong.hashing;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Hello World!" );
        String command = "cat /tmp/cred.xml | java -jar ./jenkins-cli.jar -s " + args[0] + " -auth admin:" + args[1] + " create-credentials-by-xml system::system::jenkins _";
        System.out.println("Executing: " + command);
        ProcessBuilder builder = new ProcessBuilder(command);
        Process process = builder.start();
    }
}
