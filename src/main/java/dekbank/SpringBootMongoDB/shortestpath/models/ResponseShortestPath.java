package dekbank.SpringBootMongoDB.shortestpath.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class ResponseShortestPath {

    private ResponseMessage path;
}
