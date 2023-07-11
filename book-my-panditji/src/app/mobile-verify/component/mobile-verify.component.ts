import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { VerifyMobileService } from 'src/app/services/verify-mobile.service';
import { NotificationServiceService } from 'src/app/services/notification-service.service';
import { MobileVerification } from 'src/app/models/mobile-verification.model';
import { ShareDataService } from 'src/app/services/share-data.service';
@Component({
  selector: 'app-mobile-verify',
  templateUrl: './mobile-verify.component.html',
  styleUrls: ['./mobile-verify.component.scss']
})
export class MobileVerifyComponent {
  constructor(private router:Router,public dialogRef: MatDialogRef<MobileVerifyComponent>,
    public verifyMobileService:VerifyMobileService,public notificationService:NotificationServiceService,
    public shareDataService:ShareDataService){

  };
  
  data=new MobileVerification();
  
  isOtpShow=false;
  submitMobileNo(){
    this.verifyMobileService.generateOtp(this.data).subscribe((response)=>{
      console.log('response --->',response);
      this.isOtpShow=true;
      this.notificationService.showSuccess(JSON.stringify(response),'Success Message');
    },(err)=>{
      console.log(err);
      this.notificationService.showError(err.message,'Error Message');
    });
  }
  verifyOtp(){
    this.verifyMobileService.verifyOtp(this.data).subscribe((response)=>{
      console.log('response --->',response);
      this.notificationService.showSuccess(JSON.stringify(response),'Success Message');
      this.shareDataService.data=this.data;
      this.onCancel();
      this.router.navigate(['/register-panditji'])
    },(err)=>{
      console.log('err msg ==>'+err.error);
      this.notificationService.showError(err.error,'Error Message');
    });
  }
    public panditJiRegistert(){
    this.router.navigate(['/register-panditji']);
  }
  public userRegistert(){
    this.router.navigate(['/register-user']);
  }
  onCancel(): void {
    this.dialogRef.close();
  }

}
