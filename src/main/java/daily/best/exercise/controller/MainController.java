package daily.best.exercise.controller;

import daily.best.exercise.service.BodyService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.security.Principal;

@Controller
public class MainController {

    @Autowired
    BodyService bodyService;

    @GetMapping("/custom/title")
    public void title(){
        System.out.println("최초 타이틀페이지");
    }

    @GetMapping("/main")
    public void main(Model model, Authentication authentication ){
        System.out.println("메인페이지");

        String userid = authentication.getName(); //현재 로그인된 사용자의 아이디

        Object principal = authentication.getPrincipal();

        System.out.println("아이디값이 아니라 닉네임값을 가져오네"+userid);
//        model.addAttribute("reboolean",false);
        model.addAttribute("reboolean",bodyService.finduserid(userid));
    }

    @PostMapping("/send/bodyregister")
    public String bodyregister(String userid,Double height,Double weight,String gender){ //몸상태등록
        System.out.println(userid+"======="+height+"sa"+weight+"asdasd"+gender);
        bodyService.bodyregister(userid,height,weight,gender);
        return "redirect:/main";
    }

}
