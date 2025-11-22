package gk;

import java.text.NumberFormat;
import java.util.Locale;



public abstract class KhoaHoc {
	protected final String  maKhoaHoc  ; 
	protected String tenKhoaHoc ; 
	protected int soBuoi ; 
	protected static final HocPhiMoiBuoi HOC_PHI_MOI_BUOI = HocPhiMoiBuoi.MUC_CO_BAN ;
	public KhoaHoc(String maKhoaHoc, String tenKhoaHoc, int soBuoi) {
			
		if(maKhoaHoc== null || maKhoaHoc.trim().isEmpty()) {
			 throw new IllegalArgumentException("ma khoa hoc khong hop le ") ; 
		}
		if (tenKhoaHoc == null || tenKhoaHoc.trim().isEmpty()) {
            throw new IllegalArgumentException("Lỗi: Tên khóa học không được để trống.");
        }
		if(soBuoi <= 0 ) { 
			throw new IllegalArgumentException("so buoi khong hop le ") ; 
		
		}
		
		this.maKhoaHoc = maKhoaHoc;
		setTenKhoaHoc(tenKhoaHoc) ; 
		setSoBuoi(soBuoi); 
}
	public String getTenKhoaHoc() {
		return tenKhoaHoc;
	}
	public void setTenKhoaHoc(String tenKhoaHoc) {
	
		this.tenKhoaHoc = tenKhoaHoc;
	}
	public int getSoBuoi() {
		return soBuoi;
	}
	public void setSoBuoi(int soBuoi) {
		
		this.soBuoi = soBuoi;
	}
	public String getMaKhoaHoc() {
		return maKhoaHoc;
	}
	public static HocPhiMoiBuoi getHocPhiMoiBuoi() {
		return HOC_PHI_MOI_BUOI;
	}
	
	public abstract double getHocPhi() ;

	@Override
	public String toString() {
		NumberFormat nf  = NumberFormat.getCurrencyInstance(new Locale("vi", "VN")); 
		return String.format("%-10s | %-20s | %10s | %10s" ,this.maKhoaHoc , 
				this.tenKhoaHoc , this.soBuoi , nf.format(getHocPhi()));
	} 
	
	
	
}	
	
