package app.rest.services;

import app.dto.Message;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class DateSetterService {

    public Message addDate(Message message) {
        message.setIncomingDate(new Date());
        return message;
    }
}
