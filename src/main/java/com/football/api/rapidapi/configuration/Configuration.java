package com.football.api.rapidapi.configuration;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class Configuration
{

    
    public WebClient.Builder getWebClientBuilder() {
        return  WebClient.builder();
    }
}
