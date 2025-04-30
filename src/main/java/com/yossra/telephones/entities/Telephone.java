package com.yossra.telephones.entities;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Telephone {
	private Long idTel;
	private String marque;
	private double capacite;
	private Date dateSortie;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Telephone() {
		super();
	}
	public Telephone(String marque, double capacite, Date dateSortie) {
		super();
		this.marque = marque;
		this.capacite = capacite;
		this.dateSortie = dateSortie;
	}
	public Long getIdTel() {
		return idTel;
	}
	public void setIdTel(Long idTel) {
		this.idTel = idTel;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public double getCapacite() {
		return capacite;
	}
	public void setCapacite(double capacite) {
		this.capacite = capacite;
	}
	public Date getDateSortie() {
		return dateSortie;
	}
	public void setDateSortie(Date dateSortie) {
		this.dateSortie = dateSortie;
	}
	@Override
	public String toString() {
		return "Telephone [idTel=" + idTel + ", marque=" + marque + ", capacite=" + capacite + ", dateSortie="
				+ dateSortie + "]";
	}
	
	
}
