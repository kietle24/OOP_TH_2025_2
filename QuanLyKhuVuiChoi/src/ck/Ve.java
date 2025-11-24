package ck;

import java.text.NumberFormat;
import java.util.Locale;

public abstract class Ve {
	protected final String maVe ; 
	protected  String tenKhachHang ; 
	protected  int soLuongNguoi ;
	protected DonGiaCoBan  DON_GIA_CO_BAN  = DonGiaCoBan.DON_GIA_CO_BAN ; 
	public Ve(String maVe, String tenKhachHang, int soLuongNguoi) {
		if(maVe == null || maVe.trim().isEmpty()) {
			throw new IllegalArgumentException("maVe khong hop le "); 
		}
		if(tenKhachHang == null || tenKhachHang.trim().isEmpty()) {
			throw new IllegalArgumentException("tenKhachHang khong hop le "); 
		}
		if(soLuongNguoi <= 0 ) {
			throw new IllegalArgumentException("soLuongNguoi khong hop le "); 
		}

		this.maVe = maVe  ; 
		setTenKhachHang(tenKhachHang); 
		setSoLuongNguoi(soLuongNguoi); 
	}
	public String getMaVe() {
		return maVe;
	}
	public String getTenKhachHang() {
		return tenKhachHang;
	}
	public int getSoLuongNguoi() {
		return soLuongNguoi;
	}
	public void setTenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
	}
	public void setSoLuongNguoi(int soLuongNguoi) {
		this.soLuongNguoi = soLuongNguoi;
	} 
	
	
	public abstract double tinhDoanhThu() ;
	@Override
	public String toString() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("vi" , "VN")); 
		return String.format("|%10s | %15s | %10s | %12s", 
				this.maVe , this.tenKhachHang , this.soLuongNguoi , nf.format(tinhDoanhThu()));
	
		
	}

	
	
	
	
	
	
	
	

	
}
