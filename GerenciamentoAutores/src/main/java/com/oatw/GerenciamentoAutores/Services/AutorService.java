package com.oatw.GerenciamentoAutores.Services;

import com.oatw.GerenciamentoAutores.Models.AutorModel;
import com.oatw.GerenciamentoAutores.Repositories.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {

    @Autowired
    AutorRepository autorRepository;

    public AutorModel createAutor(AutorModel autorModel){
        return autorRepository.save(autorModel);
    }

    public List<AutorModel> getAll(){
        return autorRepository.findAll();
    }

    public AutorModel getById(Long id){
        return autorRepository.getById(id);
    }

    public void deleteById(Long id){
        autorRepository.deleteById(id);
    }
}
