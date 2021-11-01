package co.usa.ciclo3.ciclo3.service;


import co.usa.ciclo3.ciclo3.model.Disfraz;
import co.usa.ciclo3.ciclo3.repository.DisfrazRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DisfrazService {

    @Autowired
    private DisfrazRepository disfrazRepository;

    public List<Disfraz> getAll(){
        return disfrazRepository.getAll();

    }

    public Optional<Disfraz> getDisfraz(int id){
        return disfrazRepository.getDisfraz(id);

    }

    public Disfraz save(Disfraz p){
        if(p.getId()==null){
            return disfrazRepository.save(p);
        }else{
            Optional<Disfraz> paux=disfrazRepository.getDisfraz(p.getId());
            if(paux.isEmpty()){
                return disfrazRepository.save(p);
            }else{
                return p;

            }
        }

    }

}
