package example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/person")
public class PersonController {

    private PersonDatabase db;

    public PersonController(){
        this.db = new PersonDatabase();
    }

    @GetMapping("/showForm")
    public String showForm(@ModelAttribute("person") Person person, Model model){
       // model.addAttribute("person", person);
        return "personForm";
    }

    @PostMapping("/processForm")
    public String processForm(@ModelAttribute("person") Person person){
        return "person";
    }

    @RequestMapping("/list")
    public String getList(@ModelAttribute("person") Person person, Model model){

        //person = new Person(name, lastName, country);
        this.db.add(person);
        model.addAttribute("db", this.db);
        return "personsList";
    }
}
