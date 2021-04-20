package com.covidtracker.demo.Controllers;

import com.covidtracker.demo.Models.LocationStats;
import com.covidtracker.demo.Service.CoronaDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    CoronaDataService coronaDataService;

    @GetMapping("/")
    public String home(Model model){
        List<LocationStats> allstats = coronaDataService.getAllstats();
        int totalCases = allstats.stream().mapToInt(stat -> (stat.getLatestTotalCases())).sum();
        model.addAttribute("locationStats", allstats);
        model.addAttribute("totalCases", totalCases);
        return "home";
    }
}
