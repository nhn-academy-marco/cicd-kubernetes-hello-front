package net.java21.hello.front.web;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping(value = {"/","/ndex.do"})
    public String index(HttpServletRequest request, Model model) {
        //ip확인
        String ip1  = request.getRemoteAddr();
        String ip2 = request.getHeader("X-Forwarded-For");
        model.addAttribute("ip1", ip1);
        model.addAttribute("ip2", ip2);

        return "index";
    }
}
