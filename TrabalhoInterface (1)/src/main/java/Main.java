public class Main {
    public static void main(String[] args) {
        Logger consoleLogger = new ConsoleLogger();
        Logger fileLogger = new FileLogger("log.txt");

        consoleLogger.debug("Essa é uma mensagem de debug");
        consoleLogger.warning("Essa é uma mensagem de warning");
        consoleLogger.error("Essa é uma mensagem de error");

        fileLogger.debug("Essa é uma mensagem de debug");
        fileLogger.warning("Essa é uma mensagem de warning");
        fileLogger.error("Essa é uma mensagem de error");
    }
}
