package guru.springframework.spring7restmvc.services;

import guru.springframework.spring7restmvc.models.Beer;

import java.util.List;
import java.util.UUID;

public interface BeerService {
    List<Beer> listBeers();
    Beer getBeers(UUID uuid);
}
