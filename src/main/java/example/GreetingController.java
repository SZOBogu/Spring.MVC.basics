package example;

import example.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting) {
        return "result";
    }
}
//    @GetMapping("/greeting")
//    public String doSomethingDumb(HttpServletRequest request, Model model){
//        int id = request.getParameter("id").hashCode();
//        String content = request.getParameter("content") + "length: " + request.getParameter("content").length();
//        String author = request.getParameter("author").toUpperCase();
//
//        model.addAttribute("id");
//        model.addAttribute("content");
//        model.addAttribute("author");
//
//        return "result";
//    }
//}
