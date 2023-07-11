import { Component, OnInit } from '@angular/core';
import { BookingDtls } from 'src/app/models/booking-dtls.model';
import { FunctionDtls } from 'src/app/models/function-dtls.model';
import { BookingService } from 'src/app/services/booking.service';
import { NotificationServiceService } from 'src/app/services/notification-service.service';

@Component({
  selector: 'app-book-panditji',
  templateUrl: './book-panditji.component.html',
  styleUrls: ['./book-panditji.component.scss']
})
export class BookPanditjiComponent implements OnInit {

  bookingDtls:BookingDtls=new BookingDtls();
  functionDtls:FunctionDtls=new FunctionDtls();
  constructor(public bookingService: BookingService,
    public notificationService: NotificationServiceService) { }
  ngOnInit(): void {
    this.bookingService.getFunctionDtls().subscribe((res) => {
      console.log('response-->' + JSON.stringify(res));
      this.notificationService.showSuccess(JSON.stringify(res), "success")
    }, (err) => {
      console.log('err---->' + JSON.stringify(err));
      this.notificationService.showError(JSON.stringify(err), "error");
    });
  }
  submit() {
    this.bookingService.saveBookingDetails(this.bookingDtls).subscribe((res) => {
      console.log('response-->' + JSON.stringify(res));
      this.notificationService.showSuccess(JSON.stringify(res), "success")
    }, (err) => {
      console.log('err---->' + JSON.stringify(err));
      this.notificationService.showError(JSON.stringify(err), "error");
    });
  }

}
