package ait.ft42.lavanya.projects.hibernate.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ait.ft42.lavanya.projects.hibernate.demo.Entity.Hosteller;

public interface StudentRepository extends JpaRepository<Hosteller, Long> {
	@Query(value = "SELECT * from hostellers where room_id = :room_id",nativeQuery = true)
	public List<Hosteller> getStudents(@Param("room_id") long room_id);
}
