import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CandybarComponent } from './candybar/candybar/candybar.component';
import { QuizComponent } from './quiz/quiz/quiz.component';
import { QuestionComponent } from './question/question/question.component';

const routes: Routes = [
  { path: '', redirectTo: '/quiz', pathMatch: 'full' },
  { path: 'candy', component: CandybarComponent },
  { path: 'quiz', component: QuizComponent },
  { path: 'question', component: QuestionComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
