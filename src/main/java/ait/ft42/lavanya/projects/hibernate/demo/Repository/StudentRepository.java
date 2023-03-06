package ait.ft42.lavanya.projects.hibernate.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ait.ft42.lavanya.projects.hibernate.demo.Entity.Hosteller;

public interface StudentRepository extends JpaRepository<Hosteller, Long> {}
