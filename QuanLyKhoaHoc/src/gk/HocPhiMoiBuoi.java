package gk;

public enum HocPhiMoiBuoi {
	MUC_CO_BAN(30000) ; 
	private final double giaTri ;
		
	 HocPhiMoiBuoi(double giaTri) {
		this.giaTri = giaTri;
	}
	public double getGiaTri() {
		return giaTri;
	} 
	
	

}
