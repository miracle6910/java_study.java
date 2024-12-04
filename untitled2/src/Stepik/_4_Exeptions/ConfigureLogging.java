package Stepik._4_Exeptions;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class ConfigureLogging {

    private static void configureLogging() {
        Logger LOGGER1 = Logger.getLogger("org.stepic.java.logging.ClassA");
        LOGGER1.setLevel(Level.ALL);

        Logger LOGGER2 = Logger.getLogger("org.stepic.java.logging.ClassB");
        LOGGER2.setLevel(Level.WARNING);

        Logger LOGGER3 = Logger.getLogger("org.stepic.java");
        LOGGER3.setLevel(Level.ALL);
        LOGGER3.setUseParentHandlers(false);

        ConsoleHandler handler = new ConsoleHandler();
        handler.setFormatter(new XMLFormatter());
        handler.setLevel(Level.ALL);
        LOGGER3.addHandler(handler);
    }
}