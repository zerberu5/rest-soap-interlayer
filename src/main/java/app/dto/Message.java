package app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Message {

    @Id
    private String id;
    private String description;
    private long size;
    private String text;
    private Date incomingDate;
    private boolean isFetched;
    private Date fetchedDate;
}
