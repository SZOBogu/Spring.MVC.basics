package example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/person")
public class PersonController{

    private PersonDatabase db;
    public PersonController(){
        this.db = new PersonDatabase();
    }


    @GetMapping("/showForm")
    public String showForm(@ModelAttribute("person") Person person, Model model){
        return "personForm";
    }

    @PostMapping("/processForm")
    public String processForm(@Valid @ModelAttribute("person") Person person, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()) {
            return "personForm";
        }
        else{
            this.db.add(person);
            return "person";
        }
    }

    @GetMapping("/list")
    public String getList(@ModelAttribute("person") Person person, Model model){
        model.addAttribute("db", this.db);
        return "personsList";
    }
}