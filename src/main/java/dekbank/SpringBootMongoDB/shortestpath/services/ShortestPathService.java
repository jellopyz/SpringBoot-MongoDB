package dekbank.SpringBootMongoDB.shortestpath.services;


import dekbank.SpringBootMongoDB.shortestpath.models.ResponseAllShortestPath;
import dekbank.SpringBootMongoDB.shortestpath.models.ResponseShortestPath;
import dekbank.SpringBootMongoDB.shortestpath.models.ShortestPath;
import org.springframework.stereotype.Service;

@Service
public class ShortestPathService {

    public ResponseShortestPath retrieveShortestPath(String to, String from, ShortestPath graph) {



        return new ResponseShortestPath();
    }

    public ResponseAllShortestPath retrieveAllShortestPath(ShortestPath graph) {
        return new ResponseAllShortestPath();
    }
}
