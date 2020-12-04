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
@MapperScan(basePackages ={"com.example.demo.db.wx"}, sqlSessionFactoryRef = "sqlSessionFactoryWx")
public class MybatisWxDbConfig {

    @Autowired
    @Qualifier("wx")
    private DataSource wx;

    @Bean
    public SqlSessionFactory sqlSessionFactoryWx() throws Exception{
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(wx);
        return factoryBean.getObject();
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplateWx() throws Exception{
        SqlSessionTemplate template = new SqlSessionTemplate(sqlSessionFactoryWx());
        return template;
    }
}
