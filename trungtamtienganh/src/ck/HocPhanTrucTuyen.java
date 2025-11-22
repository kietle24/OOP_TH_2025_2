package ck;

import java.time.LocalDate;

public class HocPhanTrucTuyen extends HocPhan{
	private String linkHoc ;

	public HocPhanTrucTuyen(
			String maHocVien, String hoTen,
			double hocPhiKhoaHoc,
			LocalDate ngayBatDau,
			LocalDate ngayKetThuc,
			double diemMucTieu, 
			double diemKetQua, 
			HinhThucHoc hinhThuc,
			String linkHoc) {
		super(maHocVien, 
				hoTen, 
				hocPhiKhoaHoc, 
				ngayBatDau,
				ngayKetThuc, diemMucTieu,
				diemKetQua,
				hinhThuc);
		this.linkHoc = linkHoc;
	}

	@Override
	public double tinhTienKhenThuong() {
		double tienThuong  =0 ; 
		if(this.diemKetQua >= this.diemMucTieu) { 
			tienThuong = this.hocPhiKhoaHoc * 0.2  ; 
		}
		
		 if(this.diemKetQua > this.diemMucTieu) { 
			 int diemVuot = (int)(this.diemKetQua - this.diemMucTieu) ; 
			 tienThuong += (diemVuot/ 100 )*(this.hocPhiKhoaHoc * 0.1 ) ; 
			 			 
		}
		
		return tienThuong;
	}
	@Override
	public String toString() {
		return super.toString() + "| Tien Thuong : %s" + tinhTienKhenThuong() ; 
	} 
	
	

}
