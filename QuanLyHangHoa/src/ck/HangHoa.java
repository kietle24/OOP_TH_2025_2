package ck;

import java.text.NumberFormat;
import java.util.Locale;

public abstract class HangHoa {
	protected final String maHang ; 
	protected String tenHang ; 
	protected double donGia; 
	protected static final ThueSuatCoBan THUE_SUAT_CO_BAN = ThueSuatCoBan.THUE_SUAT_CO_BAN ;
	public HangHoa(String maHang, String tenHang, double donGia) {
		if(maHang  == null || maHang.trim().isEmpty()) { 
			throw new IllegalArgumentException("ma hang khong hop le ");
		}
		if(tenHang  == null || tenHang.trim().isEmpty()) { 
			throw new IllegalArgumentException("ten Hang khong hop le ");
		}
		if(donGia < 10000 ) {
			throw new IllegalArgumentException("don Gia khong hop le "); 
			
		}

		this.maHang = maHang ; 
		setTenHang(tenHang);
		setDonGia(donGia);
	}
	public String getMaHang() {
		return maHang;
	}
	public String getTenHang() {
		return tenHang;
	}
	public double getDonGia() {
		return donGia;
	}
	public static ThueSuatCoBan getThueSuatCoBan() {
		return THUE_SUAT_CO_BAN;
	}
	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	@Override
	public String toString() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("vi", "VN")); 
		return String.format("|%10s | %20s | %10s |%10s ",
				this.maHang, this.tenHang, 
				
				nf.format(donGia), nf.format(this.tinhThueVat()) 
				
		); 
	} 
	
	public abstract double tinhThueVat() ; 
	
	
	

}
