class Book {
    String name, shortDescription;
    int numberOfPages, year;
    Author author;
    static int totalBooks;

    public Book(String name) {
        this.name = name;
        ++totalBooks;
    }

    public Book(String name, Author author) {
        this.name = name;
        this.author = author;
        ++totalBooks;
    }

    public Book(String name, Author author, int numberOfPages, int year) {
        this.name = name;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.year = year;
        ++totalBooks;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return this.numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void printBook() {
        System.out.println("Wait...");
        System.out.println("Printing book '" + this.name + "' ...");
        System.out.println("Done.");
    }

    public String toString() {
        return "name: " + this.name + ", shortdescription: " + this.shortDescription + ", numberOfPages: " + this.numberOfPages + ", year: " + this.year;
    }

    public void compareBook(Book book) {
        String compareNames, compareAuthors, comparePages, compareYears;

        System.out.println("Результаты сравнения книг:");

        if (this.name.equals(book.name)) {
            compareNames = "Названия книг совпадают!";
        } else {
            compareNames = "Названия книг разные: " + "'" + this.name + "' и '" + book.name + "'";
        }

        System.out.println(compareNames);

        String authorOneFullName = this.author.getAuthorFullName();
        String authorTwoFullName = book.author.getAuthorFullName();

        if (authorOneFullName.equals(authorTwoFullName)) {
            compareAuthors = "У обоих книг один и тот же автор!";
        } else {
            compareAuthors = "Авторы книг разные:" + "'" + authorOneFullName + "' и '" + authorTwoFullName + "'";
        }

        System.out.println(compareAuthors);

        if (this.numberOfPages == book.numberOfPages) {
            comparePages = "Количество страниц в книгах одинаковое!";
        } else {
            comparePages = "Число страниц в книгах разное: " + "'" + this.numberOfPages + "' и '" + book.numberOfPages + "'";
        }

        System.out.println(comparePages);

        if (this.year == book.year) {
            compareYears = "Год выпуска книг совпадает!";
        } else {
            compareYears = "Год выпуска книг различается: " + "'" + this.year + "' и '" + book.year + "'";
        }

        System.out.println(compareYears);
    }
}