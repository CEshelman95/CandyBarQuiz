import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, of } from 'rxjs';

import { CandyBar } from '../candy-bar';

@Injectable({
  providedIn: 'root'
})
export class CandybarService {

  constructor(private http: HttpClient) { }

  getCandy(): Observable<CandyBar> {
    return this.http.get<CandyBar>('http://localhost:8080/candy');
  }
}
