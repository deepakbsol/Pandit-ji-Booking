import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { MobileVerifyComponent } from './component/mobile-verify.component';

const routes: Routes = [{ path: '', component: MobileVerifyComponent }];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class MobileVerifyRoutingModule { }
