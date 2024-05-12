import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Empleado } from '../clases/empleado';

@Injectable({
  providedIn: 'root'
})
export class EmpleadoService {
  
  
  private baseURL = "http://localhost:8080/";

  constructor(private httpClient: HttpClient) { }

  obtenerListaDeEmpleados(): Observable<Empleado[]>{
    return this.httpClient.get<Empleado[]>(`${this.baseURL}`+`empleado/listar`)
  }  
  
  guardarEmpleado(empleado: Empleado): Observable<Object>{
    return this.httpClient.post(`${this.baseURL}`+`empleado/guardar`,empleado);
  }
  
  buscarEmpleado(empleado: Empleado): Observable<Empleado[]> {
    return this.httpClient.get<Empleado[]>(`${this.baseURL}`+`empleado/listar/`+`${empleado.nombres}`+`/`+`${empleado.codigo}`)
  }
  
  buscarEmpleadoPorNombre(empleado: Empleado): Observable<Empleado[]> {
    return this.httpClient.get<Empleado[]>(`${this.baseURL}`+`empleado/buscarPorNombre/`+`${empleado.nombres}`)
  }
  
  buscarEmpleadoPorCodigo(empleado: Empleado): Observable<Empleado[]> {
    return this.httpClient.get<Empleado[]>(`${this.baseURL}`+`empleado/buscarPorCodigo/`+`${empleado.codigo}`)
  }
}
