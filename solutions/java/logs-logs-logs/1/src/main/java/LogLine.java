public class LogLine {

    private final String Logline;
    public LogLine(String logLine) {
        this.Logline = logLine;
    }

    public LogLevel getLogLevel() {
        String logstr = Logline.substring(1,4);
        switch(logstr){
            case "TRC":
                return LogLevel.TRACE;
            case "DBG":
                return LogLevel.DEBUG;
            case "INF":
                return LogLevel.INFO;
            case "WRN":
                return LogLevel.WARNING;
            case "ERR":
                return LogLevel.ERROR;
            case "FTL":
                return LogLevel.FATAL;      
        }
        return LogLevel.UNKNOWN;
    }

    public String getOutputForShortLog() {
        String logstr = Logline.substring(1,4);
        String loglong = Logline.substring(7);
        switch(logstr){
            case "TRC":
                return LogLevel.TRACE.getValue() + ":" + loglong;
            case "DBG":
                return LogLevel.DEBUG.getValue() + ":" + loglong;
            case "INF":
                return LogLevel.INFO.getValue() + ":" + loglong;
            case "WRN":
                return LogLevel.WARNING.getValue() + ":" + loglong;
            case "ERR":
                return LogLevel.ERROR.getValue() + ":" + loglong;
            case "FTL":
                return LogLevel.FATAL.getValue() + ":" + loglong; 
        }
        return LogLevel.UNKNOWN.getValue() + ":" + loglong;
    }
}
