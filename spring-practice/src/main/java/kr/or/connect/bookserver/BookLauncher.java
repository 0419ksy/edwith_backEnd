package kr.or.connect.bookserver;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.or.connect.bookserver.persistence.BookDao;
import kr.or.connect.domain.Book;

public class BookLauncher {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		BookDao dao = context.getBean(BookDao.class);
//		int count = dao.countBooks();
//		System.out.println(count);
//		Book book = dao.selectById(1);
//		System.out.println(book);
//		
		Book book2 = new Book("¼¼¹øÂ° test", "±è±è±è", 5);
		Integer newId = dao.insert(book2);
		System.out.println("newId : " + newId);
		System.out.println(dao.selectById(newId));
		
		context.close();
	}

}
