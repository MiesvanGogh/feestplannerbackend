package com.project.feestplannerbackend.Repository;

import com.project.feestplannerbackend.Model.Party;
import com.project.feestplannerbackend.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PartyRepository extends JpaRepository<Party, Integer> {

}
