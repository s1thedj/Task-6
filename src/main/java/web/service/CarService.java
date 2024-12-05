package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    public static final List<Car> cars = new ArrayList<>();

    public CarService() {
        cars.add(new Car("Toyota", 1999, "Blue"));
        cars.add(new Car("Suzuki", 1999, "Black"));
        cars.add(new Car("Lexus", 2013, "Yellow"));
        cars.add(new Car("Mazda", 2020, "Black"));
        cars.add(new Car("Hyundai", 2021, "White"));
    }

    public static List<Car> getCars(int count) {
        if (count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }

}
