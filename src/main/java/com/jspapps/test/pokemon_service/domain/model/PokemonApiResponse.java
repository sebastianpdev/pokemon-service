package com.jspapps.test.pokemon_service.domain.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
public class PokemonApiResponse {

    private int count;
    private List<PokemonDetailApiResponse> results;

    @Getter
    @Setter
    public static class PokemonDetailApiResponse {

        private String name;
        private String url;

    }

}
