import { Component, OnInit } from '@angular/core';
import { EmpService } from '../emp.service';

@Component({
  selector: 'app-homepage',
  templateUrl: './homepage.component.html',
  styleUrls: ['./homepage.component.css']
})
export class HomepageComponent implements OnInit {
  products: any;
  constructor(private service: EmpService) { }

  ngOnInit() {
    this.products = [{name: 'Onion/Vulligadda/ Ullipaya', category: 'Fresho', OriginalPrice :15,
    FinalPrice: 12, imagePath: 'assets/Images/onion.jpg'},
    {name: 'Tomato - Local', category: 'Fresho', OriginalPrice :35,
    FinalPrice: 28, imagePath: 'assets/Images/tomato.jpg'},
    {name: 'Onion', category: 'Fresho', OriginalPrice :52,
    FinalPrice: 42, imagePath: 'assets/Images/onionOrganic.jpg'},
    {name: 'Potato/Alugadda', category: 'Fresho', OriginalPrice :52,
    FinalPrice: 42, imagePath: 'assets/Images/potato.jpg'
  }];


}
}
