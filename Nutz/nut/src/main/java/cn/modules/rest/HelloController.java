package cn.modules.rest;

import cn.modules.domain.Book;
import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import cn.modules.service.BookService;

@IocBean
public class HelloController {

    @Inject
    private BookService bookService;

    @At("/hello")
    @Ok("jsp:/index.jsp")
    public String hello(){
        return "hello nutz";
    }

    @At("/loginPage")
    @Ok("jsp:/templates/login.jsp")
    public String loginPage(){
        return "hello nutz";
    }

    @At("/doLogin")
    @Ok("jsp:/templates/index.jsp")
    public String login(String username,String password){
        Book book = new Book();
        book.setName(username);
        bookService.dao().insert(book);
        return "success";
    }
}
