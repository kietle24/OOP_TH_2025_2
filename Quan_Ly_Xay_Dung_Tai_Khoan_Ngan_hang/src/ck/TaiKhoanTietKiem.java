package ck;

public class TaiKhoanTietKiem extends TaiKhoan{
	private KyHan kyHan ; 
	private boolean email ;
	public TaiKhoanTietKiem(String maTaiKhoan, String tenChuTaiKhoan, double soDu, KyHan kyHan, boolean email) {
		super(maTaiKhoan, tenChuTaiKhoan, soDu);
		this.kyHan = kyHan;
		this.email = email;
	}
	
	
	public KyHan getKyHan() {
		return kyHan;
	}



	public boolean isEmail() {
		return email;
	}



	public void setKyHan(KyHan kyHan) {
		this.kyHan = kyHan;
	}



	public void setEmail(boolean email) {
		this.email = email;
	}



	@Override
	public double getTienLai() {
		return this.soDu*LAI_SUAT_CO_BAN.getTyLe()*1.5;
	}


	@Override
	public String toString() {
		return super.toString()+ String.format("|Ky Han :%10s | Emai: %s", 
				this.kyHan.getMoTa(), this.email ? "Co":" Khong"); 
	}
	
	
	
	
	

}
