package com.jspapps.test.pokemon_service.domain.service;

import com.jspapps.test.pokemon_service.domain.model.PokemonApiResponse;
import com.jspapps.test.pokemon_service.domain.pokemon.PokemonListCommandRequest;

public interface IPokemonProviderService {

    PokemonApiResponse listPokemon(PokemonListCommandRequest pokemonListCommand);
}
