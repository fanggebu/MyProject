package cn.modules.dao;

import cn.modules.domain.Book;
import org.nutz.dao.Dao;
import org.nutz.dao.impl.NutDao;
import org.nutz.dao.impl.SimpleDataSource;
import org.nutz.ioc.loader.annotation.IocBean;

/**
 * @author kangjian
 * @date 2019/8/27
 * @description
 */
@IocBean
public class BookDao {

//    private static Dao dao(){
//        SimpleDataSource dataSource = new SimpleDataSource();
//        dataSource.setJdbcUrl("jdbc:mysql://127.0.0.1/nutzwk");
//        dataSource.setUsername("root");
//        dataSource.setPassword("root");
//
//        Dao dao = new NutDao(dataSource);
//        return dao;
//    }
//
//    public void in(String username) {
//        // 创建一个数据源
//        SimpleDataSource dataSource = new SimpleDataSource();
////        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//        dataSource.setJdbcUrl("jdbc:mysql://127.0.0.1/nutzwk");
//        dataSource.setUsername("root");
//        dataSource.setPassword("root");
//
//// 创建一个NutDao实例,在真实项目中, NutDao通常由ioc托管, 使用注入的方式获得.
//        Dao dao = new NutDao(dataSource);
//
//// 创建表
//        dao.create(Book.class, false); // false的含义是,如果表已经存在,就不要删除重建了.
//
//        Book p = new Book();
//        p.setName("ABC");
//        dao.insert(p);
//    }
}
