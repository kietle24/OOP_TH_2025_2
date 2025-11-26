package TravelOOP_246469981_leanhkiet;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public abstract  class Tour {
	protected final String maChuyenDi   ; 
	protected String tenTour ; 
	protected LocalDate ngayKhoiHanh ; 
	protected LocalDate ngayKetThuc; 
	protected double giaVeCoBan;
	
	
	
	public Tour(String maChuyenDi, String tenTour, LocalDate ngayKhoiHanh, LocalDate ngayKetThuc, double giaVeCoBan) {
		
		if(maChuyenDi == null || maChuyenDi.trim().isEmpty()) {
			 throw new IllegalArgumentException("maChuyenDi khong hop le ");
		}
		if(tenTour == null || tenTour.trim().isEmpty()) {
			throw new IllegalArgumentException("tenTour khong hop le ");
		}
		if(ngayKetThuc.isBefore(ngayKhoiHanh)) {
			throw new IllegalArgumentException("ngay ket thuc khong hop le ") ; 
		}
		if(giaVeCoBan < 0 ) { 
			throw new IllegalArgumentException("giaVeCoBan khong hop le ") ;
		}
		
		
		
		this.maChuyenDi = maChuyenDi;
	
		setTenTour(tenTour); 
		setNgayKhoiHanh(ngayKhoiHanh) ; 
		setNgayKetThuc(ngayKetThuc) ;
		setGiaVeCoBan(giaVeCoBan) ; 
	}



	public String getMaChuyenDi() {
		return maChuyenDi;
	}



	public String getTenTour() {
		return tenTour;
	}



	public LocalDate getNgayKhoiHanh() {
		return ngayKhoiHanh;
	}



	public LocalDate getNgayKetThuc() {
		return ngayKetThuc;
	}



	public double getGiaVeCoBan() {
		return giaVeCoBan;
	}



	public void setTenTour(String tenTour) {
		this.tenTour = tenTour;
	}



	public void setNgayKhoiHanh(LocalDate ngayKhoiHanh) {
		this.ngayKhoiHanh = ngayKhoiHanh;
	}



	public void setNgayKetThuc(LocalDate ngayKetThuc) {
		this.ngayKetThuc = ngayKetThuc;
	}



	public void setGiaVeCoBan(double giaVeCoBan) {
		this.giaVeCoBan = giaVeCoBan;
	} 
	
	public long soNgayDi() {  
		return ChronoUnit.DAYS.between(ngayKhoiHanh, ngayKetThuc);
	}
	public abstract double tinhThanhTien() ;



	@Override
	public String toString() {
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyy");
		DecimalFormat d = new DecimalFormat("#,###" +"VND") ; 
		return String.format("|%10s | %15s | %20s | %15s | %12s | %12s      |" , 
				this.maChuyenDi , 
				this.tenTour , df.format(ngayKhoiHanh), 
				df.format(ngayKetThuc) ,
				this.soNgayDi() , this.tinhThanhTien()) ; 
	} 
	
	
	public String inTieuDe() {  
		return String.format("|%10s | %15s | %20s | %15s | %12s | %20s |" , "Ma CD" , 
				"Ten tour" , "Ngay KH " , "Ngay KT" , "So ngay di " , " Tinh Thanh Tien ") ;  
	}
	
	
	
	
	
	
	


}
