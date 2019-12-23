package com.spring.mvc.springmvctest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;

@Entity
public class Pokemon 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private String type;
	private String img;
	private Number attack;
	private Number defence;
	private Number life;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Number getAttack() {
		return attack;
	}
	public void setAttack(Number attack) {
		this.attack = attack;
	}
	public Number getDefence() {
		return defence;
	}
	public void setDefence(Number defence) {
		this.defence = defence;
	}
	public Number getLife() {
		return life;
	}
	public void setLife(Number life) {
		this.life = life;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
}
