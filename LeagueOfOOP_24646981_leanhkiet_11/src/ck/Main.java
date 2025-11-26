package ck;

public class Main {
public static void main(String[] args) {
	QuanLyTuong qlt = new QuanLyTuong() ; 
	
	qlt.themTuong(new TuongSatThu("T01", "Anabel", "Sat thu",300 , 10)); 
	qlt.themTuong(new TuongSatThu("T02", "BrunoFealda", "Sat thu",500 , 2)); 
	qlt.themTuong(new TuongSatThu("T03", "Cross", "Sat thu",200 , 20)); 
	qlt.themTuong(new TuongDoDon("T04", " Aoro", "Do DOn",600 , 120)); // Sửa Máu cơ bản
	qlt.themTuong(new TuongDoDon("T05", "Bruno", "Do DOn",750 , 120)); // Sửa Máu cơ bản
	qlt.themTuong(new TuongDoDon("T06", "Cano", "Do DOn",501 , 120)); // Sửa Máu cơ bản
	
	qlt.inDanhSach();
	try {
		System.out.println("them trung ma tuong ");
		qlt.themTuong(new TuongDoDon("T06", "Cano", "Do DOn",501 , 120)); // Sửa Máu cơ bản
	
		
	} catch (Exception e) {
		// TODO: handle 
		System.out.println("loi " + e.getMessage());
	}
	System.out.println("Xoa tuong T01");
	qlt.xoaTuong("T01") ; 
	qlt.inDanhSach();
	
	qlt.thongKeTuong().forEach((loaiTuong, lucChienTB) -> 
    System.out.printf("Loại %s: %.2f\n", loaiTuong, lucChienTB)
);
	
	System.out.println("Danh sach tuong yeu ");
	 ;
	System.out.println(qlt.getDSTuongYeu(0));
	qlt.inDanhSach();
	System.out.println("Danh sach tuong manh  ");
	System.out.println(qlt.getDSTuongManh());
	

	
	System.out.println("Cap Nhat tuong ");
	qlt.capNhapTuongTank("T06", 110);
	qlt.inDanhSach();
	
	
	
	
	
}


}
