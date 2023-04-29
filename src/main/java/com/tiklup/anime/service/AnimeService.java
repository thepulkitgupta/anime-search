package com.tiklup.anime.service;

import com.tiklup.anime.dto.Anime;
import com.tiklup.anime.handler.ClientCallHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class AnimeService {

    private WebClient client;

    @Autowired
    public AnimeService(ClientCallHandler clientCallHandler){
                this.client=clientCallHandler.getClient();
    }

    //add a method to return the anime details for a single anime based on the serach
    public Anime getAnimeDetails(String animeName, int page, int size){


        Anime animeDetails= client.get()
                .uri("?search="+animeName+"&page="+page + "&size="+size )
                .retrieve()
                .bodyToMono(Anime.class)
                .block();

        return animeDetails;
    }



}
