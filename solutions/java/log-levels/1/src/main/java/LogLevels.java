public class LogLevels {
    
    public static String message(String logLine) {
        return logLine.split(":")[1].split("\r\n")[0].trim();
    }

    public static String logLevel(String logLine) {
        logLine.trim();
        return logLine.split("]")[0].substring(1).toLowerCase();
    }

    public static String reformat(String logLine) {
        StringBuilder sb = new StringBuilder();
        return sb.append(message(logLine)).append(" (").append(logLevel(logLine)).append(")").toString();
    }
}
