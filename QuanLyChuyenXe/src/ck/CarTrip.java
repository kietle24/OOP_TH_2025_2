package ck;

public class CarTrip extends Trip{
	private int soChoNgoi; 
	private boolean khuyenMai ;
	public CarTrip(String maChuyenXe, String tenTaiXe, String bienSoXe, int km, int soChoNgoi,
			boolean khuyenMai) {
		super(maChuyenXe, tenTaiXe, bienSoXe, km);
		this.soChoNgoi = soChoNgoi;
		this.khuyenMai = khuyenMai;
	}
	public int getSoChoNgoi() {
		return soChoNgoi;
	}
	public boolean isKhuyenMai() {
		return khuyenMai;
	}
	public void setSoChoNgoi(int soChoNgoi) {
		this.soChoNgoi = soChoNgoi;
	}
	public void setKhuyenMai(boolean khuyenMai) {
		this.khuyenMai = khuyenMai;
	}
	@Override
	public double tinhThanhTien() {
	    double donGiaGoc;

	    if (this.soChoNgoi == 4) { 
	        donGiaGoc = 12000;
	    } else if (this.soChoNgoi == 7) {
	        donGiaGoc = 15000;
	    } else {
	        throw new IllegalArgumentException("Số chỗ ngồi phải là 4 hoặc 7");
	    }

	    double heSoKM = khuyenMai ? 0.8 : 1.0;

	    return this.km * donGiaGoc * heSoKM;
	}

	@Override
	public String toString() {
		return super.toString() +
				String.format("|Cho Ngoi: %s | Khuyen Mai: %s ",
						this.soChoNgoi, this.khuyenMai ? "Co" : "Khong"); 
	} 
	
	
	
	
	
	



}
