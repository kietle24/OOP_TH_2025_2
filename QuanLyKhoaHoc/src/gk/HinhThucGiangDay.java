package gk;

public enum HinhThucGiangDay {
	TRUC_TUYEN("Trực Tuyến"), 
	TAI_LOP("Tại Lớp")  ; 
	private final String moTa ;

	 HinhThucGiangDay(String moTa) {
		this.moTa = moTa;
	}

	 public String getMoTa() {
		return moTa;
	} 
	 
	 @Override
	 public String toString () { 
		  return moTa;  
	 }
	 
	 
	 
	 
	
	

}
