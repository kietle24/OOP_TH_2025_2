package qltv;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

public class TextBook extends Book {
	private BookStatus bookStatus ;
	public TextBook(String code, String name, String publisher,
			double unitPrice, int quanlity, LocalDate importDate,
			BookStatus bookStatus) {
		super(code, name, publisher, unitPrice, quanlity, importDate) ; 
		setBookStatus(bookStatus) ; 
	}
	public BookStatus getBookStatus() {
		return bookStatus;
	}

	public void setBookStatus(BookStatus bookStatus) {
		this.bookStatus = bookStatus;
	} 
	@Override
	public String toString() {
		NumberFormat nf  = NumberFormat.getCurrencyInstance(new Locale("vi", "VN")) ; 
		return String.format("%s | %s", super.toString() , bookStatus);
	}
	@Override
	public double getSalePrice() {
		return 0;
	}

}
