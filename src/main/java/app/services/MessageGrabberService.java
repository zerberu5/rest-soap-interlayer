package app.services;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import java.util.stream.Collectors;


@Service
@ConditionalOnProperty(name = "cronjob.isActivated")
public class MessageGrabberService {

    private final MessageService messageService;
    private final DateSetterService dateSetterService;

    public MessageGrabberService(MessageService messageService, DateSetterService dateSetterService) {
        this.messageService = messageService;
        this.dateSetterService = dateSetterService;
    }

    @Scheduled(cron = "0/10 * * * * ?")
    public void grabMessages() {
        System.out.println(messageService.findAll().stream()
                .map(dateSetterService::addDate)
                .collect(Collectors.toList()));
    }

}
