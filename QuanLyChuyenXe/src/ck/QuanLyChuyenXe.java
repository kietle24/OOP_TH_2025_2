package ck;
import java.util.*;
import java.util.stream.Collectors;
public class QuanLyChuyenXe {
	private Set<Trip> dscx ;

	public QuanLyChuyenXe() {
		 dscx = new HashSet<>(); 
	} 
	public boolean themChuyenXe(Trip t ) { 
		 return dscx.add(t) ;
	}
	public boolean xoaChuyenXe(Trip t ) { 
		 return dscx.remove(t) ;
	}
	
	public Set<CarTrip> lucChuyenXeVIP(double xkm){ 
		return dscx.stream()
				.filter(t ->t instanceof CarTrip)
				.map(t->(CarTrip)t )
				.filter(c-> c.getSoChoNgoi() == 7)
				.filter(c->c.getKm() > xkm)
				.collect(Collectors.toSet()); 
	}
	public Map<String , Long > thongKeHoanhThu() { 
		 return dscx.stream().collect(
				 Collectors.groupingBy(k->k.getClass().getSimpleName(),
				 Collectors.counting())); 				 
	}
 	

	public List<Trip> sapXepTheoLoaiVaDoanhThu() { 
	    List<Trip> list = new ArrayList<>(dscx);

	    list.sort((a, b) ->  { 
	        boolean aisbike  = a instanceof BikeTrip; 
	        boolean bisbike  = b instanceof BikeTrip; 

	        // 1. Ưu tiên loại dịch vụ: Bike trước, Car sau
	        if (aisbike && !bisbike) return -1; 
	        if (!aisbike && bisbike) return 1; 

	        // 2. Nếu cùng loại → sắp xếp giảm dần theo thành tiền
	        double t1 = a.tinhThanhTien(); 
	        double t2 = b.tinhThanhTien(); 
	        return Double.compare(t2, t1); 
	    });

	    return list; 
	}
	
	public String inTieuDe() { 
		return String.format("%10s | %10s | 15%s | %15s | %10s",
				"Ma CX" , "Ten TX", "BSX", "QD", "Thanh Tien") ; 
 }
	
	public void inDanhSach() {  
		if(dscx.isEmpty()) {
			System.out.println("DS rong ");
			return ; 
		}
		for(Trip k : dscx) {
			System.out.println(k);
		}
	}

	}

			
	
	
	
	
	

