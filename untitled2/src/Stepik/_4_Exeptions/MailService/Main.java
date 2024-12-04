package Stepik._4_Exeptions.MailService;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        MailService spy = new Spy(Logger.getLogger(Class.class.getName()));
        MailService thief = new Thief(10);
        MailService inspector = new Inspector();
        MailService[] array = {spy, thief, inspector};

        MailMessage mail_0 = new MailMessage("DAUN", "DEBIL", "OK");
        MailMessage mail_1 = new MailMessage("IVAN", "BARAN", "QWERTY");
        MailMessage mail_2 = new MailMessage("AUSTIN_POWERS", "James Bond", "Big secret!");

        MailPackage mail_3 = new MailPackage("GANGSTA", "NIGGA", new Package("WEAPONS", 0));
        MailPackage mail_4 = new MailPackage("ALIEXPRESS", "IVAN777", new Package("ITEMS", 25));
        MailPackage mail_5 = new MailPackage("AUSTIN_POWERS", "CRAZY_SHIT", new Package("BANNED_SUBSTANCE", 0));

        UntrustworthyMailWorker worker = new UntrustworthyMailWorker(array);
        try {
            worker.processMail(mail_0);
        } catch (RuntimeException re) {
            System.out.println(re.getMessage());
        }
        try {
            worker.processMail(mail_1);
        } catch (RuntimeException re) {
            System.out.println(re.getMessage());
        }
        try {
            worker.processMail(mail_2);
        } catch (RuntimeException re) {
            System.out.println(re.getMessage());
        }
        try {
            worker.processMail(mail_3);
        } catch (RuntimeException re) {
            System.out.println(re.getMessage());
        }
        try {
            worker.processMail(mail_4);
        } catch (RuntimeException re) {
            System.out.println(re.getMessage());
        }
        try {
            worker.processMail(mail_5);
        } catch (RuntimeException re) {
            System.out.println(re.getMessage());
        }

        System.out.println("УКРАДЕНО НА $" + ((Thief)thief).getStolenValue() + "!");
    }
}
