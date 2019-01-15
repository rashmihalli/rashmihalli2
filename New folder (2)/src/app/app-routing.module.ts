import { NgModule } from '@angular/core';
import { Route, RouterModule } from '@angular/router';
import { forgotpasswordComponent } from '@/forgotpassword';


const Routes: Route[] = [
{ path: 'forgotpassword', component:forgotpasswordComponent}
] 
 


@NgModule({
  imports: [RouterModule.forRoot(Routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
