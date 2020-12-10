package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.CarApplication;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @RequestMapping("/cars")
    public String showCars(@RequestParam(value = "count", required = false) Integer count, Model model){
        List<Car> cars = new CarApplication().getList(count);
        model.addAttribute("cars", cars);
        return "cars";
    }

}
