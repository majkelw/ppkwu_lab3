package com.ppkwu.lab3.service;

import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

public class StringStatsClientService {
    private final WebClient webClient = WebClient.create("http://localhost:8080");

    public Mono<String> getJson(String strParam) {
        return webClient
                .get()
                .uri("/api/string?str={}", strParam)
                .retrieve()
                .bodyToMono(String.class);
    }
}
