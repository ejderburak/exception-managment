package com.burakejder.starter;

import com.burakejder.dto.DtoEmployee;
import com.burakejder.service.IEmployeeService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest(classes = {ExceptionManagementStarterApplication.class})
class ExceptionManagementApplicationTests {

	// direkt servise e bağlanabiliriz controllera bağlanmaya gerek yok
	@Autowired
	private IEmployeeService employeeService;

	@Test
	public void testFindEmployeeById() {
		DtoEmployee employee =  employeeService.findEmployeeById(1L);
		if(employee != null ){
			System.out.println("İsim : " + employee.getName());
		}
	}

}
