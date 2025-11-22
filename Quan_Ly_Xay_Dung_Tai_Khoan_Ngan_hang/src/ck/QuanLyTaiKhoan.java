package ck;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class QuanLyTaiKhoan {
	private List<TaiKhoan> dstk  ;

	public QuanLyTaiKhoan() {
		dstk =new ArrayList<>() ; 
	}
	
	public String inTieuDe()  { 
		return String.format("%10s | %15s | %15s | %15s |", "Ma TK" , "Ten TK ", "So Du" , "Tien lai" ) ; 
	}
	public void inDanhSach() { 
		 if(dstk.isEmpty()) {
			  System.out.println("tai khoan rong: "); return ; 
		 }
		 System.out.println(inTieuDe());
		 for(TaiKhoan ds : dstk) {
			 System.out.println(ds) ;
		 }

	}
	public boolean addTK(TaiKhoan newTK ) { 
		for(TaiKhoan k : dstk ) { 
			if(k.getMaTaiKhoan().equalsIgnoreCase(newTK.maTaiKhoan)){ 
				throw new IllegalArgumentException("trung ma tai khoang" + newTK.getMaTaiKhoan());  
				
			}
		}
		dstk.add(newTK) ; 
		return true;  
	 
	}
	
	public boolean xoaTk(String newTK ) {
		 Iterator<TaiKhoan> tk  = dstk.iterator() ; 
		 while(tk.hasNext()) { 
			 if(tk.next().getMaTaiKhoan().equalsIgnoreCase(newTK)) { 
				
				  tk.remove();  
				  return true; 
				  
			 }
		 }

		 return false ;  	 
	}
	
	// lay danh sach tai khoan co thanh toan co han muc giao dich lon hon so tien 
	public List<TaiKhoanThanhToan> layTK(int n ) { 
			return dstk.stream()
					.filter(tk ->tk instanceof TaiKhoanThanhToan)
					.map(tk->(TaiKhoanThanhToan) tk )
					.filter(tk->tk.getHanMuc()> n )
					.collect(Collectors.toList()); 
	
	}
	public Map<String, Long> thongKeTheoLoai() {
		return dstk.stream()
				.collect(Collectors.groupingBy(tk->tk.getClass().getSimpleName(),
						Collectors.counting()));
	}
	public void sapTheoLoaiTrungGiamDanTheoTen() {  
		 dstk.sort((tk1, tk2 )-> { 
			String loai1 = tk1.getClass().getSimpleName() ;  
			String loai2 = tk2.getClass().getSimpleName() ; 
			int soSanhLoai = loai1.compareTo(loai2); 
			if(soSanhLoai == 0 ) { 
				return tk2.getTenChuTaiKhoan().compareToIgnoreCase(tk1.getTenChuTaiKhoan()) ; 
			}
			return soSanhLoai ;
		}); 
	
		
}
	
	


}
