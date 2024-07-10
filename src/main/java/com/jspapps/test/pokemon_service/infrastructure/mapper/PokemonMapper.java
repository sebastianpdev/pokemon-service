package com.jspapps.test.pokemon_service.infrastructure.mapper;

import com.jspapps.test.pokemon_service.domain.model.PokemonApiResponse;
import com.jspapps.test.pokemon_service.domain.pokemon.PokemonDetail;
import com.jspapps.test.pokemon_service.domain.pokemon.PokemonListQueryResponse;
import com.jspapps.test.pokemon_service.domain.service.IPokemonMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class PokemonMapper implements IPokemonMapper {

    @Override
    public PokemonListQueryResponse pokemonMapToQuery(PokemonApiResponse pokemonApiResponse) {
        PokemonListQueryResponse pokemonListResponse = new PokemonListQueryResponse();
        if (pokemonApiResponse.getResults() != null) {
            for (PokemonApiResponse.PokemonDetailApiResponse pokemon: pokemonApiResponse.getResults()) {
                PokemonDetail pokemonDetail = new PokemonDetail();
                pokemonDetail.setName(pokemon.getName());
                pokemonDetail.setUrl(pokemon.getUrl());
                pokemonListResponse.getPokemonDetailList().add(pokemonDetail);
            }
        }

        return pokemonListResponse;
    }
}
