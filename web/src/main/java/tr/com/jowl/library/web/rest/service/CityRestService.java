package tr.com.jowl.library.web.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tr.com.jowl.library.model.City;
import tr.com.jowl.library.repository.CityRepository;

import java.util.List;

@RestController
@RequestMapping(value="/api")
public class CityRestService {
    @Autowired
    private CityRepository cityRepository;

    @RequestMapping(value = "cities", method = RequestMethod.GET)
    public List<City> findAll() {
        Iterable<City> cities = cityRepository.findAll();
        return (List<City>) cities;
    }

    @RequestMapping(value="/city/{code}", method= RequestMethod.GET )
    public City findByCode(@PathVariable(value="code") String code) {
        return cityRepository.findByCode(code);
    }
}
