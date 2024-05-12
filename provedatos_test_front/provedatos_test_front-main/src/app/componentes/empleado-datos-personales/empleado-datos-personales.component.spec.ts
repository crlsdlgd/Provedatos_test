import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EmpleadoDatosPersonalesComponent } from './empleado-datos-personales.component';

describe('EmpleadoDatosPersonalesComponent', () => {
  let component: EmpleadoDatosPersonalesComponent;
  let fixture: ComponentFixture<EmpleadoDatosPersonalesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [EmpleadoDatosPersonalesComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(EmpleadoDatosPersonalesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
