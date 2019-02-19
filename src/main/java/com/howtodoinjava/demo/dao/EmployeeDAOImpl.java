/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.howtodoinjava.demo.dao;

import com.howtodoinjava.demo.model.EmployeeVO;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author AJuda
 */
@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

    public EmployeeDAOImpl()
    {
        EmployeeVO vo1 = new EmployeeVO();
        vo1.setId(1);
        vo1.setFirstName("Lokesh");
        vo1.setLastName("Gupta");
        EmployeeVO vo2 = new EmployeeVO();
        vo2.setId(2);
        vo2.setFirstName("Raj");
        vo2.setLastName("Kishore");
        employees.add(vo1);
        employees.add(vo2);
    }
    
    private List<EmployeeVO> employees = new ArrayList<>();
    private EmployeeVO employee = new EmployeeVO();
    
    @Override
    public void addToList(EmployeeVO vo)
    {
        employees.add(vo);
    }
    
    @Override
    public List<EmployeeVO> getAllEmployees() 
    {
        Collections.sort(employees, new Comparator<EmployeeVO>() {
            @Override
            public int compare(EmployeeVO o1, EmployeeVO o2) {
                return o1.getId().compareTo(o2.getId());
            }
        });
        return employees;
    }

    @Override
    public void editEmployeeValue(EmployeeVO vo, String last, String first) 
    {
        vo.setFirstName(first);
        vo.setLastName(last);
    }

    @Override
    public EmployeeVO findEmployeeById(Integer id) 
    {
        employee=null;
        for(int i = 0; i < employees.size(); i++)
        {
            if(employees.get(i).getId() == id)
                employee = employees.get(i);
        }
        return employee;
    }

    @Override
    public void removeFromList(EmployeeVO vo) 
    {
        employees.remove(vo);
    }
    
}
