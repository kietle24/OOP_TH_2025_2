package gk;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		QuanLyKhoaHoc qlkh = new QuanLyKhoaHoc();  
		try {
			KhoaHoc kh1 = new KhoaHoc("KH001", "Lập trình Java", 
				LocalDate.now(), LocalDate.of(2025, 12, 30), TrinhDo.CoBan, 100 , 5000000);
			KhoaHoc kh2 = new KhoaHoc("KH002", "Lập trình C", 
				LocalDate.now(), LocalDate.of(2025, 12, 20), TrinhDo.NangCao, 20 , 8000000);
			KhoaHoc kh3 = new KhoaHoc("KH003", "Lập trình OOP",
				LocalDate.now(), LocalDate.of(2025, 12, 22), TrinhDo.NangCao, 30 , 7000000);
			KhoaHoc kh4 = new KhoaHoc("KH005", "Lập trình C++",
				LocalDate.now(), LocalDate.of(2025, 12, 1), TrinhDo.NangCao, 50 , 8000000);
			
			KhoaHoc kh5= new KhoaHoc("KH006", "Lập trình GoLang",
				LocalDate.now(), LocalDate.of(2025, 12, 2), TrinhDo.CoBan, 10 , 8000000);
			qlkh.themKhoaHoc(kh1 );
			qlkh.themKhoaHoc(kh2 );
			qlkh.themKhoaHoc(kh3 );
			qlkh.themKhoaHoc(kh4 );
			qlkh.themKhoaHoc(kh5 );
			qlkh.inDanhSach();
			
			
		} catch (Exception e) {
			System.out.println("loi "+ e.getMessage()) ;
		}
		//  b tang gap doi kich thuot 
		try {
		
			KhoaHoc kh2 = new KhoaHoc("KH007", "Lập trình C", 
					LocalDate.now(), LocalDate.of(2025, 12, 20), TrinhDo.NangCao, 20 , 6000000);
		
			

			KhoaHoc kh6= new KhoaHoc("KH008", "Lập trình GoLang",
					LocalDate.now(), LocalDate.of(2025, 12, 2), TrinhDo.CoBan, 10 , 8000000);

			qlkh.themKhoaHoc(kh2 );


			qlkh.themKhoaHoc(kh6 );
			qlkh.inDanhSach();
			
			
		} catch (Exception e) {
			System.out.println("loi "+ e.getMessage()) ;
		}
		try {
			System.out.println(" Xoa Ma Hoc Phan KH002 va KH006 ");
			qlkh.xoaKhoaHocTheoMa("KH002"); 
			qlkh.xoaKhoaHocTheoMa("KH006"); 
			qlkh.inDanhSach();
		} catch (Exception e) {
			System.out.println("Loi " + e.getMessage());
		}
		
		
		
		try {
		
			 System.out.println("Sau khi Sap Xep Giam Dan Theo Hoc Phi:");
		        qlkh.sapXepGiamDanTheoHocPhi();  // Sắp xếp danh sách theo học phí giảm dần
		        qlkh.inDanhSach();  // In lại danh sách sau khi sắp xếp
			
		} catch (Exception e) {
			System.out.println("Loi " + e.getMessage());
		}
		
		
	
		
	}

}
