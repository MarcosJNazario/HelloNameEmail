package br.edu.usj.ads.lpii.hellonameemail;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloNameEmail {

    @PostMapping(value="hello")
    public ModelAndView postHelloNameEmail(@RequestParam String nome, @RequestParam String email) {
        ModelAndView modelAndView = new ModelAndView("hellonameemail");
        modelAndView.addObject("nome", nome);
        modelAndView.addObject("email", email);

        return modelAndView;
    }
    
    
}
