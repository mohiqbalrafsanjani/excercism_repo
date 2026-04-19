public class LogLevels {
    
    public static String message(String logLine) {
        String[] mark = logLine.split(": ");
        String result = mark[1].trim();
        return result;
    }

    public static String logLevel(String logLine) {
        
        String[] mark = logLine.split("[\\p{Punct}\\s]+");
        String result = mark[1].trim().toLowerCase();
        return result;
    }

    public static String reformat(String logLine) {
        String[] mark = logLine.split("[\\p{Punct}\\s]+");
        String result_code = mark[1].trim().toLowerCase();
        String result_msg = mark[2] + " " + mark[3];
        String result = result_msg + " (" + result_code + ")";
        return result;
    }
    
}
