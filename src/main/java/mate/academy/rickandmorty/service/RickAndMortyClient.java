package mate.academy.rickandmorty.service;

import java.util.List;
import mate.academy.rickandmorty.dto.internal.CharacterDto;

public interface RickAndMortyClient {
    CharacterDto getRandomCharacter();

    List<CharacterDto> findByPartOfName(String partOfName);
}
