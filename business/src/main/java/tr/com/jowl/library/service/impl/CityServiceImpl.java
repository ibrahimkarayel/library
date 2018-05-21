package tr.com.jowl.library.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tr.com.jowl.library.model.City;
import tr.com.jowl.library.repository.CityRepository;
import tr.com.jowl.library.service.CityService;

import java.util.List;

/**
 * The UserServiceImpl class
 *
 * @author ibrahim KARAYEL
 * @version 1.0
 * Date 4/27/2018.
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepository cityRepository;


    @Override
    public List<City> findAll() {
        return (List<City>) cityRepository.findAll();
    }

    @Override
    public City findBycode(String code) {
        return cityRepository.findByCode(code);
    }

}
