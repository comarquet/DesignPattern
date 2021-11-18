public abstract class AbstractLoggerDecorator implements ILogger{

    protected ILogger decoratedLogger;

    public AbstractLoggerDecorator(ILogger decoratedLogger) {
        this.decoratedLogger = decoratedLogger;
    }

    @Override
    public void log(String msg) {
        this.decoratedLogger.log(msg);
    }

}
