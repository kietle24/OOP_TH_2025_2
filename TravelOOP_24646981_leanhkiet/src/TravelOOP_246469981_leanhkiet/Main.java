package TravelOOP_246469981_leanhkiet;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		QuanLyTour qlt = new QuanLyTour()  ; 
		
		qlt.themMaChuyen(new TourTrongNuoc("T01", "HCM", LocalDate.of(2025, 1, 1), LocalDate.of(2025, 1, 14), 20000000 , 3000  )); 
		qlt.themMaChuyen(new TourTrongNuoc("T02", "HANOI", LocalDate.of(2025, 2, 1), LocalDate.of(2025, 4, 27), 40000000 , 3000  )); 
		qlt.themMaChuyen(new TourTrongNuoc("T03", "DAKLAK", LocalDate.of(2025, 3, 1), LocalDate.of(2025, 3, 30), 60000000 , 3000  )); 
		qlt.themMaChuyen(new TourQuocTe("T04", "Hue", LocalDate.of(2025, 4, 1), LocalDate.of(2025, 8, 14), 60000000 , 300000 , 300000  )); 
		qlt.themMaChuyen(new TourQuocTe("T05", "DaNang", LocalDate.of(2025, 5, 1), LocalDate.of(2025, 12, 30), 400000 , 42000000 , 1200000    )); 
		qlt.themMaChuyen(new TourQuocTe("T06", "HaiPhong", LocalDate.of(2026,6, 1), LocalDate.of(2026,6, 14), 5000000  , 5403000  , 00000  )); 
		System.out.println("Danh Sach them ");
		qlt.inDanhSach();
		
		
		System.out.println("Xoa ma T01");
		qlt.xoaChuyen("T01") ; 
		qlt.inDanhSach();
		
	
		System.out.println("Tinh Doanh Thu : t1 nam 2025 ");
		System.out.println(qlt.tinhDoanhThu(1, 2025));
		System.out.println(qlt.tinhDoanhThu(2, 2025));
		System.out.println(qlt.tinhDoanhThu(3, 2025));
		System.out.println(qlt.tinhDoanhThu(4, 2025));
		
		System.out.println("DANH SACH THOI GIAN DI VA SAP XEP THEO THOI GIAN KHOI HANH ");
		
		qlt.getDSThoiGianDiVaSapXepTangDan(30).forEach(System.out::println);
		
		qlt.inDanhSach();
		System.out.println("Cap nhat ma T06  ");
		System.out.println(qlt.capNhatThoiGian("T06", LocalDate.of(2025, 1, 1)));qlt.inDanhSach();

	

		
		

		
		
		
	}

	
}
