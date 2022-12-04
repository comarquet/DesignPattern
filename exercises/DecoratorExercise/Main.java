/*
 * Main.java
 */
public class Main {
  
  public static void main(String[] args) {

    /*
     * We have a ILogger interface, that allow to use a logging service, it provides a log() method.
     *
     * Right now we have a simple FileLogger, which prints logs in a text file, each logged message on a new line
     *
     * We would like to extend its functionality, by printing the logs in HTML format.
     *
     * Current output of the program in the log file :
     * Hello
     * World
     *
     * Expected output :
     * <p>Hello</p>
     * <p>World</p>
     *
     * How do you solve this problem, without modifying the FileLogger (we want it to work as it is for
     * other cases in which we don't need HTML format), using the Decorator Design Pattern ?
     *
     */

    ILogger logger = new FileLogger();

    logger.log("Hello");
    logger.log("World");
  }
  
}
