/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.howtodoinjava.demo.controller;

import com.howtodoinjava.demo.model.EmployeeVO;
import com.howtodoinjava.demo.service.EmployeeManager;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author AJuda
 */
@Controller
public class EmployeeController
{
    @Autowired
    EmployeeManager manager;
    
    private EmployeeVO readEmployee = new EmployeeVO();
    
    @ModelAttribute("user")
    public EmployeeVO formEmployee()
    {
        return new EmployeeVO();
    }
    
    @GetMapping("/")
    public String getAllEmployees(Model model, 
            @ModelAttribute("user") @Valid EmployeeVO employee)
    {
        model.addAttribute("employees", manager.getAllEmployees());
        return "employeesListDisplay";
    }
    
    @PostMapping("/dispEmployee")
    public String getAllEmployees(@RequestParam("CRUDEmployee") String choice)
    {
        switch (choice) 
        {
            case "add":
                return "addEmployee";
            case "edit":
                return "editEmployee";
            case "remove":
                return "removeEmployee";
            default:
                return "redirect:/";
        }
    }
    
    @PostMapping("/changeThisEmployee")
    public String setThisEmployees(@ModelAttribute("user") @Valid EmployeeVO employee)
    {
        manager.editEmployeeValue(readEmployee, employee.getFirstName(), 
                employee.getLastName());
        return "redirect:/";
    }

    @PostMapping("/editThisEmployee")
    public String getThisEmployees(
            @RequestParam("editButton") String myButton,
            @ModelAttribute("user") @Valid EmployeeVO employee)
    {
        readEmployee = manager.findEmployeeById(Integer.parseInt(myButton));
        return "redirect:/editThisEmployee";
    }
    
    @GetMapping("/editThisEmployee")
    public void setEdit(Model model, 
            @ModelAttribute("user") @Valid EmployeeVO employee)
    {
        model.addAttribute("employee", readEmployee);
    }
    
    @PostMapping("/addEmployee")
    public String addMember(@ModelAttribute("user") @Valid EmployeeVO employee)
    {
        if(manager.findEmployeeById(employee.getId())!=null)
        {
             return "idAlreadyExists";
        }
        else
        {
            manager.addToList(employee);
            return "redirect:/";
        }
    }
    
    @PostMapping("/editEmployee")
    public String editMember(@ModelAttribute("user") @Valid EmployeeVO employee)
    {
        if (manager.findEmployeeById(employee.getId())==null)
            return "idNotFound";
        else
        {
            manager.editEmployeeValue(manager.findEmployeeById(employee.getId()),
            employee.getFirstName(), employee.getLastName());
            return "redirect:/";
        }
    }
    
    @PostMapping("/removeEmployee")
    public String removeMember(@ModelAttribute("user") @Valid EmployeeVO employee)
    {
        if (manager.findEmployeeById(employee.getId())==null)
            return "idNotFound";
        else
        {
            manager.removeFromList(manager.findEmployeeById(employee.getId()));
            return "redirect:/";
        }
    }
}