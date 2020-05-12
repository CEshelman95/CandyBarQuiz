import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CandybarComponent } from './candybar.component';

describe('CandybarComponent', () => {
  let component: CandybarComponent;
  let fixture: ComponentFixture<CandybarComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CandybarComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CandybarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
