import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MobileVerifyComponent } from './mobile-verify.component';

describe('MobileVerifyComponent', () => {
  let component: MobileVerifyComponent;
  let fixture: ComponentFixture<MobileVerifyComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [MobileVerifyComponent]
    });
    fixture = TestBed.createComponent(MobileVerifyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
