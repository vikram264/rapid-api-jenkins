package com.football.api.rapidapi.mapping;

import java.util.HashMap;

import com.football.api.rapidapi.pojo.League;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class API
{
    private Integer results;  
    private HashMap<String, League> leagues;
}
