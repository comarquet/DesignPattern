/*
 * FileLogger.java
 */
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 * Service de log dans un fichier (ConcreteComponent)
 */
public class FileLogger implements ILogger {
  
  public synchronized void log(String msg) {
    try {
      PrintWriter out = new PrintWriter(new FileOutputStream("Test.log", true));
      out.println(msg);
      out.close();
    } catch (FileNotFoundException ex) {
      ex.printStackTrace();
    }
  }
  
}
