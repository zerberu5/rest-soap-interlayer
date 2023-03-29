package app.rest.services;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;


@Service
public class MessageGrabberService {

    private final MessageService messageService;

    public MessageGrabberService(MessageService messageService) {
        this.messageService = messageService;
    }

    @Scheduled(cron = "0/10 * * * * ?")
    public void grabMessages() {
        System.out.println(messageService.findAll());
    }

}
