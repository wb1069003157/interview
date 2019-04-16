package com.jrookie.service.exception;

/**
 * @Author: JRookie
 * @Description:
 * @Date: Create in 下午4:58 19-4-10
 */
public class Main {


    public static void main(String[] args) throws Exception {

        User user = new User();
        user= printI();
        System.out.println("i:  "+user);

    }
    private static User printI() {
       User user =new User();

        try {
            user.setName("try");
            System.out.println("try i:" + user.getName());
            throw new Exception();
        }
        catch (Exception e){
//            i = 1;
//            System.out.println("catch");
            user.setName("catch");
            System.out.println("catch i:" + user.getName());
            return user;
        }
        finally {
//            i=4;
//            System.out.println("finally");
            user.setName("finally");
            System.out.println("finally i:" + user.getName());
        }
    }


}
