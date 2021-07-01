package com.jspiders.encapsulation;

class User
{
	//security
	private int id;//
	private String name;//write read
	private String email;//write read
	private long mob;//write read
	
	public User(int id, String name, String email, long mob)
	{
		this.id = id;
		this.name = name;
		this.email = email;
		this.mob = mob;
	}
	
	public String getName()//read
	{
		return this.name;
	}
	
	public void setName(String name)//Update
	{
		this.name = name;	
	}
	
	public String getEmail()//read
	{
		return this.email;
	}
	
	public void setEmail(String email)//Update
	{
		this.email = email;	
	}
	
	public long getMob()//read
	{
		return this.mob;
	}
	
	public void setMob(long mob)//Update
	{
		this.mob = mob;	
	}
}


class UserService
{
	static int id=1;
	static User u1 = null;
	
	public static void signup(String name,String email,long mob)
	{
		u1 = new User(id, name, email, mob);
		id++;
		//save data to DB
	}
	
	public void updateName(String name,String email,String newName)
	{
		//update DB with newName
		u1.setName(newName);
		System.out.println("name updated");
	}
	
	public static void updateEmail(String email,String newEmail)
	{
		//update DB with newName
		u1.setEmail(newEmail);
		System.out.println("email updated");
	}
	
	public static void showProfile()
	{
		System.out.println(u1.getName());
		System.out.println(u1.getEmail());
		System.out.println(u1.getMob());
	}
}

public class Mainclass 
{

	public static void main(String[] args)
	{
      System.out.println("Program starts...");
    
      UserService.signup("Ajay", "ajay@gmail.com", 12345669821l);
      UserService.showProfile();
      
	}

}






