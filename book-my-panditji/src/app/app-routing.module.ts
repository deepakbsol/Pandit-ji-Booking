import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  { path: 'register-panditji', loadChildren: () => import('./register-panditji/register-panditji.module').then(m => m.RegisterPanditjiModule) },
  { path: 'book-panditji', loadChildren: () => import('./book-panditji/book-panditji.module').then(m => m.BookPanditjiModule) }, 
  { path: 'payment', loadChildren: () => import('./payment/payment.module').then(m => m.PaymentModule) },
  { path: 'mobile-verify', loadChildren: () => import('./mobile-verify/mobile-verify.module').then(m => m.MobileVerifyModule) },
  { path: 'login', loadChildren: () => import('./login/login.module').then(m => m.LoginModule) },
  { path: '', loadChildren: () => import('./dashbord/dashbord.module').then(m => m.DashbordModule) }];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
