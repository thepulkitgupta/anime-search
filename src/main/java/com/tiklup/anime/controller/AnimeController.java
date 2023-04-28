package com.tiklup.anime.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/anime")
public class AnimeController {

    @GetMapping("/home")
    public String getAnimeHomePage(Model theModel){
        return "index";
    }

    @GetMapping("/details")
    public String getAnimeDetails(@RequestParam String animeName, Model theModel){

        theModel.addAttribute("value" , "The passed anime name is : " + animeName);

        return "anime-info";
    }

    @GetMapping("/top10")
    public String getTop10Anime(Model theModel){
        return "anime-info";
    }
}
