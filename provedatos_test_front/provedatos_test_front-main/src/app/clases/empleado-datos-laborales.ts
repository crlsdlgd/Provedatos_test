import { Provincia } from "./provincia";

export class EmpleadoDatosLaborales {
    departamento: string;
    cargo: string;
    fechaIngreso: Date | any;
    observacionesLaborales: string | null;
    jornadaParcial: boolean;
    sueldo: number;
    provinciaLaboral: Provincia;
}
