package com.company.Pacade;

public class Client {

    public static void main(String[] args) {
        EmailSettings emailSettings = new EmailSettings();
        emailSettings.setHost("127.0.0.1");

        //EmailSender emailSender = new EmailSender(emailSettings);

        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setFrom("보낸사람");
        emailMessage.setTo("받는사람");
        emailMessage.setCc("주세");
        emailMessage.setSubject("제목");
        emailMessage.setText("내용");

        //emailSender.sendEmail(emailMessage);
    }
}
