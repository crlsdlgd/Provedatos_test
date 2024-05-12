import { Empleado } from "./empleado";

export class Provincia {
    idProvincia: number;
    nombreProvincia: string;
    capitalProvincia: string;
    descripcionProvincia: string;
    poblacionProvincia: number;
    superficieProvincia: number;
    latitudProvincia: string;
    longitudProvincia: string;
    idRegion: number;
    empleados: Empleado[] | null;
}
