package com.bootcamp.jpa_assignment_3;

import com.bootcamp.jpa_assignment_3.entity.Address;
import com.bootcamp.jpa_assignment_3.entity.Author;
import com.bootcamp.jpa_assignment_3.entity.Book;
import com.bootcamp.jpa_assignment_3.repository.AuthorRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootTest
class JpaAssignment3ApplicationTests {

	@Autowired
	private AuthorRepo authorRepo;

	// Q4. Persist 3 subjects for each author.
	@Test
	void question4() {
		Author author = new Author();
		author.setName("Shashank");

		Address address = new Address();
		address.setStreetNumber("07");
		address.setLocation("Govindpuri");
		address.setState("Delhi");
		author.setAddress(address);

		author.setSubjects(List.of("Physics", "Philosophy", "Mathematics"));
		authorRepo.save(author);
	}

	@Test
	void question6() {
		Author author = new Author();
		author.setName("Shashank");

		Address address = new Address();
		address.setStreetNumber("07");
		address.setLocation("Govindpuri");
		address.setState("Delhi");
		author.setAddress(address);

		author.setSubjects(List.of("Physics", "Philosophy", "Mathematics"));

//		Book book = new Book();
//		book.setBookName("Harry Potter");
//		book.setAuthor(author);

//		author.setBook(book);
		authorRepo.save(author);
	}

	@Test
	void question7() {
		Author author = new Author();
		author.setName("Shashank");

		Address address = new Address();
		address.setStreetNumber("07");
		address.setLocation("Govindpuri");
		address.setState("Delhi");
		author.setAddress(address);

		author.setSubjects(List.of("Physics", "Philosophy", "Mathematics"));

		Book book1 = new Book();
		book1.setBookName("Harry Potter");

		Book book2 = new Book();
		book2.setBookName("Atomic Habits");

//		book1.setAuthor(author);
//		book2.setAuthor(author);
//
//		author.setBook(Set.of(book1, book2));

		authorRepo.save(author);
	}

	@Test
	void question8() {
		Author author = new Author();
		author.setName("Shashank");

		Address address = new Address();
		address.setStreetNumber("07");
		address.setLocation("Govindpuri");
		address.setState("Delhi");
		author.setAddress(address);

		author.setSubjects(new ArrayList<>(List.of("Physics", "Philosophy", "Mathematics")));

		Book book1 = new Book();
		book1.setBookName("Harry Potter");

		Book book2 = new Book();
		book2.setBookName("Atomic Habits");

		Set<Book> books = new HashSet<>(Set.of(book1, book2));
		author.setBook(books);

		book1.setAuthor(Set.of(author));
		book2.setAuthor(Set.of(author));

		authorRepo.save(author);
	}

	/* Q9. Which method on the session object can be used to remove an object from the cache?

		**** evict() and clear() method ******* is used to remove object from the cache
		Note : both the method applies on L1 caching

		evict() method --> entity as parameter and removes specific entity from the cache
		clear() method --> clear all the entities from the L1 or session cache
		 Or close the session it will also clear the cache
	 */

	/*
		Q10. What does @transactional annotation do?

		@Transactional annotation
			1. Ensures the ACID properties,  this annotation ensures that while rollback or commit my database is consistent.
					It has different Isolation levels to handle inconsistency where read or write operations
			2. If I annotate any method with @Transactional if ensure that Hibernate session doesn't close for that critical
			   section despite being ideal for longer duration.
	 */
}
