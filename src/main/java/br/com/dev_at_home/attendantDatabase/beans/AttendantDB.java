package br.com.dev_at_home.attendantDatabase.beans;

import br.com.dev_at_home.attendantDatabase.model.Attendant;
import br.com.dev_at_home.attendantDatabase.repository.CRUD;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named(value = "atendenteMB")
@ViewScoped
public class AttendantDB {

    @Getter
    @Setter
    private List<Attendant> atendentes = new ArrayList<>();

    @Getter
    @Setter
    private Attendant atendente;

    @Autowired
    private CRUD repository;

    @PostConstruct
    public List<Attendant> listarTodos() {
        atendentes = repository.findAll();
        return atendentes;
    }

    public Integer getTamanhoDaLista() {
        return atendentes.size();
    }

    public void setTamanhoDaLista(Integer size) {
        // Método criado para ser utilizado pelo primefaces
    }

}
