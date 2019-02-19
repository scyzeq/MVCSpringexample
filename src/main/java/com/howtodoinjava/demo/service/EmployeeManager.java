/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.howtodoinjava.demo.service;

import com.howtodoinjava.demo.model.EmployeeVO;
import java.util.List;

/**
 *
 * @author AJuda
 */
public interface EmployeeManager
{
    public List<EmployeeVO> getAllEmployees();
    
    public void addToList(EmployeeVO vo);
    
    public void removeFromList(EmployeeVO vo);
    
    public void editEmployeeValue(EmployeeVO vo, String last, String first);
    
    public EmployeeVO findEmployeeById(Integer id);
}
