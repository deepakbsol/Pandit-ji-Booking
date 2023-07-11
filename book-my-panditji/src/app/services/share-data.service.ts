import { Injectable } from '@angular/core';
import { MobileVerification } from '../models/mobile-verification.model';

@Injectable({
  providedIn: 'root'
})
export class ShareDataService {
  data:MobileVerification=new MobileVerification();
  constructor() { }
}
