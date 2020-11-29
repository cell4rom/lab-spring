package eu.yayi.springsecurity.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    @GetMapping("/public")
    @Secured({ "ROLE_VIEWER", "ROLE_EDITOR" })
    public String messagePublic() {
        return  "Ceci est un message public ..." ;
    }

    @GetMapping("/admin")
    public String messageSecret() {
        return  "Ceci est un message secret !!" ;
    }
}
