package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {
    private final CarService cars;

    @Autowired
    CarController(CarService cars) {
        this.cars = cars;
    }

    @GetMapping(value = "/cars")
    public String helloPage(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        System.out.println(count + " cars");
        model.addAttribute("all", cars.getCars(count));
        return "cars";
    }
}
