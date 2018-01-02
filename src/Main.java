
public class Main {
	public static void main(String arg[]){
		Office.Builder builder = new Office.Builder();
		builder.setAir(1)
		.setChair(2)
		.setFan(43)
		.setLight(222);
		builder.setTable(12333);
		Office office = builder.create();
		String officeValue = office.toString();
		System.out.println(officeValue);
		Book.Builder bookBuilder = new Book.Builder("Nhat ky trong tu", "Ho Chi Minh")
		.genre("2")
		.ISBN("ISBN 0-306-40615-2")
		.publishDate("11-10-1939");
		Book book = bookBuilder.build();
		String value = book.toString();
		System.out.println(value);
	}

}
