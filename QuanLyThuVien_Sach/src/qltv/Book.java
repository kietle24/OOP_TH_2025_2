package qltv;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Objects;
public abstract class Book {
	private final String code ; 
	private String name ; 
	private String publisher ; 
	private double unitPrice ; 
	private int quanlity ; 
	private LocalDate importDate ;

	public Book(String code, String name, String publisher, 
			double unitPrice, int quanlity, LocalDate importDate) {
		 if(code == null || code.isEmpty()) { 
			 throw new IllegalArgumentException("ma sach khong hop le ") ; 
		 }
		this.code = code;
		setName(name)  ; 
		this.publisher = publisher;
		setPublisher(publisher) ; 
		setUnitPrice(unitPrice) ; 
		setQuanlity(quanlity) ; 
		setImportDate(importDate) ; 
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name == null || name.isEmpty()) {
			 throw new IllegalArgumentException("name khong hop le ") ; 
			 
		}
		this.name = name.trim();
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		if(publisher == null || publisher.trim().isEmpty()) {
			 throw new IllegalArgumentException("publisher khong hop le "); 
		}
		this.publisher = publisher.trim();
	}
	public double getUnitPrice() {
		
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		if(unitPrice < 0 ) {
			 throw new IllegalArgumentException("don gia khong the am ");
			 
		}
		
		this.unitPrice = unitPrice;
	}
	public int getQuanlity() {
		return quanlity;
	}
	public void setQuanlity(int quanlity) {
		if (quanlity < 0 ) { 
			 throw new IllegalArgumentException("so luong khong hop le  ");
		}
		this.quanlity = quanlity;
	}
	public LocalDate getImportDate() {
		return importDate;
	}
	public void setImportDate(LocalDate importDate) {
			if(importDate == null || importDate.isAfter(LocalDate.now())) { 
				 throw new IllegalArgumentException("ngay nhap khong hop le ");
			}
		this.importDate = importDate;
	}
	public String getCode() {
		return code;
	} 
public abstract  double getSalePrice() ; // tinh tong tien 
// phuong thuc cac tien ich de tinh gia tri ton kho 
public double getInventoryValue() { 
	return this.unitPrice* this.quanlity ; 
}
// kiem tra sach da la do moi nhap (30 ngay )
public boolean inNewArrival() { 
	 return this.importDate.isAfter(LocalDate.now().minusDays(30)); 
}
@Override
public String toString() {
	NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("vi" , "VN")); 
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
	return String.format("%6s | %-20s | %-20s | %15s | %10s | %10s | %15s" , 
			this.code,
			this.name ,
			this.publisher , 
			nf.format(unitPrice) , this.quanlity , dtf.format(importDate), 
			nf.format(getSalePrice())) ; 
}
@Override
public int hashCode() {
	return Objects.hash(code);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	Book other = (Book) obj;
	return Objects.equals(code, other.code);
}











}
