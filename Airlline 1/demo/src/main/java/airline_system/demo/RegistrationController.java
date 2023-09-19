package airline_system.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistrationController {

    @GetMapping("/registration")
    public String showRegistrationForm() {
        // Logic to handle the registration page request
        return "registration"; // Return the name of the HTML template (registration.html)
    }
}
