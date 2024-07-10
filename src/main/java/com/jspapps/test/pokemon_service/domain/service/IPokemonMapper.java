package com.jspapps.test.pokemon_service.domain.service;

import com.jspapps.test.pokemon_service.domain.model.PokemonApiResponse;
import com.jspapps.test.pokemon_service.domain.pokemon.PokemonListQueryResponse;

public interface IPokemonMapper {

    PokemonListQueryResponse pokemonMapToQuery(PokemonApiResponse pokemonApiResponse);
}
