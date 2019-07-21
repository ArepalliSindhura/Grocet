import { Component, OnInit } from '@angular/core';
import { EmpService } from '../emp.service';

@Component({
  selector: 'app-homekitchen',
  templateUrl: './homekitchen.component.html',
  styleUrls: ['./homekitchen.component.css']
})
export class HomekitchenComponent implements OnInit {
  products: any;
  constructor(private service: EmpService) { }

  ngOnInit() {
    this.products = [
    {name: 'Onion/Vulligadda/ Ullipaya', category: 'Fresho', OriginalPrice :15,
    FinalPrice: 12, imagePath: 'assets/Images/onion.jpg'},
    {name: 'Tomato - Local', category: 'Fresho', OriginalPrice :35,
    FinalPrice: 28, imagePath: 'assets/Images/tomato.jpg'},
    {name: 'Onion', category: 'Fresho', OriginalPrice :52,
    FinalPrice: 42, imagePath: 'assets/Images/onionOrganic.jpg'},
    {name: 'Potato/Alugadda', category: 'Fresho', OriginalPrice :52,
    FinalPrice: 42, imagePath: 'assets/Images/potato.jpg'},
    {name: 'Tomato - Hybrid/Bengaluru Tamata', category: 'Fresho', OriginalPrice :52,
    FinalPrice: 42, imagePath: 'assets/Images/tomatoHybrid.jpg'},
    {name: 'Sweet Potato/Chilakada Dumpa', category: 'Fresho', OriginalPrice :52,
    FinalPrice: 42, imagePath: 'assets/Images/sweetPotato.jpg'},
    {name: 'Sambar Onion - Peeled', category: 'Fresho', OriginalPrice :52,
    FinalPrice: 42, imagePath: 'assets/Images/sambharOnion.jpg'},
    {name: 'Onion - Diced', category: 'Fresho', OriginalPrice :52,
    FinalPrice: 42, imagePath: 'assets/Images/onionDiced.jpg'}
    ];

  }
  addToCart(product: any) {
    this.service.addToCart(product);
 }

}