import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {

  constructor(private router:Router){}

  onClickRedirectReporte() {
    this.router.navigate(['reporte-empleados']);
  }
  onClickRedirectInicio() {
    this.router.navigate(['empleados']);
  }

  onClickRedirectCrear() {
    this.router.navigate(['crear-empleado']);
  }
  title = 'Provedatos Test';
}
