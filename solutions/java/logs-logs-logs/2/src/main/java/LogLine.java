public class LogLine {

    private String logLine;

    public LogLine(String logLine) {
        this.logLine=logLine;
    }

    public LogLevel getLogLevel() {
        String code=this.logLine.substring(1,4);
        return switch(code) {
            case "INF" -> LogLevel.INFO;
            case "DBG" -> LogLevel.DEBUG;
            case "TRC" -> LogLevel.TRACE;
            case "WRN" -> LogLevel.WARNING;
            case "ERR" -> LogLevel.ERROR;
            case "FTL" -> LogLevel.FATAL; 
            default -> LogLevel.UNKNOWN;
        };
       
    }

    public String getOutputForShortLog() {
        return getLogLevel().getEncodedLevel()+":"+this.logLine.substring(this.logLine.indexOf(":")+ 1).trim();    
    }
}
