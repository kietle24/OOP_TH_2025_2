package ck;

public enum LoaiBaoQuan {
	KHO_LANH("Kho Lạnh"), 
	KHO_THUONG("Kho Thường");
	private final String moTa ;

	 LoaiBaoQuan(String moTa) {
		this.moTa = moTa;
	}

	 public String getMoTa() {
		return moTa;
	} 
	 

	
}
