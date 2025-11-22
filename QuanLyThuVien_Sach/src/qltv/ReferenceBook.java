package qltv;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;
public class ReferenceBook  extends Book{
	private double val  ;

	public ReferenceBook(
			String code, String name,
			String publisher, double unitPrice, 
			int quanlity,
			LocalDate importDate, double val) {
		super(code, name, publisher, unitPrice, quanlity, importDate);
		this.val = val;
	}

	public double getVal() {
		return val;
	}

	public void setVal(double val) {
		this.val = val;
	}

	
	@Override
	public String toString() {
		NumberFormat nf  = NumberFormat.getCurrencyInstance(new Locale("vi", "VN")) ; 
		return String.format("%s | %s", super.toString() , nf.format(val));
	}	
	@Override
	public double getSalePrice() {
		return 0;
	}
	

	
	
	
}
