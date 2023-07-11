import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BookPanditjiComponent } from './component/book-panditji.component';

const routes: Routes = [{ path: '', component: BookPanditjiComponent }];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class BookPanditjiRoutingModule { }
