import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, of } from 'rxjs';

import { Question } from '../quest';

@Injectable({
  providedIn: 'root'
})
export class QuestionService {

  constructor(private http: HttpClient) { }

  getQuestion(count: number): Observable<Question> {
    return this.http.get<Question>('http://localhost:8080/question/' + count);
  }

}
