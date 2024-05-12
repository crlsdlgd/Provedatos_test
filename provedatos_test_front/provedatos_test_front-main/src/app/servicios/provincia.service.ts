import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Provincia } from '../clases/provincia';

@Injectable({
  providedIn: 'root'
})
export class ProvinciaService {

  private baseURL = "http://localhost:8080/";

  constructor(private httpClient: HttpClient) { }

  obtenerListaDeProvincias(): Observable<Provincia[]>{
    return this.httpClient.get<Provincia[]>(`${this.baseURL}`+`provincia/listar`)
  } 
}
