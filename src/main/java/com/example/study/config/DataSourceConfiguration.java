package com.example.study.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @author: taotao
 * @date: 2019/9/3 16:54
 * @description:
 */
@Slf4j
@MapperScan(basePackages = {"com.example.study.dao.*"}, sqlSessionTemplateRef = "sqlSessionTemplate")
public class DataSourceConfiguration {

    @Autowired
    private DataSourceConfig dataSourceConfig;

    @Primary
    @Bean("dataSource")
    public DataSource dataSource() {
        log.info("数据库连接初始化->开始");
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(dataSourceConfig.getUrl());
        dataSource.setUsername(dataSourceConfig.getUsername());
        dataSource.setPassword(dataSourceConfig.getPassword());
        dataSource.setDriverClassName(dataSourceConfig.getDriverClassName());

        dataSource.setInitialSize(dataSourceConfig.getInitialSize());
        dataSource.setMinIdle(dataSourceConfig.getMinIdle());
        dataSource.setMaxActive(dataSourceConfig.getMaxActive());
        dataSource.setMaxWait(dataSourceConfig.getMaxWait());

        log.info("数据库连接初始化->结束.dataSource:{}", dataSource);
        return dataSource;
    }


    @Bean(name = "dataSourceTransactionManager")
    @Primary
    public DataSourceTransactionManager transactionManager(@Qualifier("dataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "sqlSessionFactory")
    @Primary
    public SqlSessionFactory sqlSessionFactory(@Qualifier("dataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:map/*/*.xml"));
        return sqlSessionFactoryBean.getObject();
    }


    @Bean(name = "sqlSessionTemplate")
    @Primary
    public SqlSessionTemplate sqlSessionTemplate(@Qualifier("sqlSessionFactory") SqlSessionFactory
                                                         sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}
