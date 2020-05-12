import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http'

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CandybarComponent } from './candybar/candybar/candybar.component';
import { QuizComponent } from './quiz/quiz/quiz.component';
import { QuestionComponent } from './question/question/question.component';

@NgModule({
  declarations: [
    AppComponent,
    CandybarComponent,
    QuizComponent,
    QuestionComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
