import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RegisterPanditjiComponent } from './register-panditji.component';

describe('RegisterPanditjiComponent', () => {
  let component: RegisterPanditjiComponent;
  let fixture: ComponentFixture<RegisterPanditjiComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [RegisterPanditjiComponent]
    });
    fixture = TestBed.createComponent(RegisterPanditjiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
