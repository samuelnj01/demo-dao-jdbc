package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		/*System.out.println("=== Test 1 department insert ===");
		Department newDepartment = new Department(null, "Music");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());*/
		
		System.out.println("=== TEST 2: department findById ====");
		Department department = departmentDao.findById(3);
		System.out.println(department);
		
		System.out.println("=== TEST 3: department update ====");
		Department department2 = departmentDao.findById(6);
		department.setName("furniture");
		departmentDao.update(department2);
		System.out.println("Update completed");
		
		/*System.out.println("=== TEST 4: department delete ====");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed!");*/
		
		System.out.println("=== TEST 5: department findAll ====");
		List<Department> list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}
		
		sc.close();
	}

}
