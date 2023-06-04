package app.services;

import app.database.MessageRepository;
import app.dto.Message;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MessageService {

    private final MessageRepository messageRepository;

    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public void saveMessage(Message message) {
        messageRepository.save(message);
    }

    public List<Message> findAll() {
        return messageRepository.findAll();
    }
}
