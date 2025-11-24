package ck;

public class VeTronGoi extends Ve{
	private KhungGio khungGio ; 
	private boolean baoGomBuffet  ;
	public VeTronGoi(
			String maVe, String tenKhachHang, int soLuongNguoi, KhungGio khungGio, boolean baoGomBuffet) {
		super(maVe, tenKhachHang, soLuongNguoi);
		this.khungGio = khungGio;
		this.baoGomBuffet = baoGomBuffet;
	}
	public KhungGio getKhungGio() {
		return khungGio;
	}
	public boolean isBaoGomBuffet() {
		return baoGomBuffet;
	}
	public void setKhungGio(KhungGio khungGio) {
		this.khungGio = khungGio;
	}
	public void setBaoGomBuffet(boolean baoGomBuffet) {
		this.baoGomBuffet = baoGomBuffet;
	}
	@Override
	public String toString() {
		return	super.toString() +
				String.format("   |Khung Gio : %s   | Buffer : %s", this.khungGio.getMoTa()  , this.baoGomBuffet ? " co ": "Khong ") ; 
	}
	@Override
	public double tinhDoanhThu() {
		double doanhThu ; 
		doanhThu = this.soLuongNguoi * DON_GIA_CO_BAN.getTyGia() *1.5 ; 
		return doanhThu; 
	} 
	 
	
}
