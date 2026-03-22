
package com.mycompany.nulibrarysystem;

//Model
public class StudentInfoModel {
  String firstName;
  String lastName;
  String studentNum; 
  String phoneNum; 
  String username;
  String email;
  String password; 
  String confirmPass; 

    public StudentInfoModel(String firstName, String lastName, String studentNum, String phoneNum, String username, String Email, String password, String confirmPass) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentNum = studentNum;
        this.phoneNum = phoneNum;
        this.username = username;
        this. email = email;
        this.password = password;
        this.confirmPass = confirmPass;
    }
         
}
