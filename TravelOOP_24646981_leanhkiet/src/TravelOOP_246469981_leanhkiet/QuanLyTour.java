package TravelOOP_246469981_leanhkiet;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
public class QuanLyTour { 
	private List<Tour> dstour;

	public QuanLyTour() {
	
		dstour = new ArrayList<>() ; 
	}
	

	public QuanLyTour(List<Tour> dstour) {
		this.dstour = dstour;
	}


	public List<Tour> getDstour() {
		return dstour;
	}

	public void setDstour(List<Tour> dstour) {
		this.dstour = dstour;
	} 
	public String inTieuDe() {  
		return String.format("|%10s | %15s | %20s | %15s | %12s | %12s |" , "Ma CD" , 
				"Ten tour" , "Ngay KH " , "Ngay KT" , "So ngay di " , " Tinh Thanh Tien ") ;  
	}
	
	public void inDanhSach() { 
		if(dstour.isEmpty()) {
			throw new IllegalArgumentException("Danh Sach ROng ");
		}
		System.out.println(inTieuDe());
		for(Tour d : dstour) { 
			System.out.println(d);
		}
		
	}
		public boolean themMaChuyen(Tour code ) { 
			for(Tour d : dstour) { 
				if(d.getMaChuyenDi().equalsIgnoreCase(code.maChuyenDi)) { 
					 throw new IllegalArgumentException("trung ma chuyen" + code.getMaChuyenDi()) ;
					
				}
			}
			dstour.add(code); 
			return true; 
		}
		
		public boolean xoaChuyen(String c ) {
			Iterator <Tour> i = dstour.iterator() ; 
			while(i.hasNext()) { 
				if(i.next().getMaChuyenDi().equalsIgnoreCase(c)){
					i.remove() ;
					return true;  
					 
				}
			}
			
			System.out.println("khong tim thay ma ");
		return false ; 
			
		}
		
		public double tinhDoanhThu(int thang , int nam )  { 
			return dstour.stream()
					.filter(k->k.getNgayKhoiHanh().getMonthValue() == thang && 
						k.getNgayKhoiHanh().getYear() == nam ) 
					.mapToDouble(Tour::tinhThanhTien)
					.sum () ; 
			
		}
		public List<TourQuocTe> getDSThoiGianDiVaSapXepTangDan(int n ) {
			return dstour.stream()
					.filter(k->k instanceof TourQuocTe )
					.map(k->(TourQuocTe) k)
					.filter(t ->t.soNgayDi() >  n )
					.sorted(Comparator.comparing(TourQuocTe::getNgayKhoiHanh))
					.collect(Collectors.toList())  ;
						
		}
		
		public boolean capNhatThoiGian(String maChuyenDi, LocalDate ngayMoi) {
		    LocalDate today = LocalDate.now();

		    for (Tour d : dstour) {

		       
		        if (d.getMaChuyenDi().equalsIgnoreCase(maChuyenDi)) {

		            
		            if (!d.getNgayKhoiHanh().isAfter(today)) {
		                System.out.println("Tour đã diễn ra hoặc đang diễn ra! Không thể cập nhật.");
		                return false;
		            }

		            
		         try {
		        	 
		             d.setNgayKhoiHanh(ngayMoi);
		                System.out.println("Cập nhật thành công!");
		                return true;
					
				} catch (Exception e) {
					System.out.println("Loi" + e.getMessage());
				}
		        }
		    }

		   
		    System.out.println("Không tìm thấy mã chuyến đi: " + maChuyenDi);
		    return false;
		}

			
			
			
			
		}

			
			
//			public void capNhatHeSoThamNienMoi(String maGV , double heSoMoi) {
//				if(heSoMoi < 1  || heSoMoi >5 ) { 
//					throw new IllegalArgumentException("he so tham nien 1-> 5"); 
//				}
//				for(GiangVien gv : dsgv) { 
//					if(gv instanceof GiangVienCoHuu && gv.getMaGV().equalsIgnoreCase(maGV)) {
//						((GiangVienCoHuu) gv).setHeSoThamThien(heSoMoi);
//						return ; 
//					}
//				}
//				throw new IllegalArgumentException("loi " + maGV) ; 
//			}
//				
//
//				
//			
//			
			
		
//		public boolean capNhatThoiGian(String maChuyenDi , LocalDate ngayMoi)  {  
//			LocalDate today  = LocalDate.now() ; 
//			for(Tour d : dstour) {  
//				if(d.getMaChuyenDi().equalsIgnoreCase(mc)) {
//					
//					if(!d.getNgayKhoiHanh().isAfter(today)) {
//						throw new IllegalArgumentException("khong the cap nhat nay Khong hop le ") ; 
//					}
//			
//					try {
//						System.out.println("Cap Nhat Thanh Cong ");
//						d.setNgayKhoiHanh(ngayMoi);
//						return true ; 
//					} catch (Exception e) {
//						System.out.println("loi " );
//					}
//					
//								
//					
//					
//				}
//			}
//			
//			
//			
//			System.out.println("Da Cap Nhat ");
//			return true ; 
//		}
//		
//			
			
		
		
			
		
		
	
	
	
	
	



