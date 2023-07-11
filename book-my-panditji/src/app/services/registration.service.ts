import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Registration } from '../models/registration.model';

@Injectable({
  providedIn: 'root'
})
export class RegistrationService {
  constructor(public httpClient:HttpClient) { }

  saveRegistrationInfo(data:Registration){
    return this.httpClient.post('http://192.168.29.177:8083'+'/api/save-pandit-ji-info',data,
    {responseType: 'text'});
  }
}
