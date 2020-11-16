package com.zxr.test;

import com.zxr.dao.IUserDao;
import com.zxr.io.Resources;
import com.zxr.mapper.UserMapper;
import com.zxr.pojo.User;
import com.zxr.sqlSession.SqlSession;
import com.zxr.sqlSession.SqlSessionFactory;
import com.zxr.sqlSession.SqlSessionFactoryBuilder;
import org.dom4j.DocumentException;
import org.junit.Before;
import org.junit.Test;

import java.beans.PropertyVetoException;
import java.io.InputStream;
import java.util.List;

/**
 * @author zhaoxiangrui
 * @date 2020/11/8 20:03
 */
public class IPersistenceTest {
    UserMapper userMapper;

    @Before
    public void before() throws PropertyVetoException, DocumentException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        userMapper = sqlSession.getMapper(UserMapper.class);
    }

    @Test
    public  void selectTest() {
        List<User> allUser = userMapper.findAll();
        allUser.forEach(System.out::println);
    }

    @Test
    public void insertTest(){
        User user = new User();
        user.setUsername("mybatis");
        user.setId(20);
        Integer insert = userMapper.insert(user);
        System.out.println(insert);
    }

    @Test
    public void updateTest(){
        User user = new User();
        user.setId(20);
        user.setUsername("MP");
        Integer integer = userMapper.updateById(user);
        System.out.println(integer);
    }

    @Test
    public void deleteTest(){
        User user = new User();
        user.setId(20);
        Integer integer = userMapper.deleteById(user);
        System.out.println(integer);
    }

}
