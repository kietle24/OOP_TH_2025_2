package gk;

public class KhoaHocThucHanh extends KhoaHoc{
	private String tenPhongTH ;
	private int soMayTinh ;
	public KhoaHocThucHanh(
			String maKhoaHoc, String tenKhoaHoc, 
			int soBuoi, String tenPhongTH, int soMayTinh) {
		super(maKhoaHoc, tenKhoaHoc, soBuoi);
		if (tenPhongTH == null || tenPhongTH.trim().isEmpty()) {
            throw new IllegalArgumentException("Lỗi: Tên phòng thực hành không được để trống.");
        }

        // Validate Số Máy Tính
        if (soMayTinh <= 0) {
            throw new IllegalArgumentException("Lỗi: Số máy tính phải lớn hơn 0.");
        }
		setTenPhongTH(tenPhongTH); 
		setSoMayTinh(soMayTinh); 
	}
	
	
	public String getTenPhongTH() {
		return tenPhongTH;
	}


	public void setTenPhongTH(String tenPhongTH) {

		this.tenPhongTH = tenPhongTH.trim();
	}


	public int getSoMayTinh() {
		return soMayTinh;
	}


	public void setSoMayTinh(int soMayTinh) {
		this.soMayTinh = soMayTinh;
	}


	@Override
	public double getHocPhi() {
		return this.soBuoi * HOC_PHI_MOI_BUOI.getGiaTri() * 0.8 ;
		
	} 

	@Override
	public String toString() {
		return super.toString() + String.format("| Ten Phong TH: %s     | So May Tinh : %3s", 
				this.tenPhongTH , this .soMayTinh ); 
	} 
	
	

}
