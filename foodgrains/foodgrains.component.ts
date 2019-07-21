import { Component, OnInit } from '@angular/core';
import { EmpService } from '../emp.service';

@Component({
  selector: 'app-foodgrains',
  templateUrl: './foodgrains.component.html',
  styleUrls: ['./foodgrains.component.css']
})
export class FoodgrainsComponent implements OnInit {
  products: any;
  imagePath: any;
  fileToUpload: File = null;
  imageUrl: string;
  imageToShow: any;
  isImageLoading: boolean;

  constructor(private service: EmpService) { }

  ngOnInit() {
    this.products = [
    {name: 'Sugar', category: 'Bb popular', OriginalPrice :100,
    FinalPrice: 81, imagePath: 'assets/Images/sugar.jpg'},
    {name: 'Atta - Whole Wheat', category: 'Aashirvaad', OriginalPrice :255,
    FinalPrice: 210, imagePath: 'assets/Images/atta.jpg'},
    {name: 'Refined Oil - Sunflower', category: 'Freedom', OriginalPrice :105,
    FinalPrice: 88, imagePath: 'assets/Images/refined oil.jpg'},
    {name: 'Toor/Arhar Dal', category: 'bb Popular', OriginalPrice :700,
    FinalPrice: 591, imagePath: 'assets/Images/toor.jpg'},
    {name: 'Kurnool Sona Masoori Raw Rice', category: 'bb Royal', OriginalPrice :700,
    FinalPrice: 540, imagePath: 'assets/Images/rice.jpg'},
    {name: 'Almond/Badam - Californian, Giri', category: 'bb Popular', OriginalPrice :120,
    FinalPrice: 76, imagePath: 'assets/Images/Almond.jpg'},
    {name: 'Raw Rice - Sona Masoori', category: 'bb Royal', OriginalPrice :700,
    FinalPrice: 570, imagePath: 'assets/Images/sonaMasoori.jpg'},
    {name: 'Urad Gota - Whole', category: 'bb Popular', OriginalPrice :300,
    FinalPrice: 189, imagePath: 'assets/Images/UradGota.jpg'}
    ];

  }
  addToCart(product: any) {
    this.service.addToCart(product);
 }


}
