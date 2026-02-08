package guru.springframework.spring7restmvc.services;

import guru.springframework.spring7restmvc.models.Beer;
import guru.springframework.spring7restmvc.models.BeerStyle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;


@Slf4j
@Service
public class BeerServiceImpl implements BeerService{

    private Map<UUID, Beer> beerMap;

    public BeerServiceImpl(){

        this.beerMap = new HashMap<>();


        Beer beer1 = Beer.builder()
                .id(UUID.randomUUID())
                .version(1)
                .beerName("Galaxy Cat")
                .beerStyle(BeerStyle.PALE_ALE)
                .upc("1234")
                .quantityOnHand(122)
                .price(new BigDecimal("12.099"))
                .createdDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();

        Beer beer2 = Beer.builder()
                .id(UUID.randomUUID())
                .version(1)
                .beerName("Crank")
                .beerStyle(BeerStyle.PALE_ALE)
                .upc("12345222")
                .quantityOnHand(12)
                .price(new BigDecimal("11.099"))
                .createdDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();

        Beer beer3 = Beer.builder()
                .id(UUID.randomUUID())
                .version(1)
                .beerName("Sunshine City")
                .beerStyle(BeerStyle.IPA)
                .upc("12346")
                .quantityOnHand(122)
                .price(new BigDecimal("13.099"))
                .createdDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();


        beerMap.put(beer1.getId(), beer1);
        beerMap.put(beer2.getId(), beer2);
        beerMap.put(beer3.getId(), beer3);

    }

    @Override
    public List<Beer> listBeers(){
        return new ArrayList<>(beerMap.values());
    }


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
