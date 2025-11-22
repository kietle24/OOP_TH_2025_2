package qltv;
import java.util.*;
import java.time.LocalDate ; 
public class Library implements ILibrary {
	private List<Book> ds_sach ;  
	public Library() { 
		ds_sach = new ArrayList<>() ; 		 
	}
	//in danh sach 	
	public void inDanhSach() { 
		if(ds_sach.isEmpty()) {
			  System.out.println("danh sach rong ");
			  return ; 
		}
		System.out.println("Ds sach trong thu vien ");
		for(Book book: ds_sach ) { 
			 System.out.println(book);
		}
	}
	
    // tim kiem theo ma 
		public Book timBookTheoMa(String code) { 
			 for(Book book : ds_sach) { 
				  if(book.getCode()	(code)) {
					   return book  ; 
				  }
			 }
			 return null ; 
		}
	
	// tuan theo quy luat tuan khai tim ma roi moi tim duoc 
	public boolean addBook(Book newBook) {
	    if (newBook == null) {
	        return false ; 
	    }
	    if(timBookTheoMa(newBook.getCode()) != null ){ 
	    	 System.out.println("ma sach da ton tai "); 
	    	 return false ; 
	    }
	    ds_sach.add(newBook) ; 
	    return true; 
	    
	}
	//xoa sach theo ma 
	public boolean xoaSachTheoMa(String code ) {  
		Book sachCanXoaTheoMa = timBookTheoMa(code) ; 
		if(sachCanXoaTheoMa != null) { 
			return ds_sach.remove(sachCanXoaTheoMa) ; 
		}
		return false ; 
	}

	 
}