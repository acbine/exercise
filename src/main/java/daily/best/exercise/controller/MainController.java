package daily.best.exercise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/custom/title")
    public void title(){
        System.out.println("최초 타이틀페이지");
    }

    @GetMapping("/main")
    public void main(){
        System.out.println("메인페이지");
    }

}
