package uaslp.objetos.escuela;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;

public class Alumno{
    private String nombre;
    private String clave;
    private String claveDeCarrera;
    private int anioDeIngreso;
    private LocalDate fechaNacimiento;

    public static BuilderAlumno builder() {
        BuilderAlumno builderAlumno= new BuilderAlumno();
        return builderAlumno;
    }

    public Alumno build(){
        BuilderAlumno builderAlumno = builder();
        Alumno alumno = new Alumno();
        alumno.nombre= builderAlumno.nombre;
        alumno.clave= builderAlumno.clave;
        alumno.claveDeCarrera= builderAlumno.claveDeCarrera;
        alumno.anioDeIngreso= builderAlumno.anioDeIngreso;
        alumno.fechaNacimiento= builderAlumno.fechaNacimiento;
        return alumno;
    }
    public String getNombre() {
        return nombre;
    }

    public String getClave() {
        return clave;
    }

    public String getClaveDeCarrera() {
        return claveDeCarrera;
    }

    public int getAnioDeIngreso() {
        return anioDeIngreso;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public static class BuilderAlumno implements builder {
        private String nombre;
        private String clave;
        private String claveDeCarrera;
        private int anioDeIngreso;
        private LocalDate fechaNacimiento;


        public BuilderAlumno nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public BuilderAlumno clave(String clave) {
            this.clave = clave;
            return this;
        }

        public BuilderAlumno claveDeCarrera(String claveDeCarrera) {
            this.claveDeCarrera = claveDeCarrera;
            return this;
        }

        public BuilderAlumno anioDeIngreso(int anioDeIngreso) {
            this.anioDeIngreso = anioDeIngreso;
            return this;
        }

        public BuilderAlumno fechaNacimiento(LocalDate fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
            return this;
        }

        public Alumno build() {
            Alumno alumno = new Alumno();
            alumno.nombre = this.nombre;
            alumno.clave = this.clave;
            alumno.claveDeCarrera = this.claveDeCarrera;
            alumno.anioDeIngreso = this.anioDeIngreso;
            alumno.fechaNacimiento = this.fechaNacimiento;
            return alumno;
        }
    }
}
