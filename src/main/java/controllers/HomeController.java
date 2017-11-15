package controllers;

import models.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.naming.Binding;
import javax.validation.Valid;

/**
 * Created by RAFATxRASHID on 13-Nov-17.
 */
@Controller
public class HomeController
{
    @GetMapping("/")
    public String form(Model model)
    {
        model.addAttribute("person", new Person());
        return "home";
    }
    @PostMapping("/")
    public String processForm(@Valid Person person, BindingResult bindingResult)
    {
        person.setId(32);

        if(bindingResult.hasErrors())
            return "home";
        return "result";
    }
}
