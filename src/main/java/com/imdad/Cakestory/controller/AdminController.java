package com.imdad.Cakestory.controller;



import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;



@Controller
public class AdminController {


@GetMapping("/admin")
    public String adminHome() {
    return "adminHome";
}
//Categories Section


}

