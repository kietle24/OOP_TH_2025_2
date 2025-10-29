package quanly;

public abstract class NhanVien {
	protected final String maSoNV ; 
	protected String hoTen  ; 
	protected String dienThoai; 
	protected double luongCanBan = 1800000 ; 
	   public NhanVien(String maSoNV, String hoTen, String dienThoai) {
	        this(maSoNV, hoTen, dienThoai, 1800000);
	    }
	public NhanVien(String maSoNV, String hoTen, String dienThoai, double luongCanBan) {
		if(maSoNV == null || maSoNV.trim().isEmpty())  { 
			throw new IllegalArgumentException(" ma so khong duoc rong ") ;
		}
		this.maSoNV = maSoNV.trim();
		setHoTen(hoTen) ;
		setDienThoai(dienThoai); 
		setLuongCanBan(luongCanBan) ; 
	}	
	public String getHoTen() {
		return hoTen;
	}


	public void setHoTen(String hoTen) {
		if(hoTen == null || hoTen.trim().isEmpty()) {  
			throw new IllegalArgumentException("ho ten khong duoc rong ") ;
		}
		this.hoTen = hoTen.trim();
	}

	public String getDienThoai() {
		return dienThoai;
	}
	public void setDienThoai(String dienThoai) {
		if(dienThoai == null || !dienThoai.matches("\\d{9,10}")) { 
			 throw new IllegalArgumentException("so dien thoai it nhat 9 so ") ; 
		}
		this.dienThoai = dienThoai.trim() ; 
	}
	public double getLuongCanBan() {
		return luongCanBan;
	}
	public void setLuongCanBan(double luongCanBan) {
		if(luongCanBan <  0 )  { 
			throw new IllegalArgumentException("luong can ban khong duoc < 0  ") ; 
		}
		   
		this.luongCanBan = luongCanBan;
	}
	public String getMaSoNV() {
		return maSoNV;
	}
	public abstract double tinhLuong() ; 

	@Override
	public String toString() {
		return String.format("%-8s | %-15s | %-12s | %-15s", this.maSoNV, this.hoTen
				, this.dienThoai , this.luongCanBan) ; 
		
	}
	
	
	
}
