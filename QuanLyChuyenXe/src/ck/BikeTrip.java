package ck;

public class BikeTrip extends Trip  {
	private LoaiXe loaiXe ;

	public BikeTrip(String maChuyenXe, String tenTaiXe, String bienSoXe, int km, LoaiXe loaiXe) {
		super(maChuyenXe, tenTaiXe, bienSoXe, km);
		this.loaiXe = loaiXe;
	}

	public LoaiXe getLoaiXe() {
		return loaiXe;
	}

	public void setLoaiXe(LoaiXe loaiXe) {
		this.loaiXe = loaiXe;
	}
	@Override
	public double tinhThanhTien() {
	    double thanhTien = 0; 
	    double donGia = 5500;
	    if (loaiXe == LoaiXe.XE_GA) { 
	        thanhTien = this.km * donGia + 2000 ;  // Phụ phí cho xe ga
	    } else if (loaiXe == LoaiXe.XANG_SO) { 
	        thanhTien = this.km * donGia; // Không có phụ phí cho xe số
	    }
	    return thanhTien; 
	}

	@Override
	public String toString() {
	return super.toString() + String.format("|Loai Xe:%s ", this.loaiXe.getMoTa());
	} 
	
	
	
	

	

}
