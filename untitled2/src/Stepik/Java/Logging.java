package Stepik.Java;

import Stepik.LogDemo;

import java.util.logging.*;

public class Logging {
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

    public static void main(String[] args) {
        configureLogging();
        Logger LOGGER1 = Logger.getLogger("org.stepic.java.logging.ClassA");
        LOGGER1.info("INFO FROM CLASS_A");

        Logger LOGGER2 = Logger.getLogger("org.stepic.java.logging.ClassB");
        LOGGER2.warning("WARNING FROM CLASS_B");
        LOGGER2.info("INFO FROM CLASS_B");

        Logger LOGGER3 = Logger.getLogger("org.stepic.java");
        LOGGER3.info("INFO MESSAGE FROM org.stepic.java");
    }
}
