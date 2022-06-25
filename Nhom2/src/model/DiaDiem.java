package model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

public class DiaDiem {
	private int maDiaDiem;
	private String tenDiaDiem;
	private float chiPhi;
	
	public DiaDiem(int maDiaDiem,String tenDiaDiem,float chiPhi) {
		// TODO Auto-generated constructor stub
		this.maDiaDiem = maDiaDiem;
		this.tenDiaDiem = tenDiaDiem;
		this.chiPhi = chiPhi;
	}

	
	
	public int getMaDiaDiem() {
		return maDiaDiem;
	}



	public void setMaDiaDiem(int maDiaDiem) {
		this.maDiaDiem = maDiaDiem;
	}



	public String getTenDiaDiem() {
		return tenDiaDiem;
	}



	public void setTenDiaDiem(String tenDiaDiem) {
		this.tenDiaDiem = tenDiaDiem;
	}



	public float getChiPhi() {
		return chiPhi;
	}



	public void setChiPhi(float chiPhi) {
		this.chiPhi = chiPhi;
	}

	


	@Override
	public int hashCode() {
		return Objects.hash(chiPhi, maDiaDiem, tenDiaDiem);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DiaDiem other = (DiaDiem) obj;
		return Float.floatToIntBits(chiPhi) == Float.floatToIntBits(other.chiPhi) && maDiaDiem == other.maDiaDiem
				&& Objects.equals(tenDiaDiem, other.tenDiaDiem);
	}


	public static ArrayList<DiaDiem> setDSDiaDiem(){
		String[] arr_set_DiaDiem = {};
		ArrayList<DiaDiem> listSetDiaDiem = new ArrayList<DiaDiem>();
		int i=0;
		float j = 100;
		for (String tenDiaDiem : arr_set_DiaDiem) {
			DiaDiem t = new DiaDiem(i, tenDiaDiem, j);
			listSetDiaDiem.add(t);
		}
		return listSetDiaDiem;
	}

	public static ArrayList<DiaDiem> getDSDiaDiem(){
		String[] arr_get_DiaDiem = {
				"ĐH Công Nhghiêp","ĐH Thương Mại","ĐH Quốc Gia","ĐH Sư Phạm","HV Báo Chí","HV Nông Nghiệp","HV Ngân Hàng","ĐH GTVT","ĐH Bách Khoa","ĐH Xây Dựng","ĐH KTQD","ĐH Luật",
				"ĐH FPT","ĐH RMIT","ĐH Y","ĐH KHTN"		
		};
		ArrayList<DiaDiem> listDiaDiem = new ArrayList<DiaDiem>();
		int i=0;
		float j = 100;
		for (String tenDiaDiem : arr_get_DiaDiem) {
			DiaDiem t = new DiaDiem(i, tenDiaDiem, j);
			listDiaDiem.add(t);
		}
		return listDiaDiem;
		
	}

}
