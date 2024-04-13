package daily.best.exercise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("hi")
    public void hi(){
        System.out.println("hi");
    }

    @GetMapping("USER")
    public void USER(){
        System.out.println("user");
    }

    @GetMapping("aa")
    public void aa(){
        System.out.println("임시로 만든 로그인 페이지");
    }
}
