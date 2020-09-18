package es.unizar.webeng.hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
import java.util.Map;



@Controller
public class HelloController {
    @Value("${app.message:Hello World}")
    private String message;
    @Value("${app.messageType:text}")
    private String messageType;

    /**
     * This is a controller method that sets the time key to current Date, the message to the hardcoded message
     *
     * and the message type
     *
     * @param model MVC
     * @return the message "wellcome"
     *
     */

    @GetMapping("/")
    public String welcome(Map<String, Object> model) {
        model.put("time", new Date());
        model.put("message", message);
        model.put("messageType", messageType);
        return "wellcome";
    }
}
