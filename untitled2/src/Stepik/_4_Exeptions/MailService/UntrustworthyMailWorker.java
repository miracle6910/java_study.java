package Stepik._4_Exeptions.MailService;

public class UntrustworthyMailWorker implements MailService {
    private final MailService realMailService = new RealMailService();
    private MailService[] mailServices;

    public UntrustworthyMailWorker(MailService[] services) {
        mailServices = services;
    }

    public MailService getRealMailService() {
        return realMailService;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        Sendable processed = mail;
        for (MailService mailService : mailServices) {
            processed = mailService.processMail(processed);
        }
        return realMailService.processMail(mail);
    }
}


