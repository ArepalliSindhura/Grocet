import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RegEmpComponent } from './reg-emp/reg-emp.component';
import { LoginComponent } from './login/login.component';
import { ExpPipe } from './exp.pipe';
import { GenderPipe } from './gender.pipe';
import { FooterComponent } from './footer/footer.component';
import { RouterModule, Routes } from '@angular/router';
import { AuthGuard } from './auth.guard';
import { CartComponent } from './cart/cart.component';
import { BheaderComponent } from './bheader/bheader.component';
import { HomekitchenComponent } from './homekitchen/homekitchen.component';
import { HomepageComponent } from './homepage/homepage.component';
import { FoodgrainsComponent } from './foodgrains/foodgrains.component';

const appRoot: Routes = [
{path : '', component : HomepageComponent},
{path: 'login', component: LoginComponent},
{path: 'regEmp',
component:RegEmpComponent},
{path: 'cart',
component: CartComponent},
{path: 'homekitchen',
component: HomekitchenComponent},
{path: 'view',
component: HomekitchenComponent},
{path : 'homepage',
component : HomepageComponent},
{path: 'foodgrains',
component: FoodgrainsComponent}
/*{path: 'logout',
canActivate : [AuthGuard],
component: LoginComponent}*/
];


@NgModule({
  declarations: [
    AppComponent,
    RegEmpComponent,
    LoginComponent,
    ExpPipe,
    GenderPipe,
    FooterComponent,
    CartComponent,
    BheaderComponent,
    HomekitchenComponent,
    HomepageComponent,
    FoodgrainsComponent
  ],
  imports: [
    FormsModule,
    RouterModule.forRoot(appRoot),
    HttpClientModule,
    BrowserModule,
    AppRoutingModule
  ],
  providers: [AuthGuard],
  bootstrap: [AppComponent]
})
export class AppModule { }
