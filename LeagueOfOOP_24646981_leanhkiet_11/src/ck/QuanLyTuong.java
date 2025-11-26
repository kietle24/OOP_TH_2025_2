package ck;
import java.util.*;
import java.util.stream.Collectors;
public class QuanLyTuong {
	private List<Tuong > dst ;

	public QuanLyTuong() {
		
		 dst  =new  ArrayList<>() ; 
	}
	


	public List<Tuong> getDst() {
		return dst;
	}



	public void setDst(List<Tuong> dst) {
		this.dst = dst;
	}



	public String inTieuDe() {
		return String.format("|%15s |  %15s | %15s | %12s" ,
				"Ma Tuong ", "Ten Tuong " , "Phe Phai" , "Luc Chien") ; 
	} 

	public void inDanhSach() { 
		 if(dst.isEmpty()) {
			  System.out.println("Danh sach tuong rong ");
		 }
		 System.out.println(inTieuDe());
		 for(Tuong d : dst ) { 
			  System.out.println(d);
		 }
	}
	
	public boolean themTuong(Tuong code ) {  
		 for(Tuong d : dst ) {
			 if(d.getMaTuong().equalsIgnoreCase(code.maTuong)) { 
				  throw new IllegalArgumentException("them trung ma %s"+  code.getMaTuong());
		 }
		 }
		 dst.add(code); 
		 return true; 
	}
	public boolean xoaTuong(String code) {
		 Iterator<Tuong> i = dst.iterator() ; 
		 while(i.hasNext()) { 
			 if(i.next().getMaTuong().equals(code)) { 
				 i.remove();
				 System.out.println("Xoa Thanh Cong ");
				 return true; 
			 }
		 }
		 System.out.println("Khong tim thay ma ");
		 return false;  
		 
	}
	public Map<String , Double> thongKeTuong() { 
		return dst.stream().collect(Collectors.groupingBy(tk->tk.getClass().getSimpleName(),Collectors.averagingDouble(Tuong::lucChien))) ; 
				
				
				
	}
	public List<TuongSatThu> getDSTuongYeu(int n ) { 
		return dst.stream()
				.filter(t -> t instanceof TuongSatThu)
				.map(t -> (TuongSatThu) t)
				.filter(t->t.getSoMangHaGuc() ==  0 )
				.sorted(Comparator.comparing(TuongSatThu::getSatThuongCoBan))
				.collect(Collectors.toList());
		
		
	}
	
	public List<Tuong> getDSTuongManh() { 
		double max = 
				dst.stream().mapToDouble(t->t.lucChien()).max().orElse(0); 
		return dst.stream().filter(t -> t.lucChien() == max).collect(Collectors.toList() );
	}
	
	public void capNhapTuongTank(String maTuong , int chiSoGiap) {  
		for(Tuong t : dst) { 
			 if(t instanceof TuongDoDon  && t.maTuong.equalsIgnoreCase(maTuong)) {
				 ((TuongDoDon) t ).setChiSoGiap(chiSoGiap) ; 
				 return ; 
			 }
		}
		System.out.println("ma trung ");
		
	}


}
