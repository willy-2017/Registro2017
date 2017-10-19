
package com.mycompany.acceso;



import com.mycompany.controles.UsuariosFacadeLocal;
import com.mycompany.definiciones.Usuarios;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;


@Named
@ViewScoped
public class UsuariosBean implements Serializable{

    public List<Usuarios> getLista() {
        return lista;
    }

    public void setLista(List<Usuarios> lista) {
        this.lista = lista;
    }
@EJB
private UsuariosFacadeLocal UsuariosEJB;
private Usuarios usuarios;
private List<Usuarios> lista=new ArrayList(); 

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public UsuariosFacadeLocal getUsuariosEJB() {
        return UsuariosEJB;
    }

    public void setUsuariosEJB(UsuariosFacadeLocal UsuariosEJB) {
        this.UsuariosEJB = UsuariosEJB;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

@PostConstruct
public void init(){
usuarios=new Usuarios();
}

public void registrar(){
    try {
    UsuariosEJB.create(usuarios);
    } catch (Exception e) {
    }
}

public void mostrar(){
    try {
    UsuariosEJB.findAll();
    } catch (Exception e) {
    }
}   


 public void listar(){
        try {
            Usuarios user=new Usuarios();
            user.getIdUsuario();
            user.getUsuario();
            lista.add(user);       
        } catch (Exception e) {
        }
     
    } 



}
