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
@Table (name = "plataformas")
public class plataformas{
    @Id
    @GeneratedValue(strategy = GerantionType.IDENTIFY)
    private long id;
    @Column (unique = true , nullable = false )
    private String nome;
@OneToMany(mappedBy = "plataforma" )
private Set <Jogo> jogos = new HashSet <> ();
public long getId() {
    return id;
}
public void setId(long id) {
    this.id = id;
}

public String getNome() {
    return nome;

}

public void setNome (String nome) {
    this.nome = nome;
}

public Set <Jogo> getJogos() {
    return jogos;
}

public void setJogos(Set<Jogo> jogos) {
    this.jogos = jogos;
}
}

