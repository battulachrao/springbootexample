package com.javatpoint.server.main.user;
import java.util.*;

import org.springframework.stereotype.Component;
@Component
public class UserServiceDao {
	public static int uc=5;
	private static List<User> users=new ArrayList<>();
	static {
		users.add(new User(1,"chandu",new Date()));
		users.add(new User(2,"teja",new Date()) );
		users.add(new User(3,"tarun",new Date()) );
		users.add(new User(4,"Venkat",new Date()) );
		users.add(new User(5,"csr",new Date()) );
		
	}
	public List<User> findAll(){
		return users;
	}
	public User save(User user)  
	{  
	if(user.getId()==0)  
	{  
	//increments the user id  
	user.setId(++uc);  
	}  
	users.add(user);  
	return user;  
	} 
	public User findOne(int id)  
	{  
	for(User user:users)  
	{  
	if(user.getId()==id)  
	return user;  
	}  
	return null;  
	}
	
	

}


/* 
public class UserDaoService   
{  
public static int usersCount=5;  
//creating an instance of ArrayList  
private static List<User> users=new ArrayList<>();  
//static block   
static  
{  
//adding users to the list  
users.add(new User(1, "John", new Date()));  
users.add(new User(2, "Robert", new Date()));  
users.add(new User(3, "Adam", new Date()));  
users.add(new User(4, "Andrew", new Date()));  
users.add(new User(5, "Jack", new Date()));  
}  
//method that retrieve all users from the list  
public List<User> findAll()  
{  
return users;  
}  
//method that add the user in the list   
public User save(User user)  
{  
if(user.getId()==null)  
{  
//increments the user id  
user.setId(++usersCount);  
}  
users.add(user);  
return user;  
}  
//method that find a particular user from the list  
public User findOne(int id)  
{  
for(User user:users)  
{  
if(user.getId()==id)  
return user;  
}  
return null;  
}  
} */
