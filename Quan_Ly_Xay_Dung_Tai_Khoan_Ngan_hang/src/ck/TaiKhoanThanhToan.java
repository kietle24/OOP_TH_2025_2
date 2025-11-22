package ck;

public class TaiKhoanThanhToan extends TaiKhoan{
	private String loaiThe ; 
	private int hanMuc ;
	public TaiKhoanThanhToan(
			String maTaiKhoan,
			String tenChuTaiKhoan, double soDu, 
			String loaiThe, int hanMuc) {
		super(maTaiKhoan, tenChuTaiKhoan, soDu);
		if(hanMuc < 0 ) { 
			throw new IllegalArgumentException("han muc khong hop le ")  ; 
		}
		this.loaiThe = loaiThe;
		this.hanMuc = hanMuc;
	}
	
	public String getLoaiThe() {
		return loaiThe;
	}

	public int getHanMuc() {
		return hanMuc;
	}

	public void setLoaiThe(String loaiThe) {
		this.loaiThe = loaiThe;
	}

	public void setHanMuc(int hanMuc) {
		this.hanMuc = hanMuc;
	}

	@Override
	public double getTienLai() {
		
		return this.soDu *LAI_SUAT_CO_BAN.getTyLe() * 0.1 ;
	}
	
	@Override
	public String toString() {
		return super.toString()+ String.format("|Loai The :%10s | Han Muc : %s", 
				this.loaiThe , this.hanMuc); 
	}
	
	
	

}
