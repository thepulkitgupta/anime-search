package com.tiklup.anime.controller;

import com.tiklup.anime.dto.Anime;
import com.tiklup.anime.service.AnimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
@RequestMapping("/anime")
public class AnimeController {

    @Autowired
    AnimeService animeService;

    @GetMapping("/details")
    public String getAnimeDetails(String animeName,@RequestParam("page") Optional<Integer> page,
                                  @RequestParam("size") Optional<Integer> size,  Model theModel){
        Anime animeResponse= animeService.getAnimeDetails(animeName,page.orElse(1),size.orElse(10));

        if(animeResponse.getData().size()==0){
            return "redirect:/?error=No Anime Found";
        }

        theModel.addAttribute("animeList" , animeResponse);
        theModel.addAttribute("animeName",animeName);
        return "anime-info";
    }

}
