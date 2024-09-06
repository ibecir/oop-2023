package year2023.week7.lectures.preparation.interfcate;

public interface Mailer<T> {
    public void sendEmail(String recipient, String subject, String body);
}

class MailGrid implements Mailer {
    @Override
    public void sendEmail(String recipient, String subject, String body){
        System.out.println("Email has been sent from MailGrid");
    }
}

class Mailgun implements Mailer{
    @Override
    public void sendEmail(String recipient, String subject, String body){
        System.out.println("Email has been sent from Mailgun");
    }
}

class MainClassForSendingEmail{
    public static void main(String[] args) {
        Mailer m = new Mailgun();
        m.sendEmail("becir", "KASNIS", "45 zavrsava cas");

    }
}
