package ck;

import java.text.NumberFormat;
import java.util.Locale;

public abstract class Trip {
	protected final String maChuyenXe ; 
	protected String tenTaiXe ; 
	protected String bienSoXe ; 
	protected int km ;
	public Trip(
			String maChuyenXe,
			String tenTaiXe, 
			String bienSoXe, int km) {
		if(maChuyenXe == null ||maChuyenXe.trim().isEmpty()|| !maChuyenXe.startsWith("T")) {
			 throw new IllegalArgumentException("maChuyenXe khong hop le "); 
			 
		}
		this.maChuyenXe = maChuyenXe;
		if(km< 0 ) {
			 throw new IllegalArgumentException("km khong hop le "); 
			 
		}
		if(bienSoXe == null ||bienSoXe.trim().isEmpty()) {
			 throw new IllegalArgumentException("bienSoXe khong hop le "); 
			 
		}

		setTenTaiXe(tenTaiXe); 
		setBienSoXe(bienSoXe);
		setKm(km);
	}
	public String getMaChuyenXe() {
		return maChuyenXe;
	}
	public String getTenTaiXe() {
		return tenTaiXe;
	}
	public String getBienSoXe() {
		return bienSoXe;
	}
	public int getKm() {
		return km;
	}
	public void setTenTaiXe(String tenTaiXe) {
		this.tenTaiXe = tenTaiXe;
	}
	public void setBienSoXe(String bienSoXe) {
		this.bienSoXe = bienSoXe;
	}
	public void setKm(int km) {
		this.km = km;
	} 
	
	 public abstract double tinhThanhTien();
	 @Override
	 public String toString() {
	     NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
	     return String.format("%10s | %10s | 15%s | %15s | %10s", 
	             this.maChuyenXe , this.tenTaiXe , this.bienSoXe , this.km , nf.format(tinhThanhTien())); 
	 }
	
	
	
	
	
	
	
	
	
	
}
