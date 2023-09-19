package airline_system.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class login {

    @GetMapping("/login")
    public String showLoginForm() {
        // Logic to handle the registration page request
        return "login"; // Return the name of the HTML template (registration.html)
    }
}
