package dk.kaloyan.event.controller;

import dk.kaloyan.event.model.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class RegistrationController {
    @GetMapping("registration")
    public String getRegistration(@ModelAttribute("registration")Registration registration){
        System.out.println("getRegistration: registration.getName(): " + registration.getName());
        return "registration";
    }

    @PostMapping("registration")
    public String addRegistration(@Valid @ModelAttribute("registration")Registration registration,
                                  BindingResult result){
        if(result.hasErrors()){
            System.out.println("Errors");
            return "registration";
        }

        System.out.println(registration.getName());
        return "redirect:registration";
    }

}
