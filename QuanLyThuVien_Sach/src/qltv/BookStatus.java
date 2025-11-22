package qltv;

public enum BookStatus  {
	OLD("Cũ"),
	NEW("Mới");
	private String desc ;


	private BookStatus(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return this.desc ; 
	} 
	

}
