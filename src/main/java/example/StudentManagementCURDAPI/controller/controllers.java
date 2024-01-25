package example.StudentManagementCURDAPI.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
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
