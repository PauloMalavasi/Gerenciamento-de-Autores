package com.ph.autores.Service;

import com.ph.autores.Entity.AutorEntity;
import com.ph.autores.Repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutorService {

    @Autowired
    public AutorRepository autorRepository;

    public List<AutorEntity> findAll(){
        return autorRepository.findAll();
    }

    public AutorEntity create(AutorEntity autorEntity){
        return autorRepository.save(autorEntity);
    }

    public void delete(Long id){
        autorRepository.deleteById(id);
    }

    public Optional<AutorEntity> findId(Long id){
        return autorRepository.findById(id);
    }
}
