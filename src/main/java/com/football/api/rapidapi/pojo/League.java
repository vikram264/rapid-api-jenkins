package com.football.api.rapidapi.pojo;

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
public class League
{

    
    /*
     * "league_id": "1", "name": "2018 Russia World cup", "country": "World",
     * "country_code": "", "season": "2018", "season_start": "2018-06-14",
     * "season_end": "2018-07-15", "logo":
     * "https://www.api-football.com/public/leagues/1.png", "flag": "",
     * "standings": false
     */
    
    String league_id;
    String name;
    String country;
    String country_code;
    String season;
    String season_start;
    String season_end;
    String logo;
    String flag;
    Boolean standings;
    
    
    
    
    
}
