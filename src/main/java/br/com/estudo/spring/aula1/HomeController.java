package br.com.estudo.spring.aula1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/inicio")
    public String homeApp(Model model){
        model.addAttribute("mensagem", "mensagem foi adicionada");
        return "index";
    }
}
