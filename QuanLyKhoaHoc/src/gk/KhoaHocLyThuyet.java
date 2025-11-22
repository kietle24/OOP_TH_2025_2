package gk;

public class KhoaHocLyThuyet extends KhoaHoc{
	private HinhThucGiangDay hinhThuc ; 
	private boolean suDungTaiLieuThamKhao;
	public KhoaHocLyThuyet(
			String maKhoaHoc,
			String tenKhoaHoc, int soBuoi, HinhThucGiangDay hinhThuc,
			boolean suDungTaiLieuThamKhao) {
		super(maKhoaHoc, tenKhoaHoc, soBuoi);
		this.hinhThuc = hinhThuc;
		this.suDungTaiLieuThamKhao = suDungTaiLieuThamKhao;
	}
	
	public HinhThucGiangDay getHinhThuc() {
		return hinhThuc;
	}

	public void setHinhThuc(HinhThucGiangDay hinhThuc) {
		this.hinhThuc = hinhThuc;
	}

	public boolean isSuDungTaiLieuThamKhao() {
		return suDungTaiLieuThamKhao;
	}

	public void setSuDungTaiLieuThamKhao(boolean suDungTaiLieuThamKhao) {
		this.suDungTaiLieuThamKhao = suDungTaiLieuThamKhao;
	}

	@Override
	public double getHocPhi() {
		
		return soBuoi* HOC_PHI_MOI_BUOI.getGiaTri() ; 
	}
	@Override
	public String toString() {
		return super.toString() + String.format("| Hinh Thuc : %10s | Tai Lieu : %10s", 
				this.hinhThuc , this .suDungTaiLieuThamKhao ? "Co" : "Khong"); 
	} 
	

	

}
