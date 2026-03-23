package com.oatw.GerenciamentoAutores.Controllers;

import com.oatw.GerenciamentoAutores.Models.AutorModel;
import com.oatw.GerenciamentoAutores.Services.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(path = "/autor")
public class AutorController {

    @Autowired
    AutorService autorService;

    @PostMapping
    public ResponseEntity<AutorModel> createAutor(@RequestBody AutorModel autorModel){
        AutorModel request = autorService.createAutor(autorModel);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(autorModel.getId()).toUri();
        return ResponseEntity.created(uri).body(request);
    }

    @GetMapping
    public ResponseEntity<List<AutorModel>> getAll(){
        List<AutorModel> request = autorService.getAll();
        return ResponseEntity.ok().body(request);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AutorModel> getById(@PathVariable Long id){
        AutorModel request = autorService.getById(id);
        return ResponseEntity.ok().body(request);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id){
        autorService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
