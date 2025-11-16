package com.Garbage_Reports.Reports.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "reports")
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String area;

    @Column(columnDefinition = "TEXT")
    private String description;

    private double latitude;
    private double longitude;

    @Column(columnDefinition = "LONGTEXT")
    private String photo;

    private String status = "Pending";

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Report(int id, String name, String area, String description, double latitude, double longitude, String photo,
			String status) {
		super();
		this.id = id;
		this.name = name;
		this.area = area;
		this.description = description;
		this.latitude = latitude;
		this.longitude = longitude;
		this.photo = photo;
		this.status = status;
	}

	public Report(String name, String area, String description, double latitude, double longitude, String photo,
			String status) {
		super();
		this.name = name;
		this.area = area;
		this.description = description;
		this.latitude = latitude;
		this.longitude = longitude;
		this.photo = photo;
		this.status = status;
	}

	public Report() {
		super();
	}

   
}
