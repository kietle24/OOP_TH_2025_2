package gk;
import java.util.*;
import java.util.stream.Collectors;
public class QuanLyKhoaHoc {
	private List <KhoaHoc> dskh;
	public QuanLyKhoaHoc() {
		dskh  = new ArrayList <>() ; 
	}  
	// them khoahoc vao danh sach 
	public boolean themKhoaHoc(KhoaHoc kh )   { 
		for(KhoaHoc k : dskh) { 
			 if(k.getMaKhoaHoc().equalsIgnoreCase(kh.getMaKhoaHoc())) { 
				  throw new IllegalArgumentException("trung ma khoa hoc " + kh.getMaKhoaHoc());				 
			 }
			
		}
		dskh.add(kh) ; 
		return true ; 
		
	}
	// xoa khoa hoc theo ma 
	public boolean xoaKhoaHoc(String ma) { 
		Iterator<KhoaHoc > it = dskh.iterator() ; 
		while(it.hasNext()) { 
		 if(it.next().getMaKhoaHoc().equalsIgnoreCase(ma)) {
			  it.remove(); 
			  return true ; 
		 }
		}
		 return false ; 
		 
	}
	//lay danh sach Khoa Hoc co so may tinh > n  
	public List<KhoaHocThucHanh> layKhoaHocNhieuMayTinhHon(int n ) {  
		return dskh.stream()
				.filter(kh ->kh instanceof KhoaHocThucHanh)
				.map(kh->(KhoaHocThucHanh) kh )
				.filter(kh->kh.getSoMayTinh() > n )
				.collect(Collectors.toList());
	}
    public void sapXepTheoLoaiVaTen() {
    	dskh.sort((a, b) -> {
            String loaiA = a.getClass().getSimpleName();
            String loaiB = b.getClass().getSimpleName();
            int cmp = loaiA.compareTo(loaiB);
            if (cmp == 0) return b.getTenKhoaHoc().compareToIgnoreCase(a.getTenKhoaHoc());
            return cmp;
        });
    }
    
    public Map<String, Long> thongKeTheoLoai() {
        return dskh.stream()
                .collect(Collectors.groupingBy(
                        kh -> kh.getClass().getSimpleName(),
                        Collectors.counting()
                ));
    }
    public void inDanhSach() {
        if (dskh.isEmpty()) {
            System.out.println("Danh sach rong"); return ; 
        }
        System.out.println(inTieuDe());
        for (KhoaHoc kh : dskh) {
            System.out.println(kh);
        }
    }
	public String inTieuDe() { 
		return String.format("%-10s | %-20s | %10s | %10s",
				"Ma KH" ,"Ten KH "," So Buoi", "Hoc Phi") ; 
	}
    
	
	
	

}
