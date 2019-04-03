package dekbank.SpringBootMongoDB.shortestpath.models;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class ResponseMessage {

    private String to;
    private String from;

}
