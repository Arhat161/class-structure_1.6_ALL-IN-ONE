class Main {
    public static void main(String[] args) {

        User user1 = new User("Leonardo", "Da Vinchi", 1452, "leodavinchi@gmail.com");
        User user2 = new User("Michelangelo", "di Lodovico di Leonardo di Buonarroti Simoni", 1475, "mikkipizza@yahoo.com");
        User user3 = new User("Raphael", "da Urbino", 1483, "raphbigmaster@mail.ru");
        User user4 = new User("Donatello", "di Niccolò di Betto Bardi", 1386, "donygeek@yandex.ru");

        System.out.println();

        System.out.println("Users online : " + User.totalOnline);

        System.out.println();

        Author author1 = new Author("Брюс", "Эккель");
        Author author2 = new Author("Бхаргава", "Адитья");
        Author author3 = new Author("Гербер", "Шилдт");
        Author author4 = new Author("Моуэт", "Эдриен");

        Book book1 = new Book("Философия Java", author1, 1150, 2022);

        Book book2 = new Book("Грокаем алгоритмы. Иллюстрированное пособие для программистов и любопытствующих", author2, 450, 2019);

        Book book3 = new Book("Java. Полное руководство", author3, 1488, 2018);

        Book book4 = new Book("Использование Docker", author4, 354, 2017);

        System.out.println("Books in library : " + Book.totalBooks);

        System.out.println();

        user1.setReadNowBook(book1);
        user2.setReadNowBook(book2);
        user3.setReadNowBook(book3);
        user4.setReadNowBook(book4);

        System.out.println("User <" + user1.getFullName() + "> now read book '" + user1.getReadNowBook().getName() + "'");

        System.out.println("User <" + user2.getFullName() + "> now read book '" + user2.getReadNowBook().getName() + "'");

        System.out.println("User <" + user3.getFullName() + "> now read book '" + user3.getReadNowBook().getName() + "'");

        System.out.println("User <" + user4.getFullName() + "> now read book '" + user4.getReadNowBook().getName() + "'");

        System.out.println();

        book1.compareBook(book2);

        System.out.println();

        book3.compareBook(book4);

        System.out.println();

        book4.printBook();

        System.out.println();

        Book book5 = new Book("Использование Docker. Издание второе.", author4, 354, 2019);

        book4.compareBook(book5);

        System.out.println();

        System.out.println("toString() demonstration:\n");

        System.out.println(book2.toString());

        System.out.println("bestBook() demonstration:\n");

        Author author5 = new Author("Жюль", "Верн");

        Book book6 = new Book("Дети капитана Гранта", author5);
        Book book7 = new Book("Таинственный остров", author5);
        Book book8 = new Book("20000 лье под водой", author5);
        Book book9 = new Book("Пятнадцатилетний капитан", author5);

        author5.setBestBook(book8);

        System.out.println("Лучшая книга автора <" + author5.getAuthorFullName() + "> несомненно '" + author5.getBestBook().getName() + "' (но это не точно!)");
    }
}