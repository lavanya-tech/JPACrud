package ait.ft42.lavanya.projects.hibernate.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "rooms")
public class Room {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long roomNo;
    private int max_limit;
	public Room(int id, int max_limit) {
		super();
		this.roomNo = id;
		this.max_limit = max_limit;
	}
	public long getId() {
		return roomNo;
	}
	public void setId(int id) {
		this.roomNo = id;
	}
	public int getMax_limit() {
		return max_limit;
	}
	public void setMax_limit(int max_limit) {
		this.max_limit = max_limit;
	}
}
