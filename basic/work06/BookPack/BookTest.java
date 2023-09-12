class BookTest {
	public static void main(String[] args) {
		/*
		BookPack.Book books[] = new BookPack.Book[4];
		books[0] = new BookPack.Book("javascript", "광수", 2005);
		books[1] = new BookPack.Book("CSS", "순자", 2005);
		books[2] = new BookPack.Book("HTML", "정숙", 2005);
		books[3] = new BookPack.Book("React", "영자", 2005);
		*/
		
		BookExt books[] = new BookExt[4];
		books[0] = new BookExt("javascript", "광수", 2005, "에이콘");
		books[1] = new BookExt("CSS", "순자", 2005, "아이티윌");
		books[2] = new BookExt("HTML", "정숙", 2005, "그린");
		books[3] = new BookExt("React", "영자", 2005, "메가스터디");
		for(int i=0; i<books.length; i++){
			books[i].show();
		}
		//books[0].title ="SQL";
	}
}