package com.football.api.rapidapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;

import com.football.api.rapidapi.mapping.LeagueResponse;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class RapidAPIController
{

    @Autowired
    WebClient.Builder webClientBuilder;
   
    @GetMapping("/")
    public LeagueResponse getAllLeagues ()
    {

        /*
         * ExchangeStrategies exchangeStrategies = ExchangeStrategies.builder()
         * .codecs(configurer -> configurer.defaultCodecs().maxInMemorySize(1024
         * * 1024)).build();
         *  webClientBuilder.exchangeStrategies(exchangeStrategies).build()
         */
        String url = "https://api-football-v1.p.rapidapi.com/leagues";
        LeagueResponse leagueResponse = webClientBuilder.build()
            .get()
            .uri(url)
            .header("x-rapidapi-key", "30165d4134mshaebaef06b3b4ed1p1c00d8jsne6ed50954ab2")
            .retrieve()         
            .bodyToMono(LeagueResponse.class)
            .block();
        return leagueResponse;

    }

    @GetMapping("/league/{league_id}")
    public LeagueResponse getLeaugueByLeagueId (@PathVariable(name = "league_id") Integer league_id)
    {
        log.info("Passed League Id is {}", league_id);
        String url = "https://api-football-v1.p.rapidapi.com/leagues/league/" + league_id;
        LeagueResponse leagueResponse = webClientBuilder.build()
            .get()
            .uri(url)
            .header("x-rapidapi-key", "30165d4134mshaebaef06b3b4ed1p1c00d8jsne6ed50954ab2")
            .retrieve()         
            .bodyToMono(LeagueResponse.class)
            .block();
        return leagueResponse;
        
    }

    @GetMapping("/season/{season}")
    public LeagueResponse getLeaugueBySeason (@PathVariable(name="season") String season)
    {
        log.info("Passed Season  is {}", season);
        String url = "https://api-football-v1.p.rapidapi.com/leagues/season/" + season;
        LeagueResponse leagueResponse = webClientBuilder.build()
            .get()
            .uri(url)
            .header("x-rapidapi-key", "30165d4134mshaebaef06b3b4ed1p1c00d8jsne6ed50954ab2")
            .retrieve()         
            .bodyToMono(LeagueResponse.class)
            .block();
        return leagueResponse;
    }

    @GetMapping("/country/{country}")
    public LeagueResponse getLeaugueByCountry (@PathVariable(name="country") String country)
    {
        log.info("Passed Country  is {}", country);
        String url = "https://api-football-v1.p.rapidapi.com/leagues/country/"+country;
        LeagueResponse leagueResponse = webClientBuilder.build()
            .get()
            .uri(url)
            .header("x-rapidapi-key", "30165d4134mshaebaef06b3b4ed1p1c00d8jsne6ed50954ab2")
            .retrieve()         
            .bodyToMono(LeagueResponse.class)
            .block();
        return leagueResponse;
    }

    @GetMapping("/country/{country}/{season}")
    public LeagueResponse getLeaugueByCountryAndSeason (@PathVariable(name = "country") String country,@PathVariable(name = "season") String season)
    {
        log.info("Passed Country and Season are {} and  {}", country,season);
        String url = "https://api-football-v1.p.rapidapi.com/leagues/country/" +country + "/"+ season;
        LeagueResponse leagueResponse = webClientBuilder.build()
            .get()
            .uri(url)
            .header("x-rapidapi-key", "30165d4134mshaebaef06b3b4ed1p1c00d8jsne6ed50954ab2")
            .retrieve()         
            .bodyToMono(LeagueResponse.class)
            .block();
        return leagueResponse;
    }
    
    @GetMapping("/greeting") 
    public @ResponseBody String sendGreetingMessage() {
        return "Hello from GCP Service";
    }

}
