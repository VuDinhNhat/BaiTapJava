package model;

import java.util.ArrayList;

public class QLTourModel {
	private ArrayList<Tour> dsTour;
	public QLTourModel() {
		// TODO Auto-generated constructor stub
		this.dsTour = new ArrayList<Tour>();
	}
	
	public QLTourModel(ArrayList<Tour> dsTour) {
		this.dsTour = dsTour;
	}

	public ArrayList<Tour> getDsTour() {
		return dsTour;
	}

	public void setDsTour(ArrayList<Tour> dsTour) {
		this.dsTour = dsTour;
	}
	
	public void insertTour(Tour tour) {
		this.dsTour.add(tour);
	}
	
	public void deleteTour(Tour tour) {
		this.dsTour.remove(tour);
	}
	
	public void updateTour(Tour tour) {
		this.dsTour.remove(tour);
		this.dsTour.add(tour);
	}
}
