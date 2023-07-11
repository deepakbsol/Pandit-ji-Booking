import { Component,OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Registration } from 'src/app/models/registration.model';
import { NotificationServiceService } from 'src/app/services/notification-service.service';
import { RegistrationService } from 'src/app/services/registration.service';
import { ShareDataService } from 'src/app/services/share-data.service';

@Component({
  selector: 'app-register-panditji',
  templateUrl: './register-panditji.component.html',
  styleUrls: ['./register-panditji.component.scss']
})
export class RegisterPanditjiComponent implements OnInit {
  constructor(public shareDataService:ShareDataService,public registrationService:RegistrationService,
    public notificationService:NotificationServiceService){}
  registration:Registration=new Registration();
  ngOnInit() {
    console.log('first-->'+this.shareDataService.data.getMobile());
    this.registration.mobile=this.shareDataService.data.getMobile();
    console.log('first-->'+this.registration);

 }
 submit(){
    this.registration.isVerifiedMobile="Y";
    console.log('save data-->'+JSON.stringify(this.registration));
    this.registrationService.saveRegistrationInfo(this.registration).subscribe((res)=>{
      console.log('response-->'+JSON.stringify(res));
      this.notificationService.showSuccess(JSON.stringify(res),"success")
    },(err)=>{
      console.log('err---->'+JSON.stringify(err));
      this.notificationService.showError(JSON.stringify(err),"error");
    });
 }

}
