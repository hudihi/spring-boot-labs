package guru.springframework.spring7restmvc.controller;


import guru.springframework.spring7restmvc.models.Beer;
import guru.springframework.spring7restmvc.services.BeerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.UUID;



@Slf4j
@AllArgsConstructor
@Controller
public class BeerController {
    private final BeerService beerService;

    public List<Beer> listBeers(){
        return beerService.listBeers();
    }

    public Beer getBeerById(UUID uuid){
        log.debug("Get Beer by I - In controller");

        return beerService.getBeers(uuid);
    }
}
