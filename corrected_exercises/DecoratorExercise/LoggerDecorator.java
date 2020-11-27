abstract public class LoggerDecorator implements ILogger {
    private ILogger decoratedLoggerReference;

    public LoggerDecorator(ILogger decoratedLoggerReference) {
        this.decoratedLoggerReference = decoratedLoggerReference;
    }

    @Override
    public void log(String msg) {
        this.decoratedLoggerReference.log(msg);
    }
}
