public class LogLine {

    private final String rawLine;

    public LogLine(String rawLine) {
        this.rawLine = rawLine;
    }

    public LogLevel getLogLevel() {
        if (rawLine.startsWith("[TRC]")) return LogLevel.TRACE;
        if (rawLine.startsWith("[DBG]")) return LogLevel.DEBUG;
        if (rawLine.startsWith("[INF]")) return LogLevel.INFO;
        if (rawLine.startsWith("[WRN]")) return LogLevel.WARNING;
        if (rawLine.startsWith("[ERR]")) return LogLevel.ERROR;
        if (rawLine.startsWith("[FTL]")) return LogLevel.FATAL;
        return LogLevel.UNKNOWN;
    }

     public String getOutputForShortLog() {
        int levelCode = getLogLevel().getCode();
        String message = rawLine.split("]:", 2)[1];
        return levelCode + ":" + message.trim();
    }
}
