package ck;

import java.text.DecimalFormat;

public abstract class GiangVien {
	protected final String maGV  ; 
	protected String hoVaTen; 
	protected String email ; 
	protected static final  DonGiaMoiTiet DON_GIA_MOI_TIET =DonGiaMoiTiet.DON_GIA_MOI_TIET ; 
	public GiangVien(String maGV, String hoVaTen, String email) {
		if(maGV == null || maGV.trim().isEmpty()) { 
			 throw new IllegalArgumentException("maGV khong hop le ") ; 
		}
		if(hoVaTen == null || hoVaTen.trim().isEmpty()) { 
			 throw new IllegalArgumentException("hoVaTen khong ho") ; 
		}
		
		this.maGV = maGV ; 
		setHoVaTen(hoVaTen) ;
		setEmail(email); 

	}
	public String getMaGV() {
		return maGV;
	}
	public String getHoVaTen() {
		return hoVaTen;
	}
	public String getEmail() {
		return email;
	}
	public static DonGiaMoiTiet getDonGiaMoiTiet() {
		return DON_GIA_MOI_TIET;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
public abstract double linhLuong() ; 
	
	
	
	@Override
	public String toString() {
		
		DecimalFormat d = new DecimalFormat("#,### " + "VND" ) ; 
		return String.format("%10s | %15s | %30s |  %15s" , 
				this.maGV , this.hoVaTen , this.email , this.linhLuong() ) ; 
	}
	
	
	
	
	
}