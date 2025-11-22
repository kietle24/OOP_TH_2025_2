package gk;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class KhoaHoc {
	private final String MaKhoaHoc;  
	private String tenKhoaHoc ;
	private LocalDate ngayBatDau ; 
	private TrinhDo trinhDo ; 
	private LocalDate ngayKetThuc ; 
	private int soHocVien;
	private double hocPhi ; 
	public KhoaHoc(
			String maKhoaHoc, String tenKhoaHoc, LocalDate ngayBatDau, LocalDate ngayKetThuc,
			TrinhDo trinhDo ,int soHocVien,double hocPhi ) {
		MaKhoaHoc = maKhoaHoc;
		if(maKhoaHoc == null || maKhoaHoc.trim().isEmpty()) {
			throw new IllegalArgumentException("ma khoa hoc khong hop le "); 
		}
		if(tenKhoaHoc == null || tenKhoaHoc.trim().isEmpty()) {
			throw new IllegalArgumentException("ten Khoa Hoc khong hop le "); 
		}
		  if (soHocVien < 0) {
		        throw new IllegalArgumentException("so hoc vien khong hop le" );
		    }
		
		
		this.tenKhoaHoc = tenKhoaHoc;
		this.ngayBatDau = ngayBatDau;
		this.ngayKetThuc = ngayKetThuc;
		this.soHocVien = soHocVien;
		this.hocPhi = hocPhi ;
		this.trinhDo =  trinhDo  ;
	}
	public String getMaKhoaHoc() {
		return MaKhoaHoc;
	}
	public String getTenKhoaHoc() {
		return tenKhoaHoc;
	}
	public LocalDate getNgayBatDau() {
		return ngayBatDau;
	}
	public LocalDate getNgayKetThuc() {
		return ngayKetThuc;
	}
	public int getSoHocVien() {
		return soHocVien;
	}
	public void setTenKhoaHoc(String tenKhoaHoc) {
		if(tenKhoaHoc == null || tenKhoaHoc.trim().isEmpty()) {
			throw new IllegalArgumentException("ten Khoa Hoc khong hop le "); 
		}
		this.tenKhoaHoc = tenKhoaHoc.trim();
	}
	public void setNgayBatDau(LocalDate ngayBatDau) {
				
		this.ngayBatDau = ngayBatDau;
	}
	public void setNgayKetThuc(LocalDate ngayKetThuc) {
		this.ngayKetThuc = ngayKetThuc;
	}
	public void setSoHocVien(int soHocVien) {
		this.soHocVien = soHocVien;
	}
	
	public double tinhHocPhi() { 
		  double hocPhi = 0;
		    if(this.soHocVien < 20) {
		        hocPhi = 500000;  // Học phí cho mỗi học viên
		    } else if (this.soHocVien >= 20 && this.trinhDo == TrinhDo.NangCao) { 
		        hocPhi = 300000; 
		    } else if (this.soHocVien >= 20 && this.trinhDo == TrinhDo.CoBan) { 
		        hocPhi = 300000 * 0.7;  // Giảm 30% học phí cho CoBan
		    }
		    return hocPhi * this.soHocVien;  // Nhân học phí với số học viên
	}
	@Override
	public String toString() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("vi","VN")); 
		DateTimeFormatter dtf  = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("%10s | %20s | %10s | %10s |  %10s | %10s | %s ", 
				this.MaKhoaHoc , 
				this.tenKhoaHoc ,
				dtf.format(this.ngayBatDau ),
				dtf.format(this.ngayKetThuc) ,
				this.trinhDo ,this.soHocVien , 
				nf.format(tinhHocPhi()));
		
	}
	
	
	

	
	
	

}
