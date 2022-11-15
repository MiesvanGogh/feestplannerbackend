package com.project.feestplannerbackend.Controller;

import com.project.feestplannerbackend.Model.Party;
import com.project.feestplannerbackend.Repository.PartyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/Party")
public class PartyController {

    @Autowired
    private PartyRepository partyRepository;

    @PostMapping("/add")
    Party newParty(@RequestBody Party newParty){
        return partyRepository.save(newParty);
    }

    @GetMapping("/getAll")
    List<Party> getallPartys(){
        return partyRepository.findAll();
    }
}
