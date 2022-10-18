package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String cars(@RequestParam(value = "count", defaultValue = "5") int allCars, Model model) {
        List<Car> list = new ArrayList<>();
        list.add(new Car("RangeRover", "White", 200));
        list.add(new Car("Mercedes", "Black", 124));
        list.add(new Car("BMW", "Grey", 545));
        list.add(new Car("Porsche", "Red", 911));
        list.add(new Car("Jeep", "Cyan", 100));
        list = CarService.carsCount(list, allCars);
        model.addAttribute("list", list);
        return "car";
    }
}
