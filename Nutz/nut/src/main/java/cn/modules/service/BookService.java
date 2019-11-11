package cn.modules.service;

import cn.modules.domain.Book;
import org.nutz.dao.Dao;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.service.EntityService;

/**
 * @author kangjian
 * @date 2019/8/27
 * @description
 */
@IocBean(args = {"refer:dao"})
public class BookService extends EntityService<Book> {
    public BookService(Dao dao) {
        super(dao);
    }
}
