import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HomekitchenComponent } from './homekitchen.component';

describe('HomekitchenComponent', () => {
  let component: HomekitchenComponent;
  let fixture: ComponentFixture<HomekitchenComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HomekitchenComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HomekitchenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
