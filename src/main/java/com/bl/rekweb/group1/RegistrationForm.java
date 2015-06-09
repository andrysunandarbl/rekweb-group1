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
 * Author andry on 10/06/15.
 */
public class RegistrationForm extends Form {
    private String name;
    private String grade;
    private String Address;
    private String phone;
    private Report Report;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Report getReport() {
        return Report;
    }

    public void setReport(Report report) {
        Report = report;
    }

    @Override
    public String toString() {
        return "RegistrationForm{" +
                "id='" + getId() + '\'' +
                "type='" + getType() + '\'' +
                "name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", Address='" + Address + '\'' +
                ", phone='" + phone + '\'' +
                ", Report='" + Report + '\'' +
                '}';
    }
}
