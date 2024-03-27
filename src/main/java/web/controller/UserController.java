package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public String getAllUsers(ModelMap model) {
        model.addAttribute("users", userService.getUsersList());
        return "users";
    }

    @GetMapping("/edituser/{id}")
    public String getUser(@PathVariable("id") Long id, ModelMap model) {
        model.addAttribute("user", userService.getUser(id));
        return "edituser";
    }

    @GetMapping("/saveget")
    public String saveUserGet(@ModelAttribute("user") User user) {
        return "newuser";
    }

    @PostMapping("/savepost")
    public String saveUserPost(@ModelAttribute("user") User user) {
        userService.saveUser(user);
        return "redirect:/users";
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable("id") Long id){
        userService.deleteUser(id);
        return ("redirect:/users");
    }

    @PatchMapping("/{id}")
    public String changeUser(@ModelAttribute("user") User user) {
        userService.changeUser(user);
        return "redirect:/users";
    }

}
