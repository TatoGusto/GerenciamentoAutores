package com.oatw.GerenciamentoAutores.Services;

import com.oatw.GerenciamentoAutores.Models.AutorModel;
import com.oatw.GerenciamentoAutores.Repositories.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

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

    public AutorModel getById(UUID id){
        return autorRepository.getById(id);
    }

    public AutorModel getByNome(String nome){ return autorRepository.getByNome(nome);}

    public void deleteById(UUID id){
        autorRepository.deleteById(id);
    }
}
