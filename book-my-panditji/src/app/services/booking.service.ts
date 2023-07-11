import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { BookingDtls } from '../models/booking-dtls.model';
import { Observable, map } from 'rxjs';
import { FunctionAndAddressDtls } from '../models/function-and-address-dtls.model';

@Injectable({
  providedIn: 'root'
})
export class BookingService {

  constructor(public httpClient:HttpClient) { }

  saveBookingDetails(bookingDtls:BookingDtls){
    return this.httpClient.post('',bookingDtls,{responseType: 'text'});
  }

  getFunctionDtls():Observable<FunctionAndAddressDtls>{
    return this.httpClient.get<FunctionAndAddressDtls>('');
  }
  
}
