package com.simonov.testJqueryJavaMvc.web;

import com.simonov.testJqueryJavaMvc.model.User;
import com.simonov.testJqueryJavaMvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
class RootController {

    @Autowired
    private UserService service;

    @GetMapping("/")
    public String root() {
        return "redirect:modal";
    }

    @GetMapping("/modal")
    public String modal() {
        return "modal";
    }

    @GetMapping("/profile")
    public String profile(){ return "profile";}


    @PostMapping("/checkCrendails")
    public String checkCrendails(@RequestParam("login") String login,
                                 @RequestParam("psw") String psw,
                                 @RequestParam("lang") String lang,
                                 @RequestParam(value = "remember", required = false) Boolean remember
            , HttpServletResponse response
            , HttpServletRequest request
            , ModelMap model) {



        User user = service.loadUser(login, psw);
        if (user != null) {
            model.addAttribute("fName", user.getFirstName());
            model.addAttribute("lName", user.getLastName());
            if (lang == "")
                if (user.getLanguage() != null) lang = user.getLanguage();
                else lang = "en_US";
            model.addAttribute("lang", lang);

            if (remember != null && remember) {
                Cookie langCookie = new Cookie("langC", lang);
                Cookie loginCookie = new Cookie("loginC", login);
                Cookie fNameC = new Cookie("fNameC", user.getFirstName());
                Cookie lNameC = new Cookie("lNameC", user.getLastName());
                loginCookie.setMaxAge(3600);
                response.addCookie(langCookie);
                response.addCookie(loginCookie);
                response.addCookie(fNameC);
                response.addCookie(lNameC);
            }
        }
        return "profile";
    }

    private void clearCookies(HttpServletRequest request, HttpServletResponse response) {
        for (Cookie cookie : request.getCookies()) {
            cookie.setMaxAge(0);
            if (    cookie.getName().equals("loginC") ||
                    cookie.getName().equals("cookieName") ||
                    cookie.getName().equals("langC")
                    ) cookie.setValue("");
                response.addCookie(cookie);
        }
    }


    /*@PostMapping("/register")
    public String saveRegister(@Valid UserTo userTo, BindingResult result, SessionStatus status, ModelMap model) {
        if (!result.hasErrors()) {
            try {
                super.create(UserUtil.createNewFromTo(userTo));
                status.setComplete();
                return "redirect:login?message=app.registered&username=" + userTo.getEmail();
            } catch (DataIntegrityViolationException ex) {
                result.rejectValue("email", "exception.users.duplicate_email");
            }
        }
        model.addAttribute("register", true);
        return "profile";
    }*/
}
