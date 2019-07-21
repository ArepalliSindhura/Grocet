import { Component, OnInit } from '@angular/core';
import { EmpService } from '../emp.service';

@Component({
  selector: 'app-bheader',
  templateUrl: './bheader.component.html',
  styleUrls: ['./bheader.component.css']
})
export class BheaderComponent implements OnInit {
  items = [];
 products = [];retrievedData : any;
 user : any;
  constructor(private service : EmpService) {
    this.retrievedData = localStorage.getItem('user');
    this.user = JSON.parse(this.retrievedData);
    console.log(this.user);
   }
  ngOnInit() {
    this.service.getToCart().subscribe(product => this.products.push(product));
    this.service.setCart(this.products);
    console.log(this.products);
  }

  logout(){
    this.service.setUserLoggedOut();
  }

}
