import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BuscarEmpleadoComponent } from './componentes/buscar-empleado/buscar-empleado.component';
import { ReporteEmpleadosComponent } from './componentes/reporte-empleados/reporte-empleados.component';
import { CrearEmpleadoComponent } from './componentes/crear-empleado/crear-empleado.component';

const routes: Routes = [
  {path: 'empleados', component:BuscarEmpleadoComponent},
  {path: '',redirectTo: 'empleados', pathMatch:'full'},
  {path: 'reporte-empleados', component: ReporteEmpleadosComponent},
  {path: 'crear-empleado', component: CrearEmpleadoComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
