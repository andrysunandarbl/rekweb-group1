/**
 * IAM-Soft, Proprietary Software Cloud Communications
 *  Copyright (c) 2015, IAM-Software and individual contributors
 *  by the @authors tag.
 *
 *  This program is Proprietary Software: you can not redistribute it and/or modify
 *  without license from IAM-Software.
 *
 *  Website : http://www.iam-software.com/
 *  Report bugs to <techsupport@iam-software.com>.
 *  Copyright (C) 2015 PT. IAM-Software. All rights reserved.
 */
package com.bl.rekweb.group1;

/**
 * Author andry on 09/06/15.
 */
public class AppMain {
    
    public void createForm(){
        
        //create new registration form
        RegistrationForm myForm = new RegistrationForm();
        myForm.setId("23/SH/2015");
        myForm.setType(1);
        myForm.setName("Dude");
        myForm.setAddress("Cipulir");
        myForm.setGrade("1");
        myForm.setPhone("08124343434");
        
        //create new report
        Report report = new Report();
        report.setRekayasaWeb('A');
        report.setDasarPemrogramanWeb('B');
        myForm.setReport(report);
        System.out.println(myForm);        
    }

    public static void main(String[] args) {
        AppMain appMain = new AppMain();
        appMain.createForm();
    }
}