package testPackage.controller;

import org.springframework.web.bind.annotation.*;
//import java.util.logging.Logger;

//@CrossOrigin(origins = "https://localhost:8443")

@RestController
public class testController {

//    private Logger logger = Logger.getLogger(this.getClass().getName());

    //    @CrossOrigin(origins = "https://localhost:8443")
    @GetMapping(value = "/")
    public String registerPlayer() {
        System.out.println("test successful" );
        return "test Successful";
    }

    @GetMapping(value = "/test")
    public String registerPlayer2() {
        System.out.println("test2 successful" );
        return "test2 Successful";
    }
}
