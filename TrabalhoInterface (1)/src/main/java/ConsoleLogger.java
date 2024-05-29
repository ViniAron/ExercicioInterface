import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConsoleLogger implements Logger {
    private static final String RESET = "\u001B[0m";
    private static final String GREEN = "\u001B[32m";
    private static final String YELLOW = "\u001B[33m";
    private static final String RED = "\u001B[31m";
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public void debug(String message) {
        String timestamp = LocalDateTime.now().format(formatter);
        System.out.println(GREEN + timestamp + " DEBUG: " + message + RESET);
    }

    public void warning(String message) {
        String timestamp = LocalDateTime.now().format(formatter);
        System.out.println(YELLOW + timestamp + " WARNING: " + message + RESET);
    }

    public void error(String message) {
        String timestamp = LocalDateTime.now().format(formatter);
        System.out.println(RED + timestamp + " ERROR: " + message + RESET);
    }
}
