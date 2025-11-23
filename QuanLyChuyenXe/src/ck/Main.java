package ck;

public class Main {
	public static void main(String[] args) {
		QuanLyChuyenXe qlcx = new QuanLyChuyenXe () ; 
		
		try {
			qlcx.themChuyenXe(new BikeTrip("T01", "An", "A01", 1000, LoaiXe.XE_GA));
			qlcx.themChuyenXe(new BikeTrip("T02", "Binh", "A02", 2000, LoaiXe.XANG_SO));
			qlcx.themChuyenXe(new BikeTrip("T03", "Cuong", "A03", 3000, LoaiXe.XANG_SO));
			qlcx.themChuyenXe(new CarTrip("T04", "ANH", "A04", 120, 4 , true));
			qlcx.themChuyenXe(new CarTrip("T05", "BAO", "A05",100, 7 , true));
			qlcx.themChuyenXe(new CarTrip("T06", "CHUNG", "A06",120, 7, false ));
		     System.out.println(qlcx.inTieuDe());
			qlcx.inDanhSach();
			
	        System.out.println(qlcx.thongKeHoanhThu());
	        
	        qlcx.sapXepTheoLoaiVaDoanhThu();
	        qlcx.inDanhSach();
	       
					
		} catch (Exception e) {
			System.out.println("loi" + e.getMessage());
		}
		
	}

}
