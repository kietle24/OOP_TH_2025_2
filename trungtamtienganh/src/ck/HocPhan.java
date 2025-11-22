package ck;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public abstract class HocPhan {
	protected final String maHocVien ; 
	protected String hoTen ; 
	protected double hocPhiKhoaHoc ; 
	protected HinhThucHoc hinhThuc ; 
	protected LocalDate ngayBatDau ; 
	protected LocalDate ngayKetThuc ; 
	protected double diemMucTieu ; 
	protected double diemKetQua;
	public HocPhan() {
		this.maHocVien = null  ; 
		this.hoTen = null   ;  
		this.hocPhiKhoaHoc = 0.0  ; 
		this.ngayBatDau = null;
		this.ngayKetThuc =null ;
		this.diemMucTieu = 0.0  ;
		this.diemKetQua = 0.0 ; 

	}

	public HocPhan(
			String maHocVien, 
			String hoTen,
			double hocPhiKhoaHoc,
			LocalDate ngayBatDau,
			LocalDate ngayKetThuc,
			double diemMucTieu, 
			double diemKetQua, 
			HinhThucHoc hinhThuc
			) {
		
		if(maHocVien == null || maHocVien.trim().isEmpty()) {
			 throw new IllegalArgumentException("ma hoc vien khong hop le ");
		}
		this.maHocVien = maHocVien;
		this.hoTen = hoTen;
		this.hocPhiKhoaHoc = hocPhiKhoaHoc;
		this.ngayBatDau = ngayBatDau;
		this.ngayKetThuc = ngayKetThuc;
		this.diemMucTieu = diemMucTieu;
		this.diemKetQua = diemKetQua;
		this.hinhThuc = hinhThuc; 
	}

	public String getMaHocVien() {
		return maHocVien;
	}

	public String getHoTen() {
		return hoTen;
	}

	public double getHocPhiKhoaHoc() {
		return hocPhiKhoaHoc;
	}

	public LocalDate getNgayBatDau() {
		return ngayBatDau;
	}

	public LocalDate getNgayKetThuc() {
		return ngayKetThuc;
	}

	public double getDiemMucTieu() {
		return diemMucTieu;
	}

	public double getDiemKetQua() {
		return diemKetQua;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public void setHocPhiKhoaHoc(double hocPhiKhoaHoc) {
		this.hocPhiKhoaHoc = hocPhiKhoaHoc;
	}

	public void setNgayBatDau(LocalDate ngayBatDau) {
		this.ngayBatDau = ngayBatDau;
	}

	public void setNgayKetThuc(LocalDate ngayKetThuc) {
		if(ngayKetThuc.isBefore(ngayBatDau)) { 
			throw new IllegalArgumentException("Ngay ket thuc khong hop le "); 
		}
		this.ngayKetThuc = ngayKetThuc;
	}

	public void setDiemMucTieu(double diemMucTieu) {
		if(this.diemMucTieu < 0  || this.diemMucTieu > 990 ) { 
			throw new IllegalArgumentException("diem muc tieu khong hop le ") ; 
		}
		this.diemMucTieu = 0.0  ; 
	}

	public void setDiemKetQua(double diemKetQua) {
		if(this.diemKetQua < 0  || this.diemKetQua > 990 ) { 
			throw new IllegalArgumentException("diem ket qua khong hop le ") ; 
		}
		this.diemKetQua = 0.0  ;
	}

	@Override
	public String toString() {
	NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("vi","VN")) ; 
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
	return String.format("%10 | %20 | %10s | %15s | %15s | %s | %s ",
			this.maHocVien , this.hoTen , 
			nf.format(this.hocPhiKhoaHoc ), 
			dtf.format(ngayBatDau)
			,dtf.format(this.ngayKetThuc)
			,this.diemMucTieu , this.diemMucTieu ); 
	} 	
	

	public  abstract double tinhTienKhenThuong() ;  
	
	
	
	


}
