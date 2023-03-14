package web.controller;

//import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDAO;

@Controller
public class CarController {

    private final CarDAO carDAO;

    public CarController(CarDAO carDAO) {
        this.carDAO = carDAO;
    }


    @GetMapping ("/cars")
    public String showCars(@RequestParam (value = "count", defaultValue = "5") int count, Model model) {
        if ( count == 0 | count > 5 ) {
            model.addAttribute("carsAll", carDAO.getAllCars());
            return "cars";
        }
        model.addAttribute("carsCount", carDAO.showCars(count));
        return "carsCount";
    }

}
