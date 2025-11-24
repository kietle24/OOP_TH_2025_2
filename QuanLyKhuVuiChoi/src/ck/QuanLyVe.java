package ck;
import java.util.*;
import java.util.stream.Collectors;
public class QuanLyVe {
	private List<Ve> dsve  ;

	public QuanLyVe() {
		dsve = new ArrayList<Ve>() ; 
	}
	
	public String inTieuDe()  { 
		return String.format("|%10s | %15s | %10s | %12s", "Ma Ve" , "Ten KH ", "So nguoi " , "Doanh Thu " ) ; 
	}
	public void inDanhSach() { 
		 if(dsve.isEmpty()) {
			  System.out.println("Tai Khoang Rong  "); return ; 
		 }
		 System.out.println(inTieuDe());
		 for(Ve ds : dsve) {
			 System.out.println(ds) ;
		 }

	}
	public boolean addVe(Ve newTK ) { 
		for(Ve k : dsve ) { 
			if(k.getMaVe().equalsIgnoreCase(newTK.maVe)){ 
				throw new IllegalArgumentException("trung ma VE " + newTK.getMaVe());  
				
			}
		}
		dsve.add(newTK) ; 
		return true;  
	 
	}
	
	public boolean xoaVe(String newTK ) {
		 Iterator<Ve> tk  = dsve.iterator() ; 
		 while(tk.hasNext()) { 
			 if(tk.next().getMaVe().equalsIgnoreCase(newTK)) { 
				
				  tk.remove();  
				  return true; 
				  
			 }
		 }

		 return false ;  	 
	}
	
	// Tìm kiếm và trả về danh sách các Vé sự kiện có doanh thu lớn hơn x (giá trị x được truyền vào).
	public List<VeSuKien> layVe(int n ) { 
			return dsve.stream()
					.filter(tk ->tk instanceof VeSuKien)
					.map(tk->(VeSuKien) tk )
					.filter(tk->tk.tinhDoanhThu() > n )
					.collect(Collectors.toList()); 
	
	}

	public void sapTheoLoaiVeTrungGiamDanTheoDoanhThu() {  
		dsve.sort((tk1, tk2 )-> { 
			String loai1 = tk1.getClass().getSimpleName() ;  
			String loai2 = tk2.getClass().getSimpleName() ; 
			 int soSanhLoai = loai1.compareTo(loai2);
			 
			if(soSanhLoai == 0 ) { 
				double d1 = tk1.tinhDoanhThu() ; 
				double d2 = tk2.tinhDoanhThu() ; 
				return Double.compare(d2, d1) ; 
				
			}
			return soSanhLoai ;
		}); 
	
		
}
	public Map<String, Long> thongKeTheoLoaiVe() {
		return dsve.stream()
				.collect(Collectors.groupingBy(tk->tk.getClass().getSimpleName(),
						Collectors.counting()));
	}
	
	

}
















