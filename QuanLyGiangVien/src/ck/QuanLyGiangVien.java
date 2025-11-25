package ck;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class QuanLyGiangVien {
	 

	    List<GiangVien> dsgv;

	    public QuanLyGiangVien() {
	        dsgv = new ArrayList<>();
	    }
	

	public void setDsgv(List<GiangVien> dsgv) {
		this.dsgv = dsgv;
	} 
	public String inTieuDe() { 
		return String.format("%10s | %15s | %30s |  %15s" , "MA GV" , "Ho Va Ten" , " EMAIL" , "Thuc Linh"); 
		
	}
	public void inDanhSach() { 
		 if(dsgv.isEmpty()) { 
			  throw new IllegalArgumentException("Danh Sach Rong "); 
		 }
		 System.out.println(inTieuDe ());
		 for(GiangVien d : dsgv) { 
			System.out.println(d);
		 }
	}
	public boolean themGiangVien(GiangVien gv ) { 
		 for(GiangVien nv : dsgv ) { 
			 
			 if(nv.getMaGV().equalsIgnoreCase(gv.getMaGV())) { 
					throw new IllegalArgumentException("trung ma so" + nv.getMaGV()) ; 
			 }
		 }
		 dsgv.add(gv) ; 
		 return true; 
		 
	}
	public boolean xoaGiangVien(String ma ) {
		Iterator <GiangVien> i = dsgv.iterator() ; 
		while(i.hasNext()) {
			 if(i.next().getMaGV().equals(ma)) { 
				 i.remove();  
				 return true  ; 
			 }
		}
	return false; 
	}
	
	
	public Map<String , Double > thongKeThuNhap() { 
		return dsgv.stream().collect(Collectors.groupingBy(k->k.getClass().getSimpleName()
				,Collectors.averagingDouble(k->k.linhLuong())) ); 
				
			
	}
	public List<GiangVien> layGiangVienDayIt(int n ) { 
		return dsgv.stream()
				.filter(k -> k instanceof GiangVienThinhGiang)
				.map(k -> (GiangVienThinhGiang) k )
				.filter(k->k.getSoTietDay()  <  n )
				.collect(Collectors.toList()) ; 
				
		
	}
	
	public List<GiangVien> getDanhSachGVThuNhapCao()  { 
		double max = dsgv.stream()
				.mapToDouble(gv -> gv.linhLuong())
				.max().orElse(0) ;
		
		return dsgv.stream().filter(gv -> gv.linhLuong() == max ).collect(Collectors.toList()) ;
	}
	
//	public void capNhatHeSoThamNienMoi(String maGV , double heSoMoi) { 
//		if(heSoMoi < 1 || heSoMoi > 5 )  { 
//			 throw new IllegalArgumentException("He so tham nien trong  (1.0 -> 5.0 )") ;
//			 
//		}
//		for(GiangVien gv :dsgv ) { 
//			  if(gv instanceof GiangVienCoHuu && gv.getMaGV().equalsIgnoreCase(maGV)) { 
//				  ((GiangVienCoHuu) gv).setHeSoThamThien(heSoMoi); 
//				  return ; 
//			  }
//		}
//		throw new IllegalArgumentException("khong tim thay ma giang vien " + maGV) ; 
//	}
//	
	
public void capNhatHeSoThamNienMoi(String maGV , double heSoMoi) {
	if(heSoMoi < 1  || heSoMoi >5 ) { 
		throw new IllegalArgumentException("he so tham nien 1-> 5"); 
	}
	for(GiangVien gv : dsgv) { 
		if(gv instanceof GiangVienCoHuu && gv.getMaGV().equalsIgnoreCase(maGV)) {
			((GiangVienCoHuu) gv).setHeSoThamThien(heSoMoi);
			return ; 
		}
	}
	throw new IllegalArgumentException("loi " + maGV) ; 
}
	

	
	
	
}
