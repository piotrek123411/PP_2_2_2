//package web.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import web.model.Car;
//import web.service.CarService;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.ResourceBundle;
//
//@Controller
//public class CarController {
//
//    @GetMapping("/cars")
//    public String getCars(@RequestParam(name="locale", defaultValue = "en", required = false)String locale,  ModelMap model) {
//        model.addAttribute("cars", new CarService().carsCount());
//        ResourceBundle bundle = ResourceBundle.getBundle("language_" + locale);
//        model.addAttribute("headline", bundle.getString("headline"));
//        return "cars";
//    }
////    public String cars(@RequestParam(value = "count", defaultValue = "5") int allCars, Model model) {
////
////    }
//}
package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.Service;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", defaultValue = "5") int number, Model model) {
        Service service = new CarService();
        model.addAttribute("list", service.getCars(number));
        return "cars";
    }
}
