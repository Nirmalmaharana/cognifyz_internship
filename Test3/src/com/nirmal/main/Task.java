package com.nirmal.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task 
{
	private List<String> taskList=new ArrayList<String>();
	private static Scanner sc=new Scanner(System.in);
	
	public  static void main(String[] args)
	{
		Task task=new Task();
		System.out.println("=========Wellcome to TaskList========");
		while(true)
		{
			System.out.println("---------------------------------------");
			System.out.println("1. Create TaskList\n2. Update Task\n3. Delete Task\n4. Add TaskList With Existing TaskList\n5. Show All Task\n6. Delete TaskList\n7. Exit ");
			System.out.print("choice :: ");
			int choice=Integer.parseInt(sc.nextLine());
			switch(choice)
			{
			case 1:
				System.out.println(task.createTaskList());
				break;
			case 2:
				System.out.println("Enter Task For Update :");
				String newTaskforUpdate=sc.nextLine();
				System.out.println(task.updateTask(newTaskforUpdate));
				break;
			case 3:
				System.out.println("Enter Task For Delete:");
				String newTaskforDelete=sc.nextLine();
				System.out.println(task.deleteTask(newTaskforDelete));
				break;
			case 4:
				System.out.println("Enter Number Of Task :");
				int count=Integer.parseInt(sc.nextLine());
				List<String> newList=new ArrayList<String>();
				for(int i=0;i<count;i++)
				{
					System.out.println("Enter Task : ");
					String newTask=sc.nextLine();
					newList.add(newTask);
				}
				System.out.println(task.addTaskList(newList));
				break;
			case 5:
				task.showAllTask();
				break;
			case 6:
				task.deleteAllTask();
				System.out.println("All Task Deleted Successfully");
				break;
			case 7:
				System.exit(0);
				break;
				default :
					System.out.println("Please Provide a Valid Choice");
			}
		}
	}
	
	public String  createTaskList()
	{
		System.out.println("Enter How many Task is There ?");
		int count=Integer.parseInt(sc.nextLine());
		for(int i=0;i<count;i++)
		{
			System.out.println("Enter Task : ");
			String task=sc.nextLine();
			taskList.add(task);
		}
		return count+" Tasks Are Added to The List";
	}
	
	public String deleteTask(String task)
	{
		if(task==null || task.equals("") )
		{
			throw new IllegalArgumentException("Invalid Task"); 
		}
		
		if(this.taskList.contains(task))
		{
			taskList.remove(task);
			return task+" task is Delete Successfully ";
		}
		return task +" task is Not Found From Task List";
		
	}
	
	public String updateTask(String task)
	{
		if(task==null || task.equals("") )
		{
			throw new IllegalArgumentException("Invalid Task"); 
		}
		this.taskList.add(task);
		return "Task List Updated With the new Task :"+task;
	}
	public String  addTaskList(List<String> taskList)
	{
		this.taskList.addAll(taskList);
		return "Tasks are Added To TaskList";
	}
	public void showAllTask()
	{
		int size=this.taskList.size();
		//System.out.println(size);
		if(size==0)
		{
			System.out.println("No Task is There ....");
		}
		else
		{
			this.taskList.forEach(System.out::println);
		}
		
	}
	public void deleteAllTask()
	{
		this.taskList.clear();
		System.out.println("Delete all Tasks From List");
	}

}
