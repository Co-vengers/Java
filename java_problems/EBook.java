class LibrarySystem{
	String title;
	String author;

	LibrarySystem(String title, String author){
		this.title = title;
		this.author = author;
	}

	void describe(){
		System.out.println("Title: " + this.title + " by " + this.author);
	}
}

class EBook extends LibrarySystem{
	float file_size;

	EBook(String title, String author, float file_size){
		super(title, author);
		this.file_size = file_size;
	}

	void describe(){
		System.out.println(
            "Title: " + title + " by " + author + " (file size: " + file_size + "MB)"
        );
	}

	public static void main(String[] args){
		LibrarySystem paper_book = new LibrarySystem("1984", "George Orwell");
		paper_book.describe();

		EBook ebook = new EBook("1984", "George Orwell", 98);
		ebook.describe();
	}
}