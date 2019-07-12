package com.yumeiqi.configration;

import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

/**
 * @author ZHangYJ
 */
@Configuration
@MapperScan(basePackages = "com.yumeiqi.dao", sqlSessionTemplateRef = "yumeiqiTemplate")
public class YumeiqiDataSourceConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.yumeiqi")
    public DataSource dataSourceYumeiqi() {
        return DataSourceBuilder.create().type(HikariDataSource.class).build();
    }

    @Bean(name = "yumeiqiSqlSessionFactory")
    @Primary
    public SqlSessionFactory yumeiqiSqlSessionFactory() throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSourceYumeiqi());
        bean.setConfigLocation(new PathMatchingResourcePatternResolver().getResource("classpath:mybatis/mybatis-yumeiqi-config.xml"));
        return bean.getObject();
    }

    @Bean(name = "yumeiqiTemplate")
    public SqlSessionTemplate yumeiqiTemplate() throws Exception {
        return new SqlSessionTemplate(yumeiqiSqlSessionFactory());
    }
}
