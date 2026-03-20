public class LogLevels {
    
    public static String message(String logLine) {
        String str=logLine.trim();
        int whitespace=str.indexOf(" ");
        str=str.substring(whitespace+1);
        return str.trim();
    }

    public static String logLevel(String logLine) {
        String str=logLine.trim();
        int closingBracket=str.indexOf("]");
        str=str.substring(1,closingBracket);
        return str.toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine)+" ("+logLevel(logLine)+")";
    }
}
