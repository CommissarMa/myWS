package com.ma.test;

import com.ma.unit.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by Administrator on 2017/6/17.
 */
@Path("/register")//路径
public class Register{

    @Path("/newuser")//路径
    @POST//Post方法
    @Produces(MediaType.TEXT_PLAIN)//以纯文本方式返回
    public String registerUser(@FormParam("name")String name,@FormParam("pass")String pass){
        if(name==null || pass==null){
            return "lack of parameter";
        }
        else{
            User user=new User();
            user.setName(name);
            user.setPassword(pass);

            //然后可以进行数据库插入该新用户的操作

            //返回注册的结果
            return "User:"+user.getName()+"register success!";
        }

    }

}
