package ck;

public enum DonGiaMoiTiet {
	DON_GIA_MOI_TIET(2000000) ; 
	
	private double giaTri;

	private DonGiaMoiTiet(double giaTri) {
		this.giaTri = giaTri;
	}

	public double getGiaTri() {
		return giaTri;
	}

	public void setGiaTri(double giaTri) {
		this.giaTri = giaTri;
	} 
	
	
	

	

}
