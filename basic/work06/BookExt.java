class BookExt extends BookPack.Book{
	protected String publisher;
	BookExt(String t, String a, int d, String p){
			super(t, a, d);
			publisher = p;
	}
	
	public void show() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(pubDate);
		System.out.println(publisher);
		System.out.println("************************");
	}
}