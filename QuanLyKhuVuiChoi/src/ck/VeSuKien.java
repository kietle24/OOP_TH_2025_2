package ck;

public class VeSuKien extends Ve {
	private String tenSuKien ; 
	private LoaiGhe loaiGhe  ;
	public VeSuKien(String maVe, String tenKhachHang, int soLuongNguoi, String tenSuKien, LoaiGhe loaiGhe) {
		super(maVe, tenKhachHang, soLuongNguoi);
		this.tenSuKien = tenSuKien;
		this.loaiGhe = loaiGhe;
	}
	public String getTenSuKien() {
		return tenSuKien;
	}
	public LoaiGhe getLoaiGhe() {
		return loaiGhe;
	}
	public void setTenSuKien(String tenSuKien) {
		this.tenSuKien = tenSuKien;
	}
	public void setLoaiGhe(LoaiGhe loaiGhe) {
		this.loaiGhe = loaiGhe;
	}
	@Override
		public String toString() {
			return 	super.toString() + String.format("    |Ten SK : %s | Loai Ghe: %s" , this.tenSuKien , this.loaiGhe.getMoTaNe() ); 
			
	}
	@Override
	public double tinhDoanhThu() {
		double doanhThu ; 
		doanhThu = this.soLuongNguoi * DON_GIA_CO_BAN.getTyGia() *2.0 ; 
		return doanhThu; 
	} 
	
	
	


}
