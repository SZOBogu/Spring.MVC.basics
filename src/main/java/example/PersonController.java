package example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
@RequestMapping("/person")
public class PersonController {

    @RequestMapping("/showForm")
    public String showForm(Model model){
        Person person = new Person();
        model.addAttribute("person", person);
        return "personForm";
    }

    @PostMapping("/processForm")
    public String processForm(@ModelAttribute("person") Person person){
        return "person";
    }
}
