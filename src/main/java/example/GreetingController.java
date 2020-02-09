package example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("/greeting")
public class GreetingController {

    private GreetingDatabase db;

    private GreetingController(){
        this.db = new GreetingDatabase();
    }

    @GetMapping("/greeting")
    public String greetingForm(@ModelAttribute Greeting greeting, Model model) {
        return "greeting";
    }

    @PostMapping("/post")
    public String processForm(@ModelAttribute Greeting greeting, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        greeting.setId(greeting.getId() + 1);
        greeting.setContent("\nOgłasza się co następuje:\n" + greeting.getContent() + " gitara bęc\n");
        greeting.setAuthor(greeting.getAuthor().toUpperCase() + "\n");
        this.db.addGreeting(greeting);
        model.addAttribute("greetingList", this.db);
        model.addAttribute("greeting", greeting);
        return "result";
    }

    @PostMapping("/post2")
    public String processForm(HttpServletRequest request, Model model){
        long id = Long.parseLong(request.getParameter("id"));
        String content = request.getParameter("content") + " pis joł";
        String author = request.getParameter("author").toUpperCase();

        Greeting greeting = new Greeting();

        greeting.setId(id);
        greeting.setContent(content);
        greeting.setAuthor(author);

        this.db.addGreeting(greeting);
        model.addAttribute("greetingList", this.db);
        model.addAttribute("greeting", greeting);
        return "result";
    }

    @PostMapping("/post3")
    public String processForm(@RequestParam("id") String id,
                              @RequestParam("content") String content,
                              @RequestParam("author") String author,
                              Model model){

        Greeting greeting = new Greeting();
        greeting.setId(Integer.parseInt(id) + 1000);
        greeting.setContent(author + " powiada przeto:\n" + content + " tak mu dopomóż Bóg");
        greeting.setAuthor("mr. " + author);
        this.db.addGreeting(greeting);
        model.addAttribute("greetingList", this.db);
        model.addAttribute("greeting", greeting);

        return "result";
    }
}
