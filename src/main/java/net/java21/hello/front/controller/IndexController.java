package net.java21.hello.front.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import net.java21.hello.front.client.MemberClient;
import net.java21.hello.front.dto.MemberResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class IndexController {

    private final MemberClient memberClient;

    @GetMapping(value = {"/","/ndex.do"})
    public String index(HttpServletRequest request, Model model) {
        List<MemberResponse> memberResponseList = memberClient.getMembers();
        model.addAttribute("memberResponseList", memberResponseList);
        return "index";
    }
}
