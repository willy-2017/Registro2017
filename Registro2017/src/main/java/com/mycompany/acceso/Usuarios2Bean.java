
package com.mycompany.acceso;

import com.mycompany.controles.UsuariosFacadeLocal;
import com.mycompany.definiciones.Usuarios;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;


@ManagedBean
@RequestScoped
@Named
@ViewScoped
public class Usuarios2Bean implements Serializable{

    @EJB
private Usuarios usuario=new Usuarios();
private List<Usuarios> lista=new ArrayList();
@PostConstruct
public void usuario2Bean(){
}

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    public List<Usuarios> getLista() {
        return lista;
    }

    public void setLista(List<Usuarios> lista) {
        this.lista = lista;
    }
    
    public void AgregarUser(){
    this.lista.add(this.usuario);
    }
    
    

    
  
    
}
