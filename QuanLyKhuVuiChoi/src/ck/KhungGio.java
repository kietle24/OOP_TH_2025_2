package ck;

public enum KhungGio {
	KHUNG_GIO1("Sang"), 
	KHUNG_GIO2("Chieu"); 
	private String   moTa ;

	private KhungGio(String moTa) {
		this.moTa = moTa;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	} 
	
	






}
