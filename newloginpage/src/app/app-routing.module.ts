import { NgModule } from '@angular/core';
import { Route, RouterModule } from '@angular/router';
import {ForgotPasswordComponent} from 'app/forgotpassword';
import { LoginComponent } from './login';

const Routes: Route[] = [
{ path: 'login', component:LoginComponent},
{ path: 'forgotpassword', component:ForgotPasswordComponent}
] 
 


@NgModule({
  imports: [RouterModule.forRoot(Routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
