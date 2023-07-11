import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { MatDialog } from '@angular/material/dialog';
import {NgbModal, ModalDismissReasons} from '@ng-bootstrap/ng-bootstrap';
import { MobileVerifyComponent } from 'src/app/mobile-verify/component/mobile-verify.component';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent {
  constructor(private router:Router,public dialog: MatDialog){};

  title = 'appBootstrap';
  
  closeResult:String="";

  public panditJiRegistert(){
    this.router.navigate(['/register-panditji']);
  }
  public userRegistert(){
    this.router.navigate(['/register-user']);
  }
  
  animal: string="";
  name: string="";
  
  openDialog(): void {
    let dialogRef = this.dialog.open(MobileVerifyComponent, {
      disableClose: true,
      width: '600px',
      // height: '350px',
      data: { name: this.name, animal: this.animal }
    });
  
    dialogRef.afterClosed().subscribe(result => {
      this.animal = result;
    });
  }


}
