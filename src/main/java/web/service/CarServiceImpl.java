package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    public List<Car> getCars(int number) {
        List<Car> list = new ArrayList<>();
        list.add(new Car("RangeRover", "White", 200));
        list.add(new Car("Mercedes", "Black", 124));
        list.add(new Car("BMW", "Grey", 545));
        list.add(new Car("Porsche", "Red", 911));
        list.add(new Car("Jeep", "Cyan", 100));
        if (number == 0 || number > 5) return list;
        return list.stream().limit(number).collect(Collectors.toList());
    }
}
