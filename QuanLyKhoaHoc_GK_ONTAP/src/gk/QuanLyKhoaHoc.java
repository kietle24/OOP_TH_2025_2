package gk;
import java.util.*;
import java.util.Collections ;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.List;

public class QuanLyKhoaHoc {
	private List<KhoaHoc> dskh ;

	public QuanLyKhoaHoc() {
		dskh = new ArrayList<KhoaHoc>(5) ; 
	} 
	public void inDanhSach() { 
		 if(dskh.isEmpty()) { 
			 System.out.println("Danh Sach Khoa Hoc rong ");
			 return ; 
		 }
		 
		 System.out.println("Danh sach Khoa Hoc ") ; 
		 System.out.println(inTieuDe());
		 for(KhoaHoc ds : dskh) { 
			  System.out.println(ds);
			  
		 }
	}
	public String inTieuDe() { 
		 return String.format("%10s | %20s | %10s | %10s |  %10s | %10s | %s "
				 ,"Ma KH","Ten KH" , "Ngay BD" , "Ngay KT", 
				 "Trinh Do" , "So Hoc Vien" , "Hoc Phi"
				 ); 
	}

	
	public KhoaHoc timKiemTheoMaKhoaHoc(String maKhoaHoc) {
		for(KhoaHoc kh : dskh) { 
			 if(kh.getMaKhoaHoc().equalsIgnoreCase(maKhoaHoc)) {
				  return kh ; 
			 }
		}
		return null ; 		 
	}

	public boolean themKhoaHoc(KhoaHoc newKH ) {
		if(newKH == null) {
			return false ; 
		}
		if(timKiemTheoMaKhoaHoc(newKH.getMaKhoaHoc()) != null ){ 
			System.out.println("Ma Khoa Hoc Bi Trung " );
			
		}
		if(dskh.size() == dskh.size()) {
			 List<KhoaHoc> newList =new ArrayList<>(dskh.size()*2 );
			 newList.addAll(dskh); 
			 dskh = newList; 
			 
		}
		
		dskh.add(newKH) ; 
		return true; 		
	}
	
	public boolean xoaKhoaHocTheoMa(String maKhoaHoc) {
		KhoaHoc maKhoaHocCanXoa = timKiemTheoMaKhoaHoc(maKhoaHoc);
		if(maKhoaHocCanXoa != null) { 
			System.out.println("xoa thanh cong ");
			return  dskh.remove(maKhoaHocCanXoa);
			
		}
	
		return true ; 
				
	}
	public void sapXepGiamDanTheoHocPhi() {
	    dskh = dskh.stream()
	                .sorted((kh1, kh2) -> Double.compare(kh2.tinhHocPhi(), kh1.tinhHocPhi()))  // Sắp xếp theo học phí giảm dần
	                .collect(Collectors.toList());  // Thu thập kết quả vào lại danh sách
	}


 
}

	
	
	
	
	
	
	
	


