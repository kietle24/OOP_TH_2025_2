package ck;
import java.util.*;
import java.util.stream.Collectors;
public class QuanLyNhanVien {
	private List<NhanVien> dsnv ;

	public QuanLyNhanVien() {
		 dsnv = new  ArrayList<>(); 
	}  
	
	public List<NhanVien> getDsnv() {
		return dsnv;
	}

	public void setDsnv(List<NhanVien> dsnv) {
		this.dsnv = dsnv;
	}

	public String inTieUDe() { 
		return String.format("|%10s | %15s | %15s | %15s","MSNV " , "TEN NV" , "SDT", "THU NHAP" 
);
	}
	public void inDanhSach() {
		if(dsnv.isEmpty()) {
		 System.out.println("Danh Sach Rong ");
	}
		System.out.println(inTieUDe());
		for(NhanVien d : dsnv) { 
		System.out.println(d);
			
		}
		
	}

	public boolean themNhanVien(NhanVien nv) { 
		for(NhanVien v : dsnv) { 
			if(v.getMaSo().equalsIgnoreCase(nv.getMaSo())) {
				throw new IllegalArgumentException("trung ma so" + nv.getMaSo()) ; 
			}
		}
		dsnv.add(nv); 
		return true ;
	}
	public boolean xoaNhanVien(String maXoa) {  
		Iterator<NhanVien> i = dsnv.iterator() ; 
		while(i.hasNext()) {
			if(i.next().getMaSo().equals(maXoa)) { 
				i.remove() ; 
				return true  ; 
			}
		}
		return false ;		
	}

	
	public Map<String , Double > layThongKeTrungBinhLuongNhanVien() {  
		return dsnv.stream().collect(Collectors.groupingBy(k->k.getClass().getSimpleName(),
				Collectors.averagingDouble( k-> k.thuNhap())  )); 
		
				
	}
	public List<NhanVien > getDSNhanVienUuTu() { 
		return dsnv.stream()
				.filter(k->k instanceof NhanVienBanHang)
				.map(k ->(NhanVienBanHang) k)
				.filter(k ->k.getDoanhSoBanHang() < 2000000)
				.sorted((a,b) ->Double.compare(b.getDoanhSoBanHang() , a.getDoanhSoBanHang() ))
				.collect(Collectors.toList()) ; 
		  
	}
	public List<NhanVien> getDSLonNhat() { 
		double max = dsnv.stream()
				.filter(k->k instanceof NhanVienBanHang)
				.mapToDouble(nv -> ((NhanVienBanHang) nv).getDoanhSoBanHang())
				.max().orElse(0); 
		return dsnv.stream()
				.filter(k->k instanceof NhanVienBanHang && ((NhanVienBanHang) k).getDoanhSoBanHang() ==max)
				.collect(Collectors.toList()); 
	
	}
	
	



}