import { Component } from '@angular/core';
import { EmpleadoService } from '../../servicios/empleado.service';
import { Empleado } from '../../clases/empleado';

@Component({
  selector: 'app-reporte-empleados',
  templateUrl: './reporte-empleados.component.html',
  styleUrl: './reporte-empleados.component.css'
})
export class ReporteEmpleadosComponent {

  empleados: Empleado[];
  constructor(private empleadoService: EmpleadoService){}

  ngOnInit(): void {
    this.obtenerEmpleados();
  }

  private obtenerEmpleados(){
    this.empleadoService.obtenerListaDeEmpleados().subscribe(dato => {
      this.empleados = dato;
    });
    console.log(this.empleados);
    
  }

}
