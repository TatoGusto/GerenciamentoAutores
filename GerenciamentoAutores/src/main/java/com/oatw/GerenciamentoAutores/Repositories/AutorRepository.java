package com.oatw.GerenciamentoAutores.Repositories;

import com.oatw.GerenciamentoAutores.Models.AutorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<AutorModel,Long> {
}
