package com.tiklup.anime.handler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class ClientCallHandler {

    private WebClient client;

    @Value("${anime.search.baseUrl}")
    String baseUrl;
    @Value("${anime.search.contentType}")
    String contentType;
    @Value("${anime.search.apiKey}")
    String apiKey;
    @Value("${anime.search.apihost}")
    String apihost;

    public WebClient getClient() {
        client = WebClient.builder()
                .baseUrl(baseUrl)
                .defaultHeader("content-type", contentType)
                .defaultHeader("X-RapidAPI-Key", apiKey)
                .defaultHeader("X-RapidAPI-Host",apihost)
                .build();
        return client;
    }
}
