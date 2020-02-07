package example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    @GetMapping("/list")
    public String getList(Model model){
        Person person0 = new Person("Vladymyr","Romanov","Russia");
        Person person1 = new Person("dasdasKas","Paparapapadopapulos","Greece");
        Person person2 = new Person("Na","Palm","Vietnam");
        Person person3 = new Person("Benjamin","Dover","USA");
        Person person4 = new Person("Julio","Pinyeschet","Chile");

        List<Person> personList = Arrays.asList(person0, person1, person2, person3, person4);
        model.addAttribute("personList", personList);

        return "personsList";
    }
}
