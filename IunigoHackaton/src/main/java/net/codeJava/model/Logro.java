package net.codeJava.model;

public class Logro {

		public String nombre;
		public String imagen;
		public String beneficio;
		public boolean earned;
		
		public Logro(String nombre, String imagen, String beneficio, boolean earned) {
			this.nombre = nombre;
			this.imagen = imagen;
			this.beneficio = beneficio;
			this.earned = earned;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getImagen() {
			return imagen;
		}

		public void setImagen(String imagen) {
			this.imagen = imagen;
		}

		public String getBeneficio() {
			return beneficio;
		}

		public void setBeneficio(String beneficio) {
			this.beneficio = beneficio;
		}

		public boolean isEarned() {
			return earned;
		}

		public void setEarned(boolean earned) {
			this.earned = earned;
		}
		
	}
