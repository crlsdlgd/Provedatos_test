import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { EmpleadoDatosLaborales } from '../../clases/empleado-datos-laborales';
import { Provincia } from '../../clases/provincia';
import { ProvinciaService } from '../../servicios/provincia.service';

@Component({
  selector: 'app-empleado-datos-laborales',
  templateUrl: './empleado-datos-laborales.component.html',
  styleUrl: './empleado-datos-laborales.component.css'
})
export class EmpleadoDatosLaboralesComponent implements OnInit{

  @Output() empleadoDatosLaborales = new EventEmitter<EmpleadoDatosLaborales>();

  datosLaborales: EmpleadoDatosLaborales = new EmpleadoDatosLaborales();
  provincias: Provincia[];
  provinciaLaboralSelected: Provincia;

  constructor(private provinciaService: ProvinciaService){}

  ngOnInit():void{
    this.listarProvincias();
  }

  private listarProvincias(): void {
    this.provinciaService.obtenerListaDeProvincias().subscribe(dato => {
      this.provincias = dato;
    });
  }
  agregarDatosLaborales() {
    this.datosLaborales.provinciaLaboral = this.provinciaLaboralSelected;
    this.empleadoDatosLaborales.emit(this.datosLaborales);
  }
}
