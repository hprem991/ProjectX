package com.ProjectX.Dao;

// This Class is the one to probe in hibernate
public class Location {

	private double m_longitute;
	private double m_latitute;
	private double m_radius;
	public double getM_longitute() {
		return m_longitute;
	}
	public void setM_longitute(double m_longitute) {
		this.m_longitute = m_longitute;
	}
	public double getM_latitute() {
		return m_latitute;
	}
	public void setM_latitute(double m_latitute) {
		this.m_latitute = m_latitute;
	}
	public double getM_radius() {
		return m_radius;
	}
	public void setM_radius(double m_radius) {
		this.m_radius = m_radius;
	}
}
