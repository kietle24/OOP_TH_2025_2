package ck;

public abstract class Tuong {
protected final String maTuong  ; 
protected String tenTuong; 
protected String phePhai;
public Tuong(String maTuong, String tenTuong, String phePhai) {
if(maTuong  == null || maTuong.trim().isEmpty()) {
	 throw new IllegalArgumentException("ma tuong khong hop le ") ; 
}
if(tenTuong  == null || tenTuong.trim().isEmpty()) {
	throw new IllegalArgumentException("ten Tuong khong hop le ") ; 
}
	this.maTuong = maTuong;
	setTenTuong(tenTuong) ; 
	setPhePhai(phePhai) ; 
}
public String getMaTuong() {
	return maTuong;
}
public String getTenTuong() {
	return tenTuong;
}
public String getPhePhai() {
	return phePhai;
}
public void setTenTuong(String tenTuong) {
	this.tenTuong = tenTuong;
}
public void setPhePhai(String phePhai) {
	this.phePhai = phePhai;
}
public abstract double lucChien() ; 
@Override
public String toString() {
	return String.format("|%15s |  %15s | %15s | %12s", this.maTuong , this.tenTuong , this.phePhai , this.lucChien()); 
} 




	

}
