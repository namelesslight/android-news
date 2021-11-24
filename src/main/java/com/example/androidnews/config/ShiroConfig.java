package com.example.androidnews.config;

import com.example.androidnews.filter.JwtFilter;
import com.example.androidnews.realm.LoginRealm;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class ShiroConfig {
    @Bean(name = "shiroFilterFactoryBean")
    public ShiroFilterFactoryBean shiroFilterFactoryBean(@Qualifier("manager") DefaultWebSecurityManager manager){
        ShiroFilterFactoryBean factoryBean=new ShiroFilterFactoryBean();
        Map<String, Filter> filterMap = new HashMap<>();
        filterMap.put("jwt",new JwtFilter());
        factoryBean.setFilters(filterMap);
        factoryBean.setSecurityManager(manager);
        factoryBean.setUnauthorizedUrl("path/error");
        Map<String,String>filterRuleMap =new HashMap<>();
        //设置需要拦截的请求
        filterRuleMap.put("/**","jwt");
        //不需要拦截的请求
        filterRuleMap.put("/base/**","anon");
        filterRuleMap.put("/users/**","authc");
        filterRuleMap.put("/admin/**","authc");
        factoryBean.setFilterChainDefinitionMap(filterRuleMap);
        return factoryBean;
    }

    @Bean(name = "manager")
    public DefaultWebSecurityManager manager(@Qualifier("loginRealm")LoginRealm loginRealm){
        DefaultWebSecurityManager manager=new DefaultWebSecurityManager();
        manager.setRealm(loginRealm);
        return manager;
    }

    @Bean(name = "loginRealm")
    public LoginRealm verifyRealm(){
        LoginRealm loginRealm=new LoginRealm();
        return loginRealm;
    }
}
