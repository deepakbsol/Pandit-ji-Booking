import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common'; 
import { MatSelectModule } from '@angular/material/select'; 
import { MatFormFieldModule } from '@angular/material/form-field'; 

import { RegisterPanditjiRoutingModule } from './register-panditji-routing.module';
import { RegisterPanditjiComponent } from './component/register-panditji.component';
import { FormsModule } from '@angular/forms';


@NgModule({
  declarations: [
    RegisterPanditjiComponent
  ],
  imports: [
    RegisterPanditjiRoutingModule,
    MatSelectModule,
    MatFormFieldModule,
    FormsModule,
    CommonModule
  ]
})
export class RegisterPanditjiModule { }
