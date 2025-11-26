package ck;

public class TuongDoDon extends Tuong  {
	private int mauCoBan ; 
	private int chiSoGiap ;
	public TuongDoDon(String maTuong, String tenTuong, String phePhai, int mauCoBan, int chiSoGiap) {
		super(maTuong, tenTuong, phePhai);
		
		if(chiSoGiap < 50 || chiSoGiap > 300) {
	        throw new IllegalArgumentException("Chi so giap phai tu 50 den 300!"); 
	    }
		this.mauCoBan = mauCoBan;
		setChiSoGiap(chiSoGiap); 

	}
	public int getMauCoBan() {
		return mauCoBan;
	}
	public int getChiSoGiap() {
		return chiSoGiap;
	}
	public void setMauCoBan(int mauCoBan) {
		this.mauCoBan = mauCoBan;
	}
	public void setChiSoGiap(int chiSoGiap) {
		this.chiSoGiap = chiSoGiap;
	} 
	@Override
	public String toString() {
		return  super.toString() + String.format("|%15s |  %10s " ,this.mauCoBan , this.chiSoGiap ); 
	}
	
	@Override
	public double lucChien() {
			double lucChien = (this.mauCoBan*0.5) + (this.chiSoGiap*5) ; 
		return lucChien;
	} 


}
