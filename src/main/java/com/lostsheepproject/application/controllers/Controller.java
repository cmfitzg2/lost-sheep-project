package com.lostsheepproject.application.controllers;

import com.lostsheepproject.application.modelobjects.ItemSubmit;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {

    @PostMapping("/submit")
    public String postChangePassword(Model model,
                                     @RequestParam("name") String name,
                                     @RequestParam("email") String email,
                                     @RequestParam("itemTotal") String itemTotal,
                                     @RequestParam("itemCategory") String itemCategory,
                                     @RequestParam("shipping") String shipping,
                                     @RequestParam("notes") String notes) {
        return "redirect:submit?success";
    }

    @GetMapping("/submit")
    public void greeting(Model model) {
        model.addAttribute("itemsubmit", new ItemSubmit());
    }

}