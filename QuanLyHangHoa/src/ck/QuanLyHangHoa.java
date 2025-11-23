package ck;
import java.util.*;
import java.util.stream.Collectors;
public class QuanLyHangHoa {
	private List<HangHoa> dshh  ;
	public QuanLyHangHoa() {
	 dshh = new ArrayList <>();
	} 
	public void inDanhSach() { 
		if(dshh.isEmpty()) {
			System.out.println("danh sach rong");
			return ; 
		}
		for(HangHoa d : dshh) { 
			System.out.println(d);
		}
	}
	public String inTieuDe() { 
		return String.format("|%10s | %20s | %10s |%10s ","Ma HH ", "Ten HH", "Don gia", "Tinh Thue VAT "); 
		 
	}

	public boolean themHangHoa(HangHoa kh )   { 
		for(HangHoa k : dshh) { 
			 if(k.getMaHang().equalsIgnoreCase(kh.getMaHang())) { 
				  throw new IllegalArgumentException("trung ma khoa hoc " + kh.getMaHang());				 
			 }
			
		}
		dshh.add(kh) ; 
		return true ; 
		
	}
	public boolean xoaHangHoa(String maXoa) { 
		 Iterator <HangHoa> it  = dshh.iterator() ; 
		 while(it.hasNext()) { 
			 if(it.next().getMaHang().equalsIgnoreCase(maXoa)) {
				 System.out.println("xoa thanh cong ");
				 it.remove(); 
				 return true; 
			 }
		 }
		 return false ; 
	}
public List<HangDienTu> layThoiGianBaoHanhHangDien(int n ) { 
	return dshh.stream()
			.filter(k->k instanceof HangDienTu )
			.map(k->(HangDienTu)k)
			.filter(k->k.getThoiGianBaoHanh() > n )
			.collect(Collectors.toList()); 
	
}

public Map<String , Long>  thongKeDanhSach() {
	return dshh.stream().collect(
				Collectors.groupingBy(k->k.getClass().getSimpleName(),
				Collectors.counting())) ; 
}
 
public void sapTheoLoaiTrungGiamDanTheoTen() {  
	 dshh.sort((tk1, tk2 )-> { 
		String loai1 = tk1.getClass().getSimpleName() ;  
		String loai2 = tk2.getClass().getSimpleName() ; 
		int soSanhLoai = loai1.compareTo(loai2); 
		if(soSanhLoai == 0 ) { 
			return tk2.getTenHang().compareToIgnoreCase(tk1.getTenHang()) ; 
		}
		return soSanhLoai ;
	}); 
}
	 
public SAwet<Trip> sapXepTheoLoaiVaDoanhThu() { 
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

}
		
	 