package com.jspapps.test.pokemon_service.infrastructure.endpoint;

import com.jspapps.test.pokemon_service.application.in.IPokemonQueryUseCase;
import com.jspapps.test.pokemon_service.domain.pokemon.PokemonListCommandRequest;
import com.jspapps.test.pokemon_service.domain.pokemon.PokemonListQueryResponse;
import com.jspapps.test.pokemon_service.infrastructure.util.constant.AppConstant;
import lombok.AllArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@AllArgsConstructor
@Endpoint
public class PokemonEndpoint {

    private final IPokemonQueryUseCase pokemonQueryUseCase;

    @PayloadRoot(namespace = AppConstant.NAMESPACE_URI, localPart = "PokemonListCommandRequest")
    @ResponsePayload
    public PokemonListQueryResponse getPokemonList(@RequestPayload PokemonListCommandRequest pokemonListCommand) {
        return pokemonQueryUseCase.listPokemon(pokemonListCommand);
    }
}
