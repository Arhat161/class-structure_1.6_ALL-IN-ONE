class User {
    String name;
    String surname;
    String email;
    int yearOfBorn;
    static int totalOnline;
    Book readNowBook;

    public User() {
        ++totalOnline;
    }

    public User(String name) {
        this.name = name;
        ++totalOnline;
    }

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
        ++totalOnline;
    }

    public User(String name, String surname, int yearOfBorn, String email) {
        this.name = name;
        this.surname = surname;
        this.yearOfBorn = yearOfBorn;
        this.email = email;
        ++totalOnline;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return this.name + " " + this.surname;
    }

    public Book getReadNowBook() {
        return this.readNowBook;
    }

    public void setReadNowBook(Book book) {
        this.readNowBook = book;
    }

    public String toString() {
        return "name: " + this.name + ", surname: " + this.surname + ", earOfBorn:" + this.yearOfBorn + "г., " + "email: " + this.email;
    }

}