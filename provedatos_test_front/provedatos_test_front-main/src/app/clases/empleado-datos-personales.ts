import { Provincia } from "./provincia";

export class EmpleadoDatosPersonales {
    nombres: string;
    apellidos: string;
    rucCedula: string;
    fechaNacimiento: Date | any;
    email: string;
    observaciones: string | null;
    fotografia: File | null;
    provincia: Provincia;
}
