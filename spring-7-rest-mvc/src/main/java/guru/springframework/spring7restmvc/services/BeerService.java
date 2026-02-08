package guru.springframework.spring7restmvc.services;

import guru.springframework.spring7restmvc.models.Beer;

import java.util.UUID;

public interface BeerService {
    Beer getBeers(UUID uuid);
}
