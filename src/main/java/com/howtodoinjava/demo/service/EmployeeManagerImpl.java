/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.howtodoinjava.demo.service;

import com.howtodoinjava.demo.dao.EmployeeDAO;
import com.howtodoinjava.demo.model.EmployeeVO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author AJuda
 */
@Service
public class EmployeeManagerImpl implements EmployeeManager{

    @Autowired
    EmployeeDAO dao;
    
    @Override
    public List<EmployeeVO> getAllEmployees() 
    {
        return dao.getAllEmployees();
    }

    @Override
    public void addToList(EmployeeVO vo) 
    {
        dao.addToList(vo);
    }

    @Override
    public void editEmployeeValue(EmployeeVO vo, String last, String first) 
    {
        dao.editEmployeeValue(vo, last, first);
    }

    @Override
    public EmployeeVO findEmployeeById(Integer id) 
    {
        return dao.findEmployeeById(id);
    }

    @Override
    public void removeFromList(EmployeeVO vo) 
    {
        dao.removeFromList(vo);
    }
    
}
