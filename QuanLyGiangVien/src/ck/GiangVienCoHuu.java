package ck;

import java.text.DecimalFormat;

public class GiangVienCoHuu extends GiangVien {
	private double LuongThoaThuan ; 
	private double heSoThamThien  ;
	public GiangVienCoHuu(String maGV, String hoVaTen, String email, double luongThoaThuan, double heSoThamThien) {
		super(maGV, hoVaTen, email);
		if(heSoThamThien < 1 || heSoThamThien > 5 ) { 
			throw new IllegalArgumentException("heSoThamThien khong hop le "); 
		}
		LuongThoaThuan = luongThoaThuan;
		this.heSoThamThien = heSoThamThien;
	}
	public double getLuongThoaThuan() {
		return LuongThoaThuan;
	}
	public double getHeSoThamThien() {
		return heSoThamThien;
	}
	public void setLuongThoaThuan(double luongThoaThuan) {
		LuongThoaThuan = luongThoaThuan;
	}
	public void setHeSoThamThien(double heSoThamThien) {
		this.heSoThamThien = heSoThamThien;
	}
	@Override
	public String toString() {
		DecimalFormat d = new DecimalFormat("#,### " + "VND" ) ; 
		return super.toString() + String.format(" | Luong Thoa Thuan  : %s  |  He So Tham Nien :  %s "
				
				
				, d.format(this.LuongThoaThuan) , this.heSoThamThien 
				
				);
				
	
	}
	@Override
	public double linhLuong() {
		double tienLuong  = this.LuongThoaThuan * this.heSoThamThien ; 	
		return tienLuong ; 
	}
	
	
 
	
	

}
