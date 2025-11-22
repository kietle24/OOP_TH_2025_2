package ck;

import java.time.LocalDate;

public class HocPhanTrucTiep extends HocPhan {
	private String diaChiHocPhan ; 
	private LocalDate ngayGioHocPhan ;
	public HocPhanTrucTiep(
			String maHocVien,
			String hoTen,
			double hocPhiKhoaHoc,
			LocalDate ngayBatDau,
			LocalDate ngayKetThuc,
			double diemMucTieu, 
			double diemKetQua, 
			HinhThucHoc hinhThuc, 
			String diaChiHocPhan,
			LocalDate ngayGioHocPhan) {
		super(maHocVien, hoTen, hocPhiKhoaHoc, ngayBatDau, ngayKetThuc, diemMucTieu, diemKetQua, hinhThuc);
		this.diaChiHocPhan = diaChiHocPhan;
		this.ngayGioHocPhan = ngayGioHocPhan;
	}
	@Override
	public double tinhTienKhenThuong() {
		double tienThuong  =0 ; 
		if(this.diemKetQua >= this.diemMucTieu) { 
			tienThuong = this.hocPhiKhoaHoc * 0.2  ; 
		}
		return tienThuong;
	}
	@Override
	public String toString() {
		return super.toString() + "| Tien Thuong : %s" + tinhTienKhenThuong() ; 
	} 
	

}
