package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {


    @GetMapping(value = "/cars")
    public String cars(@RequestParam(value ="count", required = false, defaultValue = "5") int count, Model model) {
        List<Car> cars = CarService.getCars(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}