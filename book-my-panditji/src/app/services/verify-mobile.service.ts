import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import { environment } from 'src/environments/environment';
import { catchError } from 'rxjs/operators';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class VerifyMobileService {

  constructor(public httpClient:HttpClient) { }
  
   generateOtp(data:any):Observable<Object>{
    return this.httpClient.post('http://192.168.29.177:9099'+'/api/send-otp',data,{responseType: 'text'});
  }

  verifyOtp(data:any):Observable<Object>{
    return this.httpClient.post('http://192.168.29.177:9099'+'/api/verify-otp',data,{responseType: 'text'});
  }
}
