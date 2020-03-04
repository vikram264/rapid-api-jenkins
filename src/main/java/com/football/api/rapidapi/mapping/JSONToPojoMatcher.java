package com.football.api.rapidapi.mapping;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONToPojoMatcher
{

    public static void main (String[] args) throws JsonParseException, JsonMappingException, IOException
    {
        // TODO Auto-generated method stub
        
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        LeagueResponse leagueResponse = objectMapper.readValue(new File("src/main/resources/leagues.json"), LeagueResponse.class);
       
        
        System.out.println(leagueResponse.getApi().getLeagues().get("1"));
    }

    
}
