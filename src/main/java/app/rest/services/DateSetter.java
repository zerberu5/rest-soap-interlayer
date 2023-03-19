package app.rest.services;

import app.dto.Message;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class DateSetter {

    public void setCurrentDate(Message message) {
        message.setIncomingDate(new Date());
    }
}
