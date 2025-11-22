package ck;

public enum LaiSuatCoBan {
	LAI_SUAT_CO_BAN(0.045) ; 
	private final double  tyLe ; 
	
	LaiSuatCoBan(double tyLe) { 
		this.tyLe = tyLe ; 
		
	}

	public double getTyLe() {
		return tyLe;
	}
	
	

}
