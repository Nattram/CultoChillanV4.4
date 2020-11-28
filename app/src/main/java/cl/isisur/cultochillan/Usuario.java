package cl.isisur.cultochillan;

public class Usuario {
    public class Usuario {
        private String Idusuario;
        private String Correo;
        private String Contraseña;

        public Usuario() {
            Idusuario = "";
            Correo = "";
            Contraseña = "";
        }

        public Usuario(String idusuario, String correo, String contraseña) {
            Idusuario = idusuario;
            Correo = correo;
            Contraseña = contraseña;
        }

        public String getIdusuario() {
            return Idusuario;
        }

        public void setIdusuario(String idusuario) {
            Idusuario = idusuario;
        }

        public String getCorreo() {
            return Correo;
        }

        public void setCorreo(String correo) {
            Correo = correo;
        }

        public String getcontraseña() {
            return Contraseña;
        }

        public void setcontraseña(String contraseña) {
            Contraseña = contraseña;
        }

        public String getIdUsuario() { return Idusuario; }
        public void setIdUsuario(String idUsuario) {Idusuario = idUsuario;}
        public String getEmail() { return Email; }
        public void setEmail(String email) {Email = email;}
        public String getContraseña() { return Contraseña; }
        public void setContraseña(String email) {Contraseña = contraseña;}

        @Override
        public String toString() {
            return "usuario{" +
                    "Usuario='" + usuario + '\'' +
                    ", Email='" + email + '\'' +
                    ", Contraseña='" + contraseña + '\'' +
                    '}';
        }
}
