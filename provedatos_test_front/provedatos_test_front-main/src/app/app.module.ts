import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BuscarEmpleadoComponent } from './componentes/buscar-empleado/buscar-empleado.component';
import { CrearEmpleadoComponent } from './componentes/crear-empleado/crear-empleado.component';
import { HttpClientModule } from '@angular/common/http';
import { ReporteEmpleadosComponent } from './componentes/reporte-empleados/reporte-empleados.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatTabsModule } from '@angular/material/tabs';
import { EmpleadoDatosPersonalesComponent } from './componentes/empleado-datos-personales/empleado-datos-personales.component';
import { EmpleadoDatosLaboralesComponent } from './componentes/empleado-datos-laborales/empleado-datos-laborales.component';

@NgModule({
  declarations: [
    AppComponent,
    BuscarEmpleadoComponent,
    CrearEmpleadoComponent,
    ReporteEmpleadosComponent,
    EmpleadoDatosPersonalesComponent,
    EmpleadoDatosLaboralesComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    BrowserAnimationsModule,
    MatTabsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
