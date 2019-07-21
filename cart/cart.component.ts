import { Component, OnInit } from '@angular/core';
import { EmpService } from '../emp.service';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {
  products = [];

  constructor(private service : EmpService) { }

  ngOnInit() {
    this.products = this.service.getCart();
  }

}
