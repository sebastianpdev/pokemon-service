package com.jspapps.test.pokemon_service.infrastructure.outbound;

import com.jspapps.test.pokemon_service.domain.model.PokemonApiResponse;
import com.jspapps.test.pokemon_service.domain.pokemon.PokemonListCommandRequest;
import com.jspapps.test.pokemon_service.domain.service.IPokemonProviderService;
import com.jspapps.test.pokemon_service.infrastructure.util.constant.AppConstant;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@AllArgsConstructor
@Service
public class PokemonProviderService implements IPokemonProviderService {

    private final RestTemplate restTemplate;

    @Override
    public PokemonApiResponse listPokemon(PokemonListCommandRequest pokemonListCommand) {
        String pokemonUrl = AppConstant.POKEMON_SERVICE_ENDPOINT + "?limit=" + pokemonListCommand.getLimit() + "&offset=" + pokemonListCommand.getOffset();
        return restTemplate.getForObject(pokemonUrl, PokemonApiResponse.class);
    }
}
