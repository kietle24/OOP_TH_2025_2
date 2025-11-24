package ck;
public class Main {
	public static void main(String[] args) {
		QuanLyVe qlve = new QuanLyVe() ; 
		
		try {
			qlve.addVe(new VeTronGoi("TG01", "AN", 20 , KhungGio.KHUNG_GIO1, false )); 
			qlve.addVe(new VeTronGoi("TG02", "Binh", 30 , KhungGio.KHUNG_GIO2, true )); 
			qlve.addVe(new VeTronGoi("TG03", "Cuong", 40 , KhungGio.KHUNG_GIO1, true )); 
			
			qlve.addVe(new VeTungPhan("TP01", "Anh", 5 , "Mario" , 30)); 
			qlve.addVe(new VeTungPhan("TP02", "Bao", 40 , "Flash" , 40)); 
			qlve.addVe(new VeTungPhan("TP03", "Chung", 40 , "Superman" , 50)); 
			
			qlve.addVe(new VeSuKien("SK06", "Ánh", 10 ,"Dai Hoi Dang"  , LoaiGhe.GHE_VIP)); 
			qlve.addVe(new VeSuKien("SK07", "Bổ", 50 ,"Dai Hoi Dang"  , LoaiGhe.GHE_THUONG)); 
			qlve.addVe(new VeSuKien("SK08", "Chiến", 40 ,"Dai Hoi Dang"  , LoaiGhe.GHE_VIP)); 
			
			System.out.println("Them Danh Sach : ");
			qlve.inDanhSach();
		
	
			
		} catch (Exception e) {
			System.out.println("Loi " + e.getMessage());
		}

		
		
		
	try {
		System.out.println("Kiem Thu Them trung ma : SK08");
		qlve.addVe(new VeSuKien("SK08", "Chi", 40 ,"Dai Hoi Dang"  , LoaiGhe.GHE_VIP)); 
		
		qlve.inDanhSach();
	} catch (Exception e) {
		System.out.println("Loi " + e.getMessage());
	}
	
	
	
	
	
	
	
	
	try {
		System.out.println("Kiem Thu Xoa SK08 ");
		
	System.out.println(qlve.xoaVe("SK08")? " Xoa Thanh cong " : "Khong  tim thay ma ");
	
	System.out.println("Kiem Thu Xoa ZXZZ");
	System.out.println(qlve.xoaVe("ZXZZ")? " Xoa Thanh cong " : "Khong  tim thay ma ");
		
		
		
	} catch (Exception e) {
		System.out.println("Loi " + e.getMessage());
	}
	
	try {
		
		System.out.println("Danh Sach Hien Tai");
		qlve.inDanhSach();
		
		System.out.println("Tìm kiếm và trả về danh sách các Vé sự kiện có doanh thu lớn hơn x (giá trị x được truyền vào). ");
		qlve.layVe(4000000).forEach(System.out::println);
	} catch (Exception e) {
		System.out.println("Loi " + e.getMessage());
	}
	
	try {
		qlve.thongKeTheoLoaiVe().forEach((ve, loai)->
		System.out.println(ve + ":" + loai +" Loai"));
	
	
	} catch (Exception e) {
		System.out.println("Loi " + e.getMessage());

	}
	
	  
    try {
    	  System.out.println("Sắp xếp danh sách vé theo tiêu chí:\r\n"
    	  		+ "	Ưu tiên sắp xếp theo Loại vé (tên lớp).\r\n"
    	  		+ "	Nếu cùng loại vé, sắp xếp giảm dần theo Doanh thu.\r\n"
    	  		+ "");
          qlve.sapTheoLoaiVeTrungGiamDanTheoDoanhThu();
          qlve.inDanhSach();

		
	} catch (Exception e) {
		  System.out.println("Lỗi: " + e.getMessage());
	}
    
    
		
		
	}


}
