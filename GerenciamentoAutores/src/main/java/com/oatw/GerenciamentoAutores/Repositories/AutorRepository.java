package com.oatw.GerenciamentoAutores.Repositories;

import com.oatw.GerenciamentoAutores.Models.AutorModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AutorRepository extends JpaRepository<AutorModel, UUID> {
    AutorModel getByNome(String nome);
}
