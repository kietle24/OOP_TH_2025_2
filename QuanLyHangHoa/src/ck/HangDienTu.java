package ck;

public class HangDienTu extends HangHoa{
	private String hangSanXuat ; 
	private int thoiGianBaoHanh ;
	public HangDienTu(
			String maHang, 
			String tenHang, 
			double donGia,
			String hangSanXuat, int thoiGianBaoHanh) {
		super(maHang, tenHang, donGia);
		if(thoiGianBaoHanh < 0  ) { 
			throw new IllegalArgumentException("thoiGianBaoHanh khong hop le ");
		}
		this.hangSanXuat = hangSanXuat;
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}
	public String getHangSanXuat() {
		return hangSanXuat;
	}
	public int getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}
	public void setHangSanXuat(String hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}
	public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}
	@Override
	public double tinhThueVat() {
		
		return this.donGia*  THUE_SUAT_CO_BAN.getTyLe() *1.2 ;
	}
	@Override
	public String toString() {
		return super.toString() + String.format("| Hang SX: %20s | TG BH: %10s", this.hangSanXuat , this.thoiGianBaoHanh );
	} 
	
	
	
	
	

}
