import { Provincia } from "./provincia";

export class Empleado {
    idEmpleado:number | null;
    nombres: string;
    apellidos: string;
    rucCedula: string;
    fechaNacimiento: Date | any;
    codigo: string | null;
    direccion: string | null;
    telefono: string | null;
    division: string | null;
    departamento: string;
    seccion: string | null;
    cargo: string;
    fechaIngreso: Date | any;
    status: string | null;
    discapacidad: boolean;
    email: string;
    categoria: string | null;
    estadoCivil: string | null;
    tipoSangre: string | null;
    observaciones: string | null;
    observacionesLaborales: string | null;
    jornadaParcial: boolean;
    sueldo: number;
    fotografia: File | null;
    provincia: Provincia;
    provinciaLaboral: Provincia;
}
