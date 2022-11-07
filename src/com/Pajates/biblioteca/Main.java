package com.Pajates.biblioteca;


public class Main {
    public static void main(String[] args) {

        //Libro
        Book book = new Book();
        book.setIsbn(1);
        book.setAuthor("Alfredo");
        book.setName("Fantasmas");
        book.setGenre("Terror");
        book.setDate("3/5/1998");
        System.out.println(book.getIsbn());
        System.out.println(book.getAuthor());
        System.out.println(book.getName());
        System.out.println(book.getGenre());
        System.out.println(book.getDate());

        //Autor
        Author author = new Author();
        author.setName("Pepe");
        author.setSurname("Jimenez");
        author.setTown("Alcala");
        author.setBirthdate("15/4/1981");
        System.out.println(author.getName());
        System.out.println(author.getSurname());
        System.out.println(author.getTown());
        System.out.println(author.getBirthdate());

        //Genero
        Genre genre = new Genre();
        genre.setId(1);
        genre.setName("Terror");
        genre.setDescription("Cosas de miedo");
        System.out.println(genre.getName());
        System.out.println(genre.getId());
        System.out.println(genre.getDescription());

        //Usuario
        User user = new User();
        user.setName("Antonio");
        user.setSurname("Perez");
        user.setDni("71234567F");
        user.setAddress("Calle Plaza Nº 7");
        user.setPhone(612312312);
        System.out.println(user.getName());
        System.out.println(user.getSurname());
        System.out.println(user.getDni());
        System.out.println(user.getAddress());
        System.out.println(user.getPhone());

//Prestamo
        Prestamo loan = new Prestamo();
        loan.setFechapres("10/2/2021");
        loan.setFechadev("20/3/2021");
        System.out.println(loan.getFechapres());
        System.out.println(loan.getFechadev());
    }
}

