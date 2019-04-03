package dekbank.SpringBootMongoDB.shortestpath.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Getter
@Setter
public class ResponseAllShortestPath {

    private List<ResponseMessage> paths;
}
