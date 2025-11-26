package TravelOOP_246469981_leanhkiet;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class TourQuocTe  extends Tour{
private double phiVisa; 
private double phiThuBaoHiem ;
public TourQuocTe(
		
		String maChuyenDi, String tenTour, LocalDate ngayKhoiHanh, LocalDate ngayKetThuc, double giaVeCoBan,
		double phiVisa, double phuThuBaoHiem) {
	super(maChuyenDi, tenTour, ngayKhoiHanh, ngayKetThuc, giaVeCoBan);
	
	if(phuThuBaoHiem < 0 ) { 
		throw new IllegalArgumentException("phuThuBaoHiem khong hop le ") ;
	}
	if(phiVisa < 0 ) { 
		throw new IllegalArgumentException("phiVisa khong hop le ") ;
	}

	setPhiVisa(phiVisa); 

	setPhiThuBaoHiem(phuThuBaoHiem) ;
}
public double getPhiVisa() {
	return phiVisa;
}
public double getPhiThuBaoHiem() {
	return phiThuBaoHiem;
}
public void setPhiVisa(double phiVisa) {
	this.phiVisa = phiVisa;
}
public void setPhiThuBaoHiem(double phiThuBaoHiem) {
	this.phiThuBaoHiem = phiThuBaoHiem;
}
@Override
public double tinhThanhTien() {
	double thanhTien = this.getGiaVeCoBan() + this.phiVisa +(this.phiThuBaoHiem * this.soNgayDi()) ; 
	if(this.soNgayDi() >  7 ) {
		 thanhTien += 2000000; 
	}
	return thanhTien ; 
}
@Override
public String toString() {
	DecimalFormat d = new DecimalFormat("#,###" +"VND") ; 
	return super.toString() +  String.format(" Phi Visa :  %s| Phi Thu Bao Hiem : %s ", d.format(phiVisa), d.format(phiThuBaoHiem) ); 
}
public void capNhatNgayKhoiHanh(String maChuyenDi , LocalDate ngayMoi ) {  
	
	
	
	
}





}