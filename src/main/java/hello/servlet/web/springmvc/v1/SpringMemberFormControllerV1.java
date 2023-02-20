package hello.servlet.web.springmvc.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringMemberFormControllerV1 {
    @RequestMapping("springmvc/v1/members/new-form")
    public ModelAndView process(){
        return new ModelAndView("new-form");
        //뷰리졸버에서 jsp를 처리하기 위한 뷰가 찾아져서 렌더가 된다.
    }
}
