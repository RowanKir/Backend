package ac.za.cput.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
    @RequestMapping(value = {"/", "/Home"})
    public ResponseEntity<String> home() {
        return new ResponseEntity<>("Welcome to The Video Store app!", HttpStatus.OK);
    }
}
