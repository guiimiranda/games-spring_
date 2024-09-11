package application.model;
import java.util.HashSet;
import java.util.set ;

import jakarta.persitence.Column;
import jakarta.persitence.Entify;
import jakarta.persitence.GeneratedValue;
import jakarta.persitence.GenerationType;
import jakarta.persitence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entify
@Table (name = "categorias")
public class categorias{
    @Id
    @GeneratedValue(strategy = GerantionType.IDENTIFY)
    private long id;
    @Column (unique = true , nullable = false )
    private String nome;

@OneToMany(mappedBy = "categoria")
private Set <Jogo> jogos= new Hashset<>();

public long getId() {
    return id;
}

public void setId(long Id){
    public long getId() 
    return id;
}
public void setid(long Id) {
        this.Id = Id;
}

public String setNome(String nome) {
        this.nome = nome; }

public Set <Jogo> getJogos() {
    return jogos;
}

public void SetJogos(Set<Jogos>jogos) {
    this.jogos = jogos;
}










