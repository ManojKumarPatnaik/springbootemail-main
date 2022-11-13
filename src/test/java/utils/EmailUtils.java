package utils;

import com.springlearning.entity.EmailEntity;
import com.springlearning.model.EmailModel;
import org.springframework.mail.SimpleMailMessage;

public class EmailUtils {

    public static EmailModel getEmailModel() {
        EmailModel emailModel =  new EmailModel();
        emailModel.setContent("Html content");
        emailModel.setFrom("Manojkumar.Uriti@cantire.com");
        emailModel.setTo("Manojkumar.Uriti@cantire.com");
        emailModel.setSubject("Uploaded duty rate from catt file");
        return emailModel;
    }
    public static SimpleMailMessage getSimpleMailMessage(){
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo("Manojkumar.Uriti@cantire.com");
        mailMessage.setFrom("Manojkumar.Uriti@cantire.com");
        mailMessage.setSubject("Uploaded duty rate from catt file");
        mailMessage.setText("Html content");
        return  mailMessage;
    }

    public static EmailEntity getEmailEntity() {
        EmailEntity emailEntity = new EmailEntity();
        emailEntity.setFrom("Manojkumar.Uriti@cantire.com");
        emailEntity.setTo("Manojkumar.Uriti@cantire.com");
        emailEntity.setSubject("Uploaded duty rate from catt file");
        return emailEntity;
    }
}
