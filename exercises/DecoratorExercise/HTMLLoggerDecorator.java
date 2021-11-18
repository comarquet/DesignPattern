import java.io.File;

public class HTMLLoggerDecorator extends AbstractLoggerDecorator {
    public HTMLLoggerDecorator(ILogger decoratedLogger) {
        super(decoratedLogger);
    }

    @Override
    public void log(String msg) {
        String htmlMessage = "<p>" + msg + "</p>";
        this.decoratedLogger.log(htmlMessage);
    }
}