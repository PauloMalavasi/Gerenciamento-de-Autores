package com.ph.autores.Controller;

import com.ph.autores.Entity.AutorEntity;
import com.ph.autores.Service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/autores")
public class AutorController {

    @Autowired
    public AutorService autorService;

    @PostMapping
    public AutorEntity create(@RequestBody AutorEntity autorEntity){
        return autorService.create(autorEntity);
    }

    @GetMapping
    public List<AutorEntity> findAll(){
        return autorService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<AutorEntity> findById(@PathVariable Long id){
        return autorService.findId(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        autorService.delete(id);
    }
}
