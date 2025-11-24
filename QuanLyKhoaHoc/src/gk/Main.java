package gk;


public class Main {
    public static void main(String[] args) {
        QuanLyKhoaHoc ql = new QuanLyKhoaHoc();

        try {
        	// THEM CAC HOC PHAN 
            ql.themKhoaHoc(new KhoaHocLyThuyet("LT01", "A_Java Cơ Bản", 10, HinhThucGiangDay.TAI_LOP, true));
            ql.themKhoaHoc(new KhoaHocLyThuyet("LT02", "B_C++ Nâng Cao", 12, HinhThucGiangDay.TRUC_TUYEN, false));
            ql.themKhoaHoc(new KhoaHocLyThuyet("LT03", "C_Phân Tích Hệ Thống", 8, HinhThucGiangDay.TAI_LOP, true));
            ql.themKhoaHoc(new KhoaHocThucHanh("TH04", "A_Lập Trình Web", 15, "P101", 25));
            ql.themKhoaHoc(new KhoaHocThucHanh("TH05", "B_CSDL", 10, "P102", 20));
            ql.themKhoaHoc(new KhoaHocThucHanh("TH06", "C_AI Cơ Bản", 12, "P201", 30));
            ql.themKhoaHoc(new KhoaHocThucHanh("TH07", "D_Lập Trình Mobile", 18, "P202", 15));
            System.out.println("Danh Sach Ban Dau ");
            ql.inDanhSach();
            //THAT BAI TRUNG MA 
          
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
        try {
        	  ql.themKhoaHoc(new KhoaHocThucHanh("TH06", "C_AI Cơ Bản", 12, "P201", 30));
              ql.inDanhSach() ; 
     
			
		} catch (Exception e) {
			  System.out.println("Lỗi: " + e.getMessage());
		}
        
        
        
        try {
        	
            //THANH CONG 
            System.out.println("\nXÓA KHÓA HỌC MÃ 'LT01' ");
            System.out.println(ql.xoaKhoaHoc("LT01") ? "Xoa Thanh Cong " : "Khong Tim Thay Ma");
            //THAT BAI 
            System.out.println("\nXÓA KHÓA HỌC MÃ 'ZZZZ' ");
            System.out.println(ql.xoaKhoaHoc("ZZZ") ? "Xoa Thanh Cong " : "Khong Tim Thay Ma");
            System.out.println("\nDANH SÁCH SAU KHI XÓA ");
            ql.inDanhSach();
			
		} catch (Exception e) {
		    System.out.println("Lỗi: " + e.getMessage());
		}
        
        
        
        
        try {
            System.out.println("\nKHÓA HỌC THỰC HÀNH CÓ SỐ MÁY > 20 ");
            ql.layKhoaHocNhieuMayTinhHon(20).forEach(System.out::println);
            System.out.println("\nKHÓA HỌC THỰC HÀNH CÓ SỐ MÁY > 60 ");
            ql.layKhoaHocNhieuMayTinhHon(60).forEach(System.out::println);

			
		} catch (Exception e) {
			  System.out.println("Lỗi: " + e.getMessage());
		}
        
   
        
        try {
        	  System.out.println("\n SẮP XẾP THEO LOẠI + TÊN GIẢM DẦN ");
              ql.sapXepTheoLoaiVaTen();
              ql.inDanhSach();

			
		} catch (Exception e) {
			  System.out.println("Lỗi: " + e.getMessage());
		}
        
        

      
        try {
        	
            System.out.println("\nTHỐNG KÊ THEO LOẠI ");
            ql.thongKeTheoLoai().forEach((loai, sl) ->
                    System.out.println(loai + ": " + sl + " khóa học"));
      
			
		} catch (Exception e) {
			  System.out.println("Lỗi: " + e.getMessage
					  ());
		}
      
    }
}
