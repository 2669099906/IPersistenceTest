package com.zxr.test;

import com.zxr.dao.IUserDao;
import com.zxr.io.Resources;
import com.zxr.pojo.User;
import com.zxr.sqlSession.SqlSession;
import com.zxr.sqlSession.SqlSessionFactory;
import com.zxr.sqlSession.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

/**
 * @author zhaoxiangrui
 * @date 2020/11/8 20:03
 */
public class IPersistenceTest {

    public static void main(String[] args) throws Exception {
        InputStream resourceAsStream = Resources.getResourceAsStream("./sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = new User();
        user.setId(1);
        user.setUsername("张三");
//        User userResult = (User)sqlSession.selectOne("user.selectOne", user);
//        System.out.println(userResult.toString());
//        List<User> objects = sqlSession.selectList("user.selectList");
//        System.out.println(objects);
//        UserDaoImpl userDao = new UserDaoImpl();
//        List<User> all = userDao.findAll();
//        System.out.println(all);
//        User byCondition = userDao.findByCondition(user);
//        System.out.println(byCondition);
        IUserDao mapper = sqlSession.getMapper(IUserDao.class);
        List<User> all = mapper.findAll();
        User byCondition = mapper.findByCondition(user);
        System.out.println(all);
        System.out.println(byCondition);
    }

}
