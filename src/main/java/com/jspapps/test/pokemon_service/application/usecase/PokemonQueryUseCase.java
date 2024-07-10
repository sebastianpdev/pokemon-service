package com.jspapps.test.pokemon_service.application.usecase;

import com.jspapps.test.pokemon_service.application.in.IPokemonQueryUseCase;
import com.jspapps.test.pokemon_service.domain.model.PokemonApiResponse;
import com.jspapps.test.pokemon_service.domain.pokemon.PokemonListCommandRequest;
import com.jspapps.test.pokemon_service.domain.pokemon.PokemonListQueryResponse;
import com.jspapps.test.pokemon_service.domain.service.IPokemonMapper;
import com.jspapps.test.pokemon_service.domain.service.IPokemonProviderService;
import com.jspapps.test.pokemon_service.infrastructure.util.annotation.UseCase;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@UseCase
public class PokemonQueryUseCase implements IPokemonQueryUseCase {

    private final IPokemonProviderService pokemonProviderService;
    private final IPokemonMapper pokemonMapper;

    @Override
    public PokemonListQueryResponse listPokemon(PokemonListCommandRequest pokemonListCommand) {
        PokemonApiResponse pokemonApiResponse = pokemonProviderService.listPokemon(pokemonListCommand);
        return pokemonMapper.pokemonMapToQuery(pokemonApiResponse);
    }
}
