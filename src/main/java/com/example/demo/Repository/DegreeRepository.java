package com.example.demo.Repository;
import com.example.demo.Models.Degree;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DegreeRepository extends JpaRepository<Degree, Integer> {

    Degree findByDegreeId(int id);
}
