package daily.best.exercise.controller;

import daily.best.exercise.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {

    @Autowired
    MemberService memberService;

    @GetMapping("/hi")
    public void hi(){
        System.out.println("hi");
    }

    @GetMapping("/user")
    public String user(){
        System.out.println("user");
        return "/user";
    }

    @GetMapping("/custom/customLogin")
    public String customLogin(String error, Model model){
//        System.out.println(error+"eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
        System.out.println("커스텀 로그인 페이지");
        if (error != null) {
            model.addAttribute("errorMessage", "로그인에 실패하였습니다.");
        }
        return "/custom/customLogin";
    }

    @GetMapping("/custom/memberRegister")
    public String MemberRegister(){
        return "/custom/memberRegister";
    }

    @PostMapping("/custom/signup")
    public String signup(String userid , String username , String password , int birth , RedirectAttributes redirectAttributes){
        System.out.println("회원가입신호옴");
//        System.out.println(userid+"Aaaa"+username+"Aaaa"+password+"Aaaa"+birth);
        boolean signupSuccess = memberService.membersignup(userid, username, password, birth); // 아이디있으면false 없으면true
        if(signupSuccess) {
            return "redirect:/custom/customLogin";
        } else {
            return "redirect:/custom/memberRegister";
        }
    }
}
