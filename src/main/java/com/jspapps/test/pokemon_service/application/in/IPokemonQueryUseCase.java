package com.jspapps.test.pokemon_service.application.in;

import com.jspapps.test.pokemon_service.domain.pokemon.PokemonListCommandRequest;
import com.jspapps.test.pokemon_service.domain.pokemon.PokemonListQueryResponse;

public interface IPokemonQueryUseCase {

    PokemonListQueryResponse listPokemon(PokemonListCommandRequest pokemonListCommand);
}
