package com.example.demo.Controllers;

import com.example.demo.Models.Degree;
import com.example.demo.Repository.DegreeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/degree")
public class DegreeController {

    @Autowired
    DegreeRepository degreeRepository;

    @GetMapping("/{did}")
    public Degree getDegreeName(@PathVariable(value = "did") int id){
        return degreeRepository.findByDegreeId(id);
    }

    @GetMapping("/")
    public List<Degree> getAll(){
        return degreeRepository.findAll();
    }

    @PostMapping("/")
    public Degree createDegree(@RequestBody Degree degree){
        return degreeRepository.save(degree);
    }

    @PutMapping("/{did}")
    public Degree updateDegree(@PathVariable(value = "did") int did, @RequestBody Degree degree){
        Optional<Degree> existingDegree = degreeRepository.findById(did);
        Degree newDegree = existingDegree.get();
        newDegree.setDegreeName(degree.getDegreeName());
        newDegree.setField(degree.getField());
        newDegree.setJobs(degree.getJobs());
        return degreeRepository.save(newDegree);
    }

    @DeleteMapping("/{did}")
    public void deleteDegree(@PathVariable(value = "did") int did){
        degreeRepository.deleteById(did);
    }


}

