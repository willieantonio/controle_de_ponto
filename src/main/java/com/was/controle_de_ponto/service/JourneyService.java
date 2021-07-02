package com.was.controle_de_ponto.service;

import com.was.controle_de_ponto.model.Workday;
import com.was.controle_de_ponto.repository.JornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JourneyService {

    JornadaRepository jornadaRepository;

    @Autowired
    public  JourneyService(JornadaRepository jornadaRepository){
        this.jornadaRepository = jornadaRepository;
    }

    public Workday saveJourney(Workday workday){
        return jornadaRepository.save(workday);
    }

    public List<Workday> findAll(){
        return jornadaRepository.findAll();
    }

    public Optional<Workday> getById(Long idJourney){
        return jornadaRepository.findById(idJourney);
    }

    public Workday updateJourney(Workday workday){
        return jornadaRepository.save(workday);
    }

    public void  deleteJourney(Long idJourney){
        jornadaRepository.deleteById(idJourney);
    }
}
