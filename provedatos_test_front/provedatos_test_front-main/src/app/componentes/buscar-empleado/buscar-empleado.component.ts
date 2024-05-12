import { Component, OnInit } from '@angular/core';
import { Empleado } from '../../clases/empleado';
import { EmpleadoService } from '../../servicios/empleado.service';
import { FormBuilder, FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-buscar-empleado',
  templateUrl: './buscar-empleado.component.html',
  styleUrl: './buscar-empleado.component.css'
})
export class BuscarEmpleadoComponent implements OnInit{

  empleado: Empleado = new Empleado();
  empleados: Empleado[];

  searchForm: FormGroup = this.fb.group({
    nombreEmpleado: [''] ,
    codigoEmpleado: ['']
  });

  constructor(private empleadoService: EmpleadoService, private fb: FormBuilder) {

  }

  ngOnInit(): void {
      
  }

  buscarEmpleado() {
    const nombreEmpleado = this.searchForm.get('nombreEmpleado')?.value.trim();
    const codigoEmpleado = this.searchForm.get('codigoEmpleado')?.value.trim();

    this.empleado.nombres = nombreEmpleado;
    this.empleado.codigo= codigoEmpleado;

    if (nombreEmpleado) {
      this.empleadoService.buscarEmpleadoPorNombre(this.empleado).subscribe(dato => {
        this.empleados = dato;
      });
    }
  
    if (codigoEmpleado) {
      this.empleadoService.buscarEmpleadoPorCodigo(this.empleado).subscribe(dato => {
        this.empleados = dato;
      });
    }
  
    if (nombreEmpleado && codigoEmpleado) {
      this.empleadoService.buscarEmpleado(this.empleado).subscribe(dato => {
        this.empleados = dato;
      });
    }
  }
}
