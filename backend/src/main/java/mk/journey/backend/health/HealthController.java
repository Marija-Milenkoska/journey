package mk.journey.backend.health;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.ResponseCache;

@RestController
public class HealthController {
    @GetMapping("/health")
    public ResponseEntity<String> health(){
        return ResponseEntity.ok("OK");
    }
}
