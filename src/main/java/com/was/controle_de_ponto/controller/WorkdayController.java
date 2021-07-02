package com.was.controle_de_ponto.controller;

import com.was.controle_de_ponto.model.Workday;
import com.was.controle_de_ponto.service.JourneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/journal")
public class WorkdayController {
    @Autowired
    JourneyService journeyService;

    @PostMapping
    public Workday createJourney(@RequestBody Workday workday){
        return journeyService.saveJourney(workday);
    }

    @GetMapping
    public List<Workday> getJourneyList(){
        return journeyService.findAll();
    }

    @GetMapping("/{idJourney}")
    public ResponseEntity<Workday> getJourneyByID(@PathVariable("idJourney") Long idJourney) throws  Exception{
        return  ResponseEntity.ok(journeyService.getById(idJourney).orElseThrow(() -> new NoSuchElementException("Not found!")));
    }

    @PutMapping
    public Workday updateJourney(@RequestBody Workday workday){
        return journeyService.updateJourney(workday);
    }

    @DeleteMapping("/{idJourney}")
    public ResponseEntity deleteByID(@PathVariable("idJourney") Long idJourney) throws  Exception{
        try{
            journeyService.deleteJourney(idJourney);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<Workday>) ResponseEntity.ok();
    }
}
