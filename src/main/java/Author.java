class Author {
    String firstName, secondName;
    int age;
    Book bestBook;

    public Author(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public Author(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return this.secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getAuthorFullName() {
        return this.firstName + " " + this.secondName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Book getBestBook() {
        return this.bestBook;
    }

    public void setBestBook(Book book) {
        this.bestBook = book;
    }

    public String toString() {
        return "firstName: " + this.firstName + ", secondName: " + this.secondName + ", age: " + this.age;
    }
}