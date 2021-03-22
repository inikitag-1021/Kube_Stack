/*package com.book;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureDataJpa;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.web.servlet.MockMvc;

import com.book.entity.Book;
import com.book.repository.BookRepository;

@DataJpaTest
@AutoConfigureDataJpa
class BookApplicationTests {

	@Autowired
	private BookRepository bookRepository;
	
	@Test
	public void addBookTest() {
		
		Book book=new Book();
		book.setId(1);
		book.setName("Nikita");
		Book savedBook= bookRepository.save(book);
		assertNotNull(savedBook);
	}
}
*/