package ck;

import java.text.NumberFormat;
import java.util.Locale;

public abstract class TaiKhoan {
	protected final String maTaiKhoan ; 
	protected String tenChuTaiKhoan ; 
	protected double soDu ; 
	protected static final LaiSuatCoBan LAI_SUAT_CO_BAN  = LaiSuatCoBan.LAI_SUAT_CO_BAN ;
	
	public TaiKhoan() {
		maTaiKhoan = "" ; 
		this.tenChuTaiKhoan = "" ;
		this.soDu = 0.0 ; 
	}

	public TaiKhoan(String maTaiKhoan, String tenChuTaiKhoan, double soDu) {
		if(maTaiKhoan == null || maTaiKhoan.trim().isEmpty()) { 
			throw new IllegalArgumentException("ma tai khoan khong hop le "); 
		}
		if(tenChuTaiKhoan == null || tenChuTaiKhoan.trim().isEmpty()) { 
			throw new IllegalArgumentException("ten tai khoan khong hop le "); 
		}
		this.maTaiKhoan = maTaiKhoan.trim();
		if(soDu < 50000) { 
			throw new IllegalArgumentException("so du khong hop le "); 
		}
		setTenChuTaiKhoan(tenChuTaiKhoan); 
		setSoDu(soDu); 
	}

	public String getMaTaiKhoan() {
		return maTaiKhoan;
	}

	public String getTenChuTaiKhoan() {
		return tenChuTaiKhoan;
	}

	public double getSoDu() {
		return soDu;
	}

	public static LaiSuatCoBan getLaiSuatCoBan() {
		return LAI_SUAT_CO_BAN;
	}

	public void setTenChuTaiKhoan(String tenChuTaiKhoan) {
		this.tenChuTaiKhoan = tenChuTaiKhoan;
	}

	public void setSoDu(double soDu) {
		this.soDu = soDu;
	} 
	public abstract double getTienLai() ;

	@Override
	public String toString() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("vi", "VN")); 
		return String.format("%10s | %15s | %15s | %15s ", 
				this.maTaiKhoan , this.tenChuTaiKhoan,nf.format(this.soDu), nf.format(getTienLai()));
	}
	

	
	
	
	
	 
	
}
