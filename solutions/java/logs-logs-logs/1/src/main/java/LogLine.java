public class LogLine {

    private LogLevel level;
    private String logLine;

    public LogLine(String logLine) {
        this.logLine=logLine;
    }

    public LogLevel getLogLevel() {
        String code=this.logLine.substring(1,4);
        this.level = switch(code) {
            case "INF" -> LogLevel.INFO;
            case "DBG" -> LogLevel.DEBUG;
            case "TRC" -> LogLevel.TRACE;
            case "WRN" -> LogLevel.WARNING;
            case "ERR" -> LogLevel.ERROR;
            case "FTL" -> LogLevel.FATAL; 
            default -> LogLevel.UNKNOWN;
        };
        return this.level;
        
    }

    public String getOutputForShortLog() {
        int code=getLogLevel().getEncodedLevel();
        int colonIndex = this.logLine.indexOf(":");
        return code+":"+ this.logLine.substring(colonIndex+ 1).trim();
        
    }
}
