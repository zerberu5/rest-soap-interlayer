package app.rest.services;

import app.database.MessageRepository;
import app.dto.Message;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    private final MessageRepository messageRepository;

    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public void saveMessage(Message message) {
        Message savedMessage = messageRepository.save(message);
    }
}