package ck;


public class Main {
	public static void main(String[] args) {
		QuanLyHangHoa qlhh = new QuanLyHangHoa(); 
		try {
			qlhh.themHangHoa(new HangThucPham("A01","COCA",50000, LoaiBaoQuan.KHO_LANH , true )); 
			qlhh.themHangHoa(new HangThucPham("A02","PEPSI",50000, LoaiBaoQuan.KHO_THUONG , false  )); 
			qlhh.themHangHoa(new HangThucPham("A03","7UP",50000, LoaiBaoQuan.KHO_LANH , false  )); 
			qlhh.themHangHoa(new HangDienTu("A04","AVATOR",50000,"TOSHIBA" , 12 )); 
			qlhh.themHangHoa(new HangDienTu("A05","BULON",50000, "MISUBISHI" , 20 )); 
			qlhh.themHangHoa(new HangDienTu("A06","CONKITOR",50000, "PANASONIC" , 40)); 
			qlhh.themHangHoa(new HangDienTu("A07","DOMINO",50000,"MADAZ" , 20)); 
	
			System.out.println(	qlhh.inTieuDe());
			qlhh.inDanhSach();
			
		} catch (Exception e) {
			System.out.println("LOI" + e.getMessage());
		}
		try {
			qlhh.themHangHoa(new HangDienTu("A07","DOMINO",50000,"MADAZ" , 20)); 
			qlhh.inDanhSach();
			
		} catch (Exception e) {
			 System.out.println("LOI" + e.getMessage());
		}
	
		try {
			System.out.println("Xoa Ma A07");
			qlhh.xoaHangHoa("A07");
			System.out.println(	qlhh.inTieuDe());
			qlhh.inDanhSach();
			
		} catch (Exception e) {
			System.out.println("LOI" + e.getMessage());
		}
		try {
			System.out.println("lay Thoi Gian Bao Hanh Hang Dien > 30");
			qlhh.layThoiGianBaoHanhHangDien(30).forEach(System.out::println);
			
		} catch (Exception e) {
			System.out.println("LOI" + e.getMessage());
		}
		
		try {
			  System.out.println("\n SẮP XẾP THEO LOẠI + TÊN GIẢM DẦN ");
              qlhh.sapTheoLoaiTrungGiamDanTheoTen();
              qlhh.inDanhSach();

			
		} catch (Exception e) {
			System.out.println("LOI" + e.getMessage());
		}
		try {
		    System.out.println("\nTHỐNG KÊ THEO LOẠI ");
            qlhh.thongKeDanhSach().forEach((loai, sl) ->
                    System.out.println(loai + ": " + sl + "Hang Hoa"));
			
		} catch (Exception e) {
			System.out.println("LOI" + e.getMessage());
		}
		
	

	}
	



}
