package by.tms.lesson5531onl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author simonpirko
 * @version 1.0
 * @since 18.03.2025
 */

@Controller
@RequestMapping
public class GreetingController {

    @RequestMapping
    public String hello(@RequestParam(value = "name", defaultValue = "Guest") String name,
                        Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
}
