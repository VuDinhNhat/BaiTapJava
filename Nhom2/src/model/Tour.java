package model;

import java.util.ArrayList;

public class Tour {
	private int maTour;
	private ArrayList<DiaDiem> hanhTrinh;
	private int soDiaDiem;
	private float tongChiPhi;
	
	public Tour() {
		// TODO Auto-generated constructor stub
		this.hanhTrinh = new ArrayList<DiaDiem>();
	}
	
	public Tour(int maTour, ArrayList<DiaDiem> hanhTrinh,int soDiaDiem,float tongChiPhi) {
		this.maTour = maTour;
		this.hanhTrinh = hanhTrinh;
		this.soDiaDiem = soDiaDiem;
		this.tongChiPhi = tongChiPhi;
	}

	
	
	public int getMaTour() {
		return maTour;
	}

	public void setMaTour(int maTour) {
		this.maTour = maTour;
	}

	public ArrayList<DiaDiem> getHanhTrinh() {
		return hanhTrinh;
	}

	public void setHanhTrinh(ArrayList<DiaDiem> hanhTrinh) {
		this.hanhTrinh = hanhTrinh;
	}

	public int getSoDiaDiem() {
		return soDiaDiem;
	}

	public void setSoDiaDiem(int soDiaDiem) {
		this.soDiaDiem = soDiaDiem;
	}

	public float getTongChiPhi() {
		return tongChiPhi;
	}

	public void setTongChiPhi(float tongChiPhi) {
		this.tongChiPhi = tongChiPhi;
	}

	public void insertDiaDiem(DiaDiem diaDiem) {
		this.hanhTrinh.add(diaDiem);
	}
	
	public void deleteDiaDiem(DiaDiem diaDiem) {
		this.hanhTrinh.remove(diaDiem);
	}
	
	public void updateDiaDiem(DiaDiem diaDiem) {
		this.hanhTrinh.remove(diaDiem);
		this.hanhTrinh.add(diaDiem);
	}
}
