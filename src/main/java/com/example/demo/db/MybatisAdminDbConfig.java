package com.example.demo.db;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages ={"com.example.demo.db.admin"}, sqlSessionFactoryRef = "sqlSessionFactoryAdmin")
public class MybatisAdminDbConfig {

    @Autowired
    @Qualifier("admin")
    private DataSource admin;

    @Bean
    public SqlSessionFactory sqlSessionFactoryAdmin() throws Exception{
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(admin);
        return factoryBean.getObject();
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplateAdmin() throws Exception{
        SqlSessionTemplate template = new SqlSessionTemplate(sqlSessionFactoryAdmin());
        return template;
    }
}
