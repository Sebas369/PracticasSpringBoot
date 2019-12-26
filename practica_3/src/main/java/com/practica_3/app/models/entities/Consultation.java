package com.practica_3.app.models.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "consultation_module")
public class Consultation implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	//@Column(nullable = false)
	private Integer id;
	
	private String code;
	
	private String name;
	
	@Column(name = "is_mobile")
	private Boolean isMobile;
	
	@Column(name = "order_show")
	private Integer orderShow;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getIsMobile() {
		return isMobile;
	}

	public void setIsMobile(Boolean isMobile) {
		this.isMobile = isMobile;
	}

	public Integer getOrderShow() {
		return orderShow;
	}

	public void setOrderShow(Integer orderShow) {
		this.orderShow = orderShow;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
