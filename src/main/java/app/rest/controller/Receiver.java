package app.rest.controller;


import app.dto.Message;
import app.rest.services.DateSetter;
import app.rest.services.MessageService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messages")
public class Receiver {

    private final DateSetter dateSetter;
    private final MessageService messageService;

    public Receiver(DateSetter dateSetter, MessageService messageService) {
        this.dateSetter = dateSetter;
        this.messageService = messageService;
    }

    @PostMapping("/")
    public ResponseEntity<String> receiveMessage(@RequestBody Message message) {
        dateSetter.setCurrentDate(message);
        messageService.saveMessage(message);

        // Replace with logger
        System.out.println(message);

        return new ResponseEntity<>("Message received", HttpStatus.OK);
    }
}
