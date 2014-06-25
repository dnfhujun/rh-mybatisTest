/**
* 文件名：Company.java
* 创建日期： 2014年6月25日
* 作者：     Administrator
* Copyright (c) 2009-2011 无线开发室
* All rights reserved.
 
* 修改记录：
* 	1.修改时间：2014年6月25日
*   修改人：Administrator
*   修改内容：
*/
package com.hujun.mybatis.bean;

/**
 * 功能描述：
 *
 */
public class Company
{
    private String name;
    private String address;
    private String mobile;
    private String emailAddress;
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getAddress()
    {
        return address;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
    public String getMobile()
    {
        return mobile;
    }
    public void setMobile(String mobile)
    {
        this.mobile = mobile;
    }
    public String getEmailAddress()
    {
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress)
    {
        this.emailAddress = emailAddress;
    }
    @Override
    public String toString()
    {
        return "Company [name=" + name + ", address=" + address + ", mobile="
            + mobile + ", emailAddress=" + emailAddress + "]";
    }
    
    
}
