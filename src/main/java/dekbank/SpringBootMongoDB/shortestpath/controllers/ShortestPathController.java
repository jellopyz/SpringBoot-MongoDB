package dekbank.SpringBootMongoDB.shortestpath.controllers;


import dekbank.SpringBootMongoDB.shortestpath.services.ShortestPathService;
import dekbank.SpringBootMongoDB.shortestpath.models.ShortestPath;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/graph")
public class ShortestPathController {

    private ShortestPath inputGraph;

    @Autowired
    private ShortestPathService shortestPathService;

    @GetMapping()
    public ResponseEntity<?> getGraph() {
        return ResponseEntity.ok(inputGraph);
    }

    @GetMapping("/allShortestPath")
    public ResponseEntity<?> getAllShortestPath() {
        return ResponseEntity.ok("All shortestPath");
    }

    @GetMapping("/shortestPath")
    public ResponseEntity<?> getShortestPath(@RequestParam String to, @RequestParam String from) {
        return ResponseEntity.ok("Shortest Path");
    }

    @PostMapping()
    public ResponseEntity<?> postGraph(@RequestBody ShortestPath body) {

        inputGraph = body;

        return ResponseEntity.status(HttpStatus.CREATED).body(body);
    }
}
