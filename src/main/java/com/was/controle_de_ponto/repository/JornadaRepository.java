package com.was.controle_de_ponto.repository;

import com.was.controle_de_ponto.model.Workday;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaRepository extends JpaRepository<Workday, Long> {
}
