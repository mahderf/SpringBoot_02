package springproject_02.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainControllers {

    @GetMapping("/")
    public String homepage(Model model)
    {
        model.addAttribute("myvar", "Say hello to the people");
        return "index";
    }
    @GetMapping("/walktrough")
    public String posthome(@ModelAttribute ("myvar") Springvar othervar)
    {
        return"hometemplate";
   }

}
