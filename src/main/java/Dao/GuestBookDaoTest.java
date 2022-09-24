package Dao;


import java.util.Date;

import Dto.Guestbook;
import Dto.Log;
import config.ApplicationConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;




public class GuestBookDaoTest{

    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		GuestBookDao guestbookDao = ac.getBean(GuestBookDao.class);

		Guestbook guestbook = new Guestbook();
		guestbook.setName("주동호");
		guestbook.setContent("데이터베이스 테스트");
		guestbook.setRegdate(new Date());
		Long id = guestbookDao.insert(guestbook);
		System.out.println("id : " + id);

//        LogDao logDao = ac.getBean(LogDao.class);
//        Log log = new Log();
//        log.setIp("127.0.0.1");
//        log.setMethod("insert");
//        log.setRegdate(new Date());
//        logDao.insert(log);
    }

}