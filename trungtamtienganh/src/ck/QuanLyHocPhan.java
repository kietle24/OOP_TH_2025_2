package ck;
import java.time.LocalDate;
import java.util.*;
public class QuanLyHocPhan {
	private Set<HocPhan > dshp   ;
	
	public QuanLyHocPhan() {
		dshp = new HashSet<HocPhan>();
	} 

	public String inTieuDe() { 
		return String.format("%10 | %20 | %10s | %15s | %15s | %s | %s ", "Ma HP" , "Ho Ten " 
				,"Hoc Phi KH" , "Ngay BD" , "Ngay KT", "Diem MT" , "Diem KQ");
		 
	}
	public void inDanhSach() { 
		if(dshp.isEmpty()) {  
			System.out.println("Danh Sach Hoc Phan rong : ");
			return ; 
		}
		System.out.println("Danh Sach Ban Dau ") ; 
		System.out.println(inTieuDe()) ;
		for(HocPhan hp : dshp ) { 
			 System.out.println(hp);
		}
		
		  
	}
	
	public HocPhan timKiemHocPhan(String maHocVien) { 
		 for(HocPhan hp : dshp ) { 
			 if(hp.getMaHocVien().equalsIgnoreCase(maHocVien)); 
			 return hp   ; 
		 }
		 return null ; 
	}
	public boolean themHocPhan(HocPhan maHocPhanMoi) { 
		 if(maHocPhanMoi == null ) {
			 return false ;
		 }
		 if(timKiemHocPhan(maHocPhanMoi.getMaHocVien()) != null ) { 
			 System.out.println("Hoc Phan bi trung ");
			 
			 
		 }
		 dshp.add(maHocPhanMoi) ; 
		 System.out.println("Them Thanh Cong  ");
		 return true  ;
	}
	
	// cap nhat gia tri tien thuong
	public double tinhTienThuong(int thang , int nam ) {  
		double tinhTienThuong = 0.0 ; 
		for(HocPhan hp: dshp) { 
			LocalDate ngayBatDau = hp.ngayKetThuc ; 
			if(ngayBatDau.getMonthValue() == thang && ngayBatDau.getDayOfYear() == nam ) { 
				tinhTienThuong += tinhTienThuong; 
			}
			 
		}
		return tinhTienThuong ; 
	}
	public boolean xoaHocPhan(String mshp) { 
		HocPhan hpCanXoa  = timKiemHocPhan(mshp); 
		if(hpCanXoa != null ) { 
			return dshp.remove(hpCanXoa) ; 
		}
		return false  ; 
	}
	
	
}
