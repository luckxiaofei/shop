package com.fei.common.notify.config;

import com.fei.common.notify.AliyunSmsSender;
import com.fei.common.notify.NotifyService;
import com.fei.common.notify.TencentSmsSender;

import com.github.qcloudsms.SmsSingleSender;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

@Configuration
@EnableConfigurationProperties(com.fei.common.notify.config.NotifyProperties.class)
public class NotifyAutoConfiguration {

    private final com.fei.common.notify.config.NotifyProperties properties;

    public NotifyAutoConfiguration(com.fei.common.notify.config.NotifyProperties properties) {
        this.properties = properties;
    }

    @Bean
    public NotifyService notifyService() {
        NotifyService notifyService = new NotifyService();

        com.fei.common.notify.config.NotifyProperties.Mail mailConfig = properties.getMail();
        if (mailConfig.isEnable()) {
            notifyService.setMailSender(mailSender());
            notifyService.setSendFrom(mailConfig.getSendfrom());
            notifyService.setSendTo(mailConfig.getSendto());
        }

        com.fei.common.notify.config.NotifyProperties.Sms smsConfig = properties.getSms();
        if (smsConfig.isEnable()) {
            if(smsConfig.getActive().equals("tencent")) {
                notifyService.setSmsSender(tencentSmsSender());
            }
            else if(smsConfig.getActive().equals("aliyun")) {
                notifyService.setSmsSender(aliyunSmsSender());
            }

            notifyService.setSmsTemplate(smsConfig.getTemplate());
        }

        return notifyService;
    }

    public JavaMailSender mailSender() {
        com.fei.common.notify.config.NotifyProperties.Mail mailConfig = properties.getMail();
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost(mailConfig.getHost());
        mailSender.setUsername(mailConfig.getUsername());
        mailSender.setPassword(mailConfig.getPassword());
        mailSender.setPort(mailConfig.getPort());
        Properties properties = new Properties();
        properties.put("mail.smtp.auth",true);
        properties.put("mail.smtp.timeout",5000);
        properties.put("mail.smtp.starttls.enable",true);
        properties.put("mail.smtp.socketFactory.fallback", "false");
        //阿里云 必须加入配置 outlook配置又不需要 视情况而定.发送不成功多数是这里的配置问题
        properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        properties.put("mail.smtp.socketFactory.port", mailConfig.getPort());
        properties.put("debug", true);
        mailSender.setJavaMailProperties(properties);
        return mailSender;
    }

    public TencentSmsSender tencentSmsSender() {
        com.fei.common.notify.config.NotifyProperties.Sms smsConfig = properties.getSms();
        TencentSmsSender smsSender = new TencentSmsSender();
        com.fei.common.notify.config.NotifyProperties.Sms.Tencent tencent = smsConfig.getTencent();
        smsSender.setSender(new SmsSingleSender(tencent.getAppid(), tencent.getAppkey()));
        smsSender.setSign(smsConfig.getSign());
        return smsSender;
    }

    public AliyunSmsSender aliyunSmsSender() {
        com.fei.common.notify.config.NotifyProperties.Sms smsConfig = properties.getSms();
        AliyunSmsSender smsSender = new AliyunSmsSender();
        com.fei.common.notify.config.NotifyProperties.Sms.Aliyun aliyun = smsConfig.getAliyun();
        smsSender.setSign(smsConfig.getSign());
        smsSender.setRegionId(aliyun.getRegionId());
        smsSender.setAccessKeyId(aliyun.getAccessKeyId());
        smsSender.setAccessKeySecret(aliyun.getAccessKeySecret());
        return smsSender;
    }
}
