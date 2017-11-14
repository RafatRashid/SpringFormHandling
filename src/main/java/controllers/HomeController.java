package controllers;

import models.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by RAFATxRASHID on 13-Nov-17.
 */
@Controller
public class HomeController
{
    @GetMapping("/")
    public String index(Model model)
    {
        model.addAttribute("person", new Person());
        return "home";
    }

    @PostMapping("/")
    public String process(@ModelAttribute Person person)
    {
        return "result";
    }
}
