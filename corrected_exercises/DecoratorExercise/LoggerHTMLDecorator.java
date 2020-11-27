public class LoggerHTMLDecorator extends LoggerDecorator {

    public LoggerHTMLDecorator(ILogger decoratedLoggerReference) {
        super(decoratedLoggerReference);
    }

    @Override
    public void log(String msg) {
        String htmlString = "<p>" + msg + "</p>";
        super.log(htmlString);
    }
}
