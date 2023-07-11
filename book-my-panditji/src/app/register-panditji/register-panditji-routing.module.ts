import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RegisterPanditjiComponent } from './component/register-panditji.component';

const routes: Routes = [{ path: '', component: RegisterPanditjiComponent }];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class RegisterPanditjiRoutingModule { }
