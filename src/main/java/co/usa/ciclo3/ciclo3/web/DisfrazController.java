package co.usa.ciclo3.ciclo3.web;

import co.usa.ciclo3.ciclo3.model.Disfraz;
import co.usa.ciclo3.ciclo3.service.DisfrazService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping( "/api/Disfraz")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class DisfrazController {

    @Autowired
    private DisfrazService disfrazService;

    @GetMapping("/all")
    public List<Disfraz> getDisfraces() {
        return disfrazService.getAll();
    }
        @GetMapping( "/{id}")
        public Optional<Disfraz> getDisfraz(@PathVariable("id") int id){
            return disfrazService.getDisfraz(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Disfraz save(@RequestBody Disfraz p){
        return disfrazService.save(p);
    }




}
