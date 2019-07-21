import { Component, OnInit } from '@angular/core';
import { EmpService } from './../emp.service';
import { Router } from '@angular/router';

declare var toastr: any;
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  user: any;
  employee: any;

  constructor(private router: Router, private service: EmpService) {
      this.user = {loginId: '', password: ''};
  }

  ngOnInit() {
  }

  async validateUser(loginForm: any) {
    console.log('Inside validateUser', loginForm.loginId, loginForm.password);
    if (loginForm.c_email === 'admin'  && loginForm.password === 'admin') {
      this.service.setUserLoggedIn();
      this.router.navigate(['homepage']);
    } else {
    await this.service.getEmpByUserPass(loginForm.c_email, loginForm.password).then((data: any) => {
      if (data != null) {
        
      this.service.setUserLoggedIn();
      localStorage.setItem('user', JSON.stringify(data));
      this.router.navigate(['homepage']);
      toastr.success('Login', 'Login Success');
    } else {
      toastr.success('Login', 'Login Failure');
    }
       },
       (error) => {
        toastr.success('Login', 'Login Failure');
        // this.router.navigate(['products']);
         });
     }
}
}
