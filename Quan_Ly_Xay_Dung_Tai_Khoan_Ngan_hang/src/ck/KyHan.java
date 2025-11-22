package ck;

public enum KyHan {
	NGAN_HAN("Ngắn Hạn"), 
	DAI_HAN("Dài Hạn") ; 
	private final String moTa ;
	KyHan(String moTa) {
			this.moTa = moTa;
		} 
	public String getMoTa() {
		return moTa;
	}
	


	

}
