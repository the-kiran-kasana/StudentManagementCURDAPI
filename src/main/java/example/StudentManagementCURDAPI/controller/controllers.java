package example.StudentManagementCURDAPI.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class controllers {

     /**
      * This controller is for returning page the for student details.
      * @return
      */
    @GetMapping("/studentdetails")
    String studentdetails()
    {
        return "StudentDetails";
    } 
}
