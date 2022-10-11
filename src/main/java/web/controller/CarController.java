package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

import java.util.ResourceBundle;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(name="locale", defaultValue = "en", required = false)String locale, ModelMap model) {
        model.addAttribute("cars", new CarService().getAllCars());
        ResourceBundle bundle = ResourceBundle.getBundle("language_" + locale);
        model.addAttribute("headline", bundle.getString("headline"));
        return "cars";
    }
}
