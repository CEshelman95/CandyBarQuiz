import { Component, OnInit } from '@angular/core';

import { CandybarService } from '../candybar.service'
import { CandyBar } from '../../candy-bar';

@Component({
  selector: 'app-candybar',
  templateUrl: './candybar.component.html',
  styleUrls: ['./candybar.component.css']
})
export class CandybarComponent implements OnInit {

  constructor(private candybarService: CandybarService) { }

  candy: CandyBar;

  ngOnInit(): void {
    this.getCandy();
  }

  getCandy(): void {
    this.candybarService.getCandy().subscribe(candy => this.candy = candy);
  }

}
