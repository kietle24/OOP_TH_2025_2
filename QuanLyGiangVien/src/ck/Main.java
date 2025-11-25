
package ck;
public class Main {
public static void main(String[] args) {
	

    QuanLyGiangVien qlgv = new QuanLyGiangVien();
   
        qlgv.themGiangVien(new GiangVienThinhGiang("T01" , "A" , "abc@gmail.com" , 10));
        qlgv.themGiangVien(new GiangVienThinhGiang("T02" , "B" , "abcd@gmail.com" , 10));
        qlgv.themGiangVien(new GiangVienThinhGiang("T03" , "C" , "abce@gmail.com" , 30));

        qlgv.themGiangVien(new GiangVienCoHuu("T04" , "D" , "abcef@gmail.com" , 30000, 3.2));
        qlgv.themGiangVien(new GiangVienCoHuu("T05" , "E" , "abcefg@gmail.com" , 40000, 4.2));
        qlgv.themGiangVien(new GiangVienCoHuu("T06" , "F" , "abcefh@gmail.com" , 600000, 2.0));
        qlgv.inDanhSach();

        try {
            System.out.println("Them trung Ma ") ; 
            qlgv.themGiangVien(new GiangVienCoHuu("T06" , "M" , "abcefh@gmail.com" , 600000, 2.0));
            qlgv.inDanhSach();
            
      	
        } catch (Exception e) {
    		  System.out.println("loi " + e.getMessage());
    		}
        
        
    
        System.out.println("Kiem Thu Xoa T01");
        System.out.println (qlgv.xoaGiangVien("T01") ? "Xoa Thanh Cong" : "Khong tim thay ma de xoa") ;
    
        qlgv.inDanhSach();
        
        try {
        	 System.out.println("Kiem Thu Xoa ZZZ");
             System.out.println (qlgv.xoaGiangVien("ZZZ") ? "Xoa Thanh Cong" : "Khong tim thay ma de xoa") ;
        
     
             
		} catch (Exception e) {
			  System.out.println("loi " + e.getMessage());
		}
        
        
        System.out.println("Thong ke tiet Day < 50 ");
        qlgv.layGiangVienDayIt(50).forEach( System.out::println);
        
        System.out.println("Thong ke tiet Day <0 ");
        qlgv.layGiangVienDayIt(0).forEach( System.out::println);
        
        System.out.println("Tim Giang Vien Co Thu nhap cao nhat : ");
        qlgv.getDanhSachGVThuNhapCao().forEach( System.out::println);
        
        
        System.out.println("Cap nhat he so luong giang vien T04: ");
        qlgv.capNhatHeSoThamNienMoi("T04", 5.0);
        qlgv.inDanhSach();
        try {
        	
            System.out.println("Cap nhat he so luong giang vien ");
            qlgv.capNhatHeSoThamNienMoi("T04", 0.0);
            qlgv.inDanhSach();
        	
			
		} catch (Exception e) {
			System.out.println("loi "+ e.getMessage());
		}
        
       
     
  
 
    
	
}
}
