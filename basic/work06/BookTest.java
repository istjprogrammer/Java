class BookTest {
	public static void main(String[] args) {
		BookPack.Book books[] = new BookPack.Book[4];
		books[0] = new BookPack.Book("javascript", "����", 2005);
		books[1] = new BookPack.Book("CSS", "����", 2005);
		books[2] = new BookPack.Book("HTML", "����", 2005);
		books[3] = new BookPack.Book("React", "����", 2005);
		
		for(int i=0; i<books.length; i++){
			books[i].show();
		}
	}
}