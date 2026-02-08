package guru.springframework.spring7restmvc.services;

import guru.springframework.spring7restmvc.models.Beer;
import guru.springframework.spring7restmvc.models.BeerStyle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;


@Slf4j
@Service
public class BeerServiceImpl implements BeerService{


    @Override
    public Beer getBeers(UUID uuid) {

        log.debug("Get Beer by Id - In service. Id: {}", uuid.toString());

        return Beer.builder()
                .id(uuid)
                .version(1)
                .beerName("Galaxy Cat")
                .beerStyle(BeerStyle.PALE_ALE)
                .upc("1234")
                .quantityOnHand(122)
                .price(new BigDecimal("12.099"))
                .createdDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();
    }
}
