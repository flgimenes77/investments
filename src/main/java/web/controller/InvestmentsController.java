package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

//@RestController
@Controller
public class InvestmentsController {

    @RequestMapping("/")
    @ResponseBody
    public String initTest() {
        return "Teste 123";
    }

}
