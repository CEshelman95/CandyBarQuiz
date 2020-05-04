package com.revature.Domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "candy_bars")
public class candyBar {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "candy_name")
	private String candyName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCandyName() {
		return candyName;
	}

	public void setCandyName(String candyName) {
		this.candyName = candyName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((candyName == null) ? 0 : candyName.hashCode());
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		candyBar other = (candyBar) obj;
		if (candyName == null) {
			if (other.candyName != null)
				return false;
		} else if (!candyName.equals(other.candyName))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "candyBar [id=" + id + ", candyName=" + candyName + "]";
	}

	public candyBar(int id, String candyName) {
		super();
		this.id = id;
		this.candyName = candyName;
	}

	public candyBar() {
		super();
	}
	
}
