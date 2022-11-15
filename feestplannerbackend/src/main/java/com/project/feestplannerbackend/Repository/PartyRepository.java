package com.project.feestplannerbackend.Repository;

import com.project.feestplannerbackend.Model.Party;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartyRepository extends JpaRepository<Party, Integer> {
}
