import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileLogger implements Logger {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private String filename;

    public FileLogger(String filename) {
        this.filename = filename;
    }

    public void debug(String message) {
        logToFile("DEBUG", message);
    }

    public void warning(String message) {
        logToFile("WARNING", message);
    }

    public void error(String message) {
        logToFile("ERROR", message);
    }

    private void logToFile(String level, String message) {
        String timestamp = LocalDateTime.now().format(formatter);
        String logMessage = timestamp + " " + level + ": " + message + System.lineSeparator();
        try {
            Files.write(Paths.get(filename), logMessage.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
