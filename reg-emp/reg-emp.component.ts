import { Component, OnInit } from '@angular/core';
import { EmpService } from './../emp.service';

declare var toastr: any;

@Component({
  selector: 'app-reg-emp',
  templateUrl: './reg-emp.component.html',
  styleUrls: ['./reg-emp.component.css']
})
export class RegEmpComponent implements OnInit {
  customer: any;
  message: string;
  orders: any;
  constructor(private service: EmpService) {
    this.customer = {
        
        c_Fname:'',
        c_Lname:'',
        c_email:'',
        //c_phone:'',
        //address:'',
        password:'',
        
      //order: {orderId: '', orderName: '', location: ''}
        };
  }
  ngOnInit() {
    //this.service.getAllOrders().subscribe( (result: any) => {console.log(result); this.orders = result; });
  }

  registerEmp() {
    console.log(this.customer.orderId);
    this.service.registerEmp(this.customer).subscribe(
      (res) => {
         // console.log('success');
         toastr.success('Reg', 'Registration Success');
      },
      (err) => { this.message = err.error.text;
                // console.log('Register Failure..');
                 toastr.success('Reg', 'Registration Failure');
      }
    );
  }

}


