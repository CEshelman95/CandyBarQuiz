import { Component, OnInit } from '@angular/core';

import { QuestionService } from '../question.service';
import { Question } from '../../quest'

@Component({
  selector: 'app-question',
  templateUrl: './question.component.html',
  styleUrls: ['./question.component.css']
})
export class QuestionComponent implements OnInit {

  constructor(private questionService: QuestionService) { }

  question: Question;
  count = 1;

  ngOnInit(): void {
    this.getQuestion();
  }

  increment(): void {
    this.count++;
    this.getQuestion();
  }

  decrement(): void {
    this.count--;
    this.getQuestion();
  }

  getQuestion(): void {
    this.questionService.getQuestion(this.count).subscribe(question => this.question = question);
  }

}
