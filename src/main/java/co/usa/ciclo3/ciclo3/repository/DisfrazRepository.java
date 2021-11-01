package co.usa.ciclo3.ciclo3.repository;


import co.usa.ciclo3.ciclo3.model.Disfraz;
import co.usa.ciclo3.ciclo3.repository.crud.DisfrazCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class DisfrazRepository {

    @Autowired
    private DisfrazCrudRepository disfrazCrudRepository;

    public List<Disfraz> getAll (){
        return(List<Disfraz>) disfrazCrudRepository.findAll();

    }

    public Optional<Disfraz> getDisfraz(int id){
        return disfrazCrudRepository.findById(id);

    }

    public Disfraz save(Disfraz p){
        return disfrazCrudRepository.save(p);
    }


}
