package gog.pub.example;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.validation.Valid;

@RestController
public class ExampleController
{

    @PostMapping("/example")
    @ResponseBody
    public String submit(@Valid @RequestBody ExampleCommand command) {
        return "Hello";
    }
}
