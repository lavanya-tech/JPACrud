package ait.ft42.lavanya.projects.hibernate.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ait.ft42.lavanya.projects.hibernate.demo.Entity.Hosteller;
import ait.ft42.lavanya.projects.hibernate.demo.Entity.Room;

public interface RoomRepository extends JpaRepository<Room, Long> {

}

