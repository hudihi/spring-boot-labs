package guru.springframework.spring7restmvc.controller;


import guru.springframework.spring7restmvc.models.Beer;
import guru.springframework.spring7restmvc.services.BeerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;



@Slf4j
@AllArgsConstructor
@Controller
@RestController
public class BeerController {
    private final BeerService beerService;

    @RequestMapping("/api/v1/beer")
    public List<Beer> listBeers(){
        return beerService.listBeers();
    }

    @RequestMapping(value = "/api/v1/beer/{beerId}",method = RequestMethod.GET)
    public Beer getBeerById(@PathVariable("beerId") UUID uuid){
        log.debug("Get Beer by I - In controller");

        return beerService.getBeers(uuid);
    }
}
