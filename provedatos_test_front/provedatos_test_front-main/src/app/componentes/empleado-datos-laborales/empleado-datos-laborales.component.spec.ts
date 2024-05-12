import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EmpleadoDatosLaboralesComponent } from './empleado-datos-laborales.component';

describe('EmpleadoDatosLaboralesComponent', () => {
  let component: EmpleadoDatosLaboralesComponent;
  let fixture: ComponentFixture<EmpleadoDatosLaboralesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [EmpleadoDatosLaboralesComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(EmpleadoDatosLaboralesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
