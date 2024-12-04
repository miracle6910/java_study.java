package Stepik._4_Exeptions.MailService;

public class Inspector implements MailService {

    private static final String[] ILLEGAL_CONTENT =
            new String[] {"WEAPONS", "BANNED_SUBSTANCE"};
    public static class IllegalPackageException extends RuntimeException {}
    public static class StolenPackageException extends RuntimeException {}

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            Package pac = ((MailPackage) mail).getContent();
            String content = pac.getContent();
            if ("stones".contains(content)) {
                throw new StolenPackageException();
            }
            for (String illegalString : ILLEGAL_CONTENT) {
                if (content.contains(illegalString)) {
                    throw new IllegalPackageException();
                }
            }
        }
        return mail;
        }
    }