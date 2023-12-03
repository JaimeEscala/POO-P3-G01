package clases;

public class Socials {
    private String nombre_de_red_social;
    private String username;

    public Socials(String nombre_de_red_social, String username) {
        this.nombre_de_red_social = nombre_de_red_social;
        this.username = username;
    }

    public String getNombre_de_red_social() {
        return nombre_de_red_social;
    }

    public void setNombre_de_red_social(String nombre_de_red_social) {
        this.nombre_de_red_social = nombre_de_red_social;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    
}
