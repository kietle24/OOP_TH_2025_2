package ck;

public class TuongSatThu extends Tuong {
private double satThuongCoBan ; 
private int soMangHaGuc ;
public TuongSatThu(
		String maTuong, String tenTuong, String phePhai, double satThuongCoBan, int soMangHaGuc) {
	super(maTuong, tenTuong, phePhai);
	
	if(soMangHaGuc <  0 ) { 
		throw new IllegalArgumentException("SO mang ha guc khong am ") ; 
	}
	this.satThuongCoBan = satThuongCoBan;
	setSoMangHaGuc(soMangHaGuc); 
}
public double getSatThuongCoBan() {
	return satThuongCoBan;
}
public int getSoMangHaGuc() {
	return soMangHaGuc;
}
public void setSatThuongCoBan(double satThuongCoBan) {
	this.satThuongCoBan = satThuongCoBan;
}
public void setSoMangHaGuc(int soMangHaGuc) {
	this.soMangHaGuc = soMangHaGuc;
}
@Override
public double lucChien() {
		double lucChien = (this.satThuongCoBan*1.5) + (this.soMangHaGuc*200) ; 
		if(this.soMangHaGuc >= 10) { 
			lucChien = lucChien*1.15 ; 
		}
	return lucChien;
} 
@Override
public String toString() {
	return super.toString() + 
			
			String.format("|sat thuong co ban : %15s | so mang ha guc  %10s " ,this.satThuongCoBan , this.soMangHaGuc ); 
}


}
