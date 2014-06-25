/**
* 文件名：SqlMapClientFactory.java
* 创建日期： 2014年6月25日
* 作者：     Administrator
* Copyright (c) 2009-2011 无线开发室
* All rights reserved.
 
* 修改记录：
* 	1.修改时间：2014年6月25日
*   修改人：Administrator
*   修改内容：
*/
package com.hujun.mybatis.dao;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * 功能描述：
 *
 */
public class SqlMapClientFactory
{
    private static volatile SqlSessionFactory sqlSessionFactory ;
    
    
    public static SqlSessionFactory getInstance()
    {
        if(null == sqlSessionFactory)
        {
            synchronized (SqlMapClientFactory.class)
            {
                if(null == sqlSessionFactory)
                {
                    String resource = "mybatis-config.xml";
                    InputStream inputStream = null;
                    try
                    {
                        inputStream = Resources.getResourceAsStream(resource);
                    }
                    catch (IOException e)
                    {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
                }
            }
        }
        return sqlSessionFactory;
    }
}
