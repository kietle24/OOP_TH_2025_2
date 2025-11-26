package TravelOOP_246469981_leanhkiet;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class TourTrongNuoc extends Tour {
	private double huongDanVientip ;

	public TourTrongNuoc(String maChuyenDi, String tenTour, LocalDate ngayKhoiHanh, LocalDate ngayKetThuc,
			double giaVeCoBan, double huongDanVientip) {
		super(maChuyenDi, tenTour, ngayKhoiHanh, ngayKetThuc, giaVeCoBan);
		this.huongDanVientip = huongDanVientip;
	}

	public double getHuongDanVientip() {
		return huongDanVientip;
	}

	public void setHuongDanVientip(double huongDanVientip) {
		this.huongDanVientip = huongDanVientip;
	}

	@Override
	public String toString() {
		DecimalFormat d = new DecimalFormat("#,###" +"VND") ; 
		return super.toString() +  String.format("Tip HDV :  %s", d.format(huongDanVientip)); 
	}

	@Override
	public double tinhThanhTien() {
		double thanhTien = this.giaVeCoBan +(this.huongDanVientip * this.soNgayDi()) ; 
		LocalDate today = LocalDate.now() ; 
		if(ngayKhoiHanh.isBefore(today)&& ngayKhoiHanh.minusDays(5).isBefore(today)) {  
			thanhTien = thanhTien *0.9  ; 
		}
		
		return thanhTien;
	} 
	
	
	
	

}
