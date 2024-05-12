import { Component, Output, EventEmitter, OnInit } from '@angular/core';
import { EmpleadoDatosPersonales } from '../../clases/empleado-datos-personales';
import { ProvinciaService } from '../../servicios/provincia.service';
import { Provincia } from '../../clases/provincia';

@Component({
  selector: 'app-empleado-datos-personales',
  templateUrl: './empleado-datos-personales.component.html',
  styleUrl: './empleado-datos-personales.component.css'
})
export class EmpleadoDatosPersonalesComponent implements OnInit {


  @Output() empleadoDatosPersonales = new EventEmitter<EmpleadoDatosPersonales>();

  datosPersonales: EmpleadoDatosPersonales = new EmpleadoDatosPersonales();
  provincias: Provincia[];
  provinciaSelected: Provincia;

  constructor(private provinciaService: ProvinciaService){}

  ngOnInit():void{
    this.listarProvincias();
  }

  private listarProvincias(): void {
    this.provinciaService.obtenerListaDeProvincias().subscribe(dato => {
      this.provincias = dato;
    });
  }

  agregarDatosPersonales() {
    this.datosPersonales.provincia = this.provinciaSelected;
    this.empleadoDatosPersonales.emit(this.datosPersonales);
  }
}
