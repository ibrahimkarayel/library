package tr.com.jowl.library.service;


import tr.com.jowl.library.model.City;

import java.util.List;

/**
 * The UserService interface
 *
 * @author ibrahim KARAYEL
 * @version 1.0
 * Date 4/27/2018.
 */
public interface CityService {

    List<City> findAll();

    City findBycode(String code);


}
