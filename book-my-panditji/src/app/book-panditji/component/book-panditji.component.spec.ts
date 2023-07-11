import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BookPanditjiComponent } from './book-panditji.component';

describe('BookPanditjiComponent', () => {
  let component: BookPanditjiComponent;
  let fixture: ComponentFixture<BookPanditjiComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [BookPanditjiComponent]
    });
    fixture = TestBed.createComponent(BookPanditjiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
