package com.m2i.formation.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="T_TP")
public class TravauxPratiques {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TP_ID")
	private Long tpId;
	@Column(name = "TP_SUBJECT")
	private String tpSubject;
	@Column(name = "TP_DURATION")
	private Long tpDuration;

	public TravauxPratiques() {
	}

	public TravauxPratiques(String tpSubject, Long tpDuration) {

		this.tpSubject = tpSubject;
		this.tpDuration = tpDuration;
	}

	public Long getTpId() {
		return tpId;
	}

	public void setTpId(Long tpId) {
		this.tpId = tpId;
	}

	public String getTpSubject() {
		return tpSubject;
	}

	public void setTpSubject(String tpSubject) {
		this.tpSubject = tpSubject;
	}

	public Long getTpDuration() {
		return tpDuration;
	}

	public void setTpDuration(Long tpDuration) {
		this.tpDuration = tpDuration;
	}

}
