package com.springlearning.email;

import com.springlearning.entity.EmailEntity;
import com.springlearning.model.EmailModel;
import com.springlearning.services.MailSenderSpring;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import utils.EmailUtils;
import freemarker.template.Configuration;
import freemarker.template.TemplateException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.ui.freemarker.FreeMarkerConfigurationFactoryBean;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.MimeMessage;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
@DataJpaTest
class EmailApplicationTests {


    @InjectMocks
    private MailSenderSpring emailService;
    @Mock
    private JavaMailSender javaMailSender;
    private MimeMessage mimeMessage;
    private Configuration fmConfiguration;
    private EmailModel emailModel;
    private EmailEntity emailEntity;


    @BeforeEach
    void init() throws TemplateException, IOException {
        emailModel = EmailUtils.getEmailModel();
        emailEntity = EmailUtils.getEmailEntity();
        mimeMessage = new MimeMessage((Session) null);
        ReflectionTestUtils.setField(emailService, "fmConfiguration", fmConfiguration);
        FreeMarkerConfigurationFactoryBean fmConfigFactoryBean = new FreeMarkerConfigurationFactoryBean();
        fmConfigFactoryBean.setPreferFileSystemAccess(false);
        fmConfigFactoryBean.setTemplateLoaderPath("/templates/");
        fmConfigFactoryBean.afterPropertiesSet();
        fmConfiguration = fmConfigFactoryBean.getObject();
        ReflectionTestUtils.setField(emailService, "fmConfiguration", fmConfiguration);
    }


    @Test
    void sendEmailWithTemplateTest() {
        when(javaMailSender.createMimeMessage()).thenReturn(mimeMessage);
        emailService.sendEmailWithTemplate(emailModel);
        verify(javaMailSender, times(1)).send((MimeMessage) any());
    }

    @Test
    void sendEmailWithAttachmentTest() throws MessagingException {
        when(javaMailSender.createMimeMessage()).thenReturn(mimeMessage);
        emailService.sendEmailWithAttachment(emailModel);
        verify(javaMailSender, times(1)).send((MimeMessage) any());
    }

    @Test
    void sendEmailWithExceptionTest() {
        assertThrows(NullPointerException.class, () -> emailService.sendEmailWithTemplate(emailModel),
                "Expecting NullPointerException");
    }


}
