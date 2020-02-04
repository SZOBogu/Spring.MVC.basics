package example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;


@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public ModelAndView greetingForm(Model model) {
        return new ModelAndView("greeting", "greeting", new Greeting());
    }

    @PostMapping("/post")
    public String processForm(@ModelAttribute Greeting greeting, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        greeting.setId(greeting.getId() + 1);
        greeting.setContent("Ogłasza się co następuje:\n" + greeting.getContent() + " gitara bęc");
        greeting.setAuthor(greeting.getAuthor().toUpperCase());

        model.addAttribute("greeting", greeting);

        return "result";
    }

    @RequestMapping("/post2")
    public String processForm(HttpServletRequest request, Model model){
        long id = Long.parseLong(request.getParameter("id"));
        String content = request.getParameter("content") + "pis joł";
        String author = request.getParameter("author").toUpperCase();

        Greeting greeting = new Greeting();

        greeting.setId(id);
        greeting.setContent(content);
        greeting.setAuthor(author);

        model.addAttribute("greeting", greeting);

        return "result";
    }
}
