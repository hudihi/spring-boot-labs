package guru.springframework.spring7restmvc.services;

import guru.springframework.spring7restmvc.models.Beer;

public class BeerServiceImpl implements BeerService{

    @Override
    public Beer getBeers() {
        return Beer.builder().build();
    }
}
