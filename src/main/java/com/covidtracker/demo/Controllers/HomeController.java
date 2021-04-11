package com.covidtracker.demo.Controllers;

import com.covidtracker.demo.Service.CoronaDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    CoronaDataService coronaDataService;

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("locationStats",coronaDataService.getAllstats());
        return "home";
    }
}
