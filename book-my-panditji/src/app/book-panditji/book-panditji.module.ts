import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { BookPanditjiRoutingModule } from './book-panditji-routing.module';
import { BookPanditjiComponent } from './component/book-panditji.component';


@NgModule({
  declarations: [
    BookPanditjiComponent
  ],
  imports: [
    CommonModule,
    BookPanditjiRoutingModule
  ]
})
export class BookPanditjiModule { }
