package tr.com.jowl.library.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import tr.com.jowl.library.model.City;
import tr.com.jowl.library.service.CityService;

import java.util.List;

@Controller
public class CityController {
    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/cities", method = RequestMethod.GET)
    public String getReservations(Model model) {
        List<City> cities = cityService.findAll();
        model.addAttribute("cities", cities);
        return "city";
    }
}