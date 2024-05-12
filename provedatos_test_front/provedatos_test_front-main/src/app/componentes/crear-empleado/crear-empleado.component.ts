import { Component, OnInit } from '@angular/core';
import { Empleado } from '../../clases/empleado';
import { EmpleadoDatosPersonales } from '../../clases/empleado-datos-personales';
import { EmpleadoDatosLaborales } from '../../clases/empleado-datos-laborales';
import { EmpleadoService } from '../../servicios/empleado.service';

@Component({
  selector: 'app-crear-empleado',
  templateUrl: './crear-empleado.component.html',
  styleUrl: './crear-empleado.component.css',
})
export class CrearEmpleadoComponent implements OnInit {

  empleado: Empleado = new Empleado();
  

  datosPersonales: EmpleadoDatosPersonales = new EmpleadoDatosPersonales();
  datosLaborales: EmpleadoDatosLaborales = new EmpleadoDatosLaborales();


  constructor(private empleadoService: EmpleadoService) { }

  ngOnInit(): void {
    
  }

  agregarDatosPersonales(datos: EmpleadoDatosPersonales) {
    this.datosPersonales = datos;
  }
  agregarDatosLaborales(datos: EmpleadoDatosLaborales) {
    this.datosLaborales = datos;
  }

  private loadEmpleadoData(): void {
    this.empleado.nombres = this.datosPersonales.nombres;
    this.empleado.apellidos = this.datosPersonales.apellidos;
    this.empleado.rucCedula = this.datosPersonales.rucCedula;
    this.empleado.fechaNacimiento = this.datosPersonales.fechaNacimiento;
    this.empleado.email = this.datosPersonales.email;
    this.empleado.observaciones = this.datosPersonales.observaciones;
    this.empleado.provincia = this.datosPersonales.provincia;

    this.empleado.departamento = this.datosLaborales.departamento;
    this.empleado.cargo = this.datosLaborales.cargo;
    this.empleado.fechaIngreso = this.datosLaborales.fechaIngreso;
    this.empleado.observacionesLaborales = this.datosLaborales.observacionesLaborales;
    this.empleado.jornadaParcial = this.datosLaborales.jornadaParcial;
    this.empleado.sueldo = this.datosLaborales.sueldo;
    this.empleado.provinciaLaboral = this.datosLaborales.provinciaLaboral;
  }

  guardarEmpleado() {
    this.loadEmpleadoData();    
    this.empleadoService.guardarEmpleado(this.empleado).subscribe(dato => {

    }, error => console.log(error));
  }
}
