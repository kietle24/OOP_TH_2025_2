package ck;

public class HangThucPham extends HangHoa {
	private LoaiBaoQuan loaiBaoQuan ; 
	private boolean coChuaChatBaoQuan ;
	public HangThucPham(String maHang, String tenHang, double donGia, LoaiBaoQuan loaiBaoQuan,
			boolean coChuaChatBaoQuan) {
		super(maHang, tenHang, donGia);
		this.loaiBaoQuan = loaiBaoQuan;
		this.coChuaChatBaoQuan = coChuaChatBaoQuan;
	}
	public LoaiBaoQuan getLoaiBaoQuan() {
		return loaiBaoQuan;
	}
	public boolean isCoChuaChatBaoQuan() {
		return coChuaChatBaoQuan;
	}
	public void setLoaiBaoQuan(LoaiBaoQuan loaiBaoQuan) {
		this.loaiBaoQuan = loaiBaoQuan;
	}
	public void setCoChuaChatBaoQuan(boolean coChuaChatBaoQuan) {
		this.coChuaChatBaoQuan = coChuaChatBaoQuan;
	}
	@Override
	public double tinhThueVat() {		
		return this.donGia*  THUE_SUAT_CO_BAN.getTyLe() *0.5 ;
	}
	@Override
	public String toString() {
		return super.toString() + 
				String.format("|Loai BQ: %10s  | Bao Quan :%10s" ,
						this.loaiBaoQuan.getMoTa(), this.coChuaChatBaoQuan ? "CO" : "Khong "); 
				} 
	
	
	
	
	

}
