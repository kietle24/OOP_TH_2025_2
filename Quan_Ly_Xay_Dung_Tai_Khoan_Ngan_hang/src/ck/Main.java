package ck;
public class Main {
public static void main(String[] args) {
	QuanLyTaiKhoan qltk = new QuanLyTaiKhoan() ; 
	try {
		
		qltk.addTK(new TaiKhoanTietKiem("TK001","AN",600000, KyHan.DAI_HAN ,true ));
		qltk.addTK(new TaiKhoanTietKiem("TK002","BINH",800000, KyHan.NGAN_HAN ,false  ));
		qltk.addTK(new TaiKhoanTietKiem("TK003","CHUNG",900000, KyHan.NGAN_HAN ,false  ));
	
		qltk.addTK(new TaiKhoanThanhToan("TT004","ANH ",1200000, "ViSa", 50 ));
		qltk.addTK(new TaiKhoanThanhToan("TT005","Bao",900000, "Creadit" ,10   ));
		qltk.addTK(new TaiKhoanThanhToan("TT006","CUONG",900000, "Visa", 12 ));
		qltk.addTK(new TaiKhoanThanhToan("TK007","DANH",900000,"ViSa", 13   ));
		System.out.println("Danh Sach TK Ban Dau ") ;
		qltk.inDanhSach();
	
	} catch (Exception e) {
		System.out.println(" Loi " + e.getMessage());
	}
	
	try {
		System.out.println("Truong Hop Them Trung Ma: ") ;
		qltk.addTK(new TaiKhoanThanhToan("TK007","DANH",900000,"ViSa", 13   ));
		
	} catch (Exception e) {
		System.out.println(" Loi " + e.getMessage());
		
	}
	
	try {
		System.out.println(qltk.xoaTk("TK007")? "Xoa Thanh Cong " : " Khong thay ma ");
		qltk.inDanhSach();
		
		
		System.out.println(qltk.xoaTk("TK008")? "Xoa Thanh Cong " : " Khong thay ma ");
		
	} catch (Exception e) {
		System.out.println(" Loi " + e.getMessage());
	}

	try {
		System.out.println("Danh Sach Ban Dau ");
		qltk.inDanhSach();
		System.out.println("Thong Ke Danh Sach Han Muc > 40 ");
		
		qltk.layTK(40).forEach(System.out::println);
		
		System.out.println("Thong Ke Danh Sach Han Muc > 60 ");
		qltk.layTK(60).forEach(System.out::println);
		
	
	} catch (Exception e) {
		System.out.println("loi"+ e.getMessage());

	}
	
	try {
		System.out.println("Thong Ke Tai Khoan: ");
		qltk.thongKeTheoLoai().forEach((tk, sl) -> System.out.println( tk +":" + sl +" Tai KHoan" ));
		
	} catch (Exception e) {
		System.out.println("loi"+ e.getMessage());
	}
	
	try {
		System.out.println("Sap Xep Giam Dan ");
		qltk.sapTheoLoaiTrungGiamDanTheoTen();
		qltk.inDanhSach();
		
	} catch (Exception e) {
		System.out.println("loi"+ e.getMessage());
	}
	

	
	
}

}
