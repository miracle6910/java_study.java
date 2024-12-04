package Stepik._4_Exeptions.MailService;

public class Thief implements MailService {
    private int minStolenPrice;

    private int stolenPrice;

    public Thief(int minPrice) {

        this.minStolenPrice = minPrice;

    }

    public int getStolenValue() {

        return stolenPrice;

    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            Package pac = ((MailPackage) mail).getContent();
            if (pac.getPrice() >= minStolenPrice) {
                stolenPrice += pac.getPrice();
                mail = new MailPackage(mail.getFrom(), mail.getTo(), new Package("stones instead of " + ((MailPackage) mail).getContent(),0 ));
            }
        }
        return mail;
    }
}
