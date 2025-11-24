package ck;

public class VeTungPhan extends Ve  {
	private String tenTroChoi  ; 
	private int soLuotChoi  ;
	public VeTungPhan(String maVe, String tenKhachHang, int soLuongNguoi, String tenTroChoi, int soLuotChoi) {
		super(maVe, tenKhachHang, soLuongNguoi);
	
		if(tenTroChoi == null || tenTroChoi.trim().isEmpty()) {
			throw new IllegalArgumentException("tenTroChoi khong hop le "); 
		}
		setTenTroChoi(tenTroChoi); 
		setSoLuotChoi(soLuotChoi); 
	}
	public String getTenTroChoi() {
		return tenTroChoi;
	}
	public int getSoLuotChoi() {
		return soLuotChoi;
	}
	public void setTenTroChoi(String tenTroChoi) {
		this.tenTroChoi = tenTroChoi;
	}
	public void setSoLuotChoi(int soLuotChoi) {
		this.soLuotChoi = soLuotChoi;
	}
	@Override
	public String toString() {
		return super.toString() + String.format("    |tenTroChoi : %s | soLuotChoi :%s", this.tenTroChoi , this.soLuotChoi); 
	}
	@Override
	public double tinhDoanhThu() {
		double doanhThu ; 
		doanhThu = this.soLuongNguoi * DON_GIA_CO_BAN.getTyGia() *0.8 ; 
		return doanhThu; 
	} 
	

	

}
