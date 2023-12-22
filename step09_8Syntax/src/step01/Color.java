package step01;

public enum Color {
	RED("c01");
	/* 
	 * public static final RED = new RED();
	 * 
	 */
	
	private String colorCode;
	
	Color(String colorCode){
		this.colorCode = colorCode;
	}
	public String getColorCode() {
		return colorCode;
	}
	
	
	
}
