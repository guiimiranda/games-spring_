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

publicvo ld setIDd(long Id)
}public long getId() {
    return id;

}public String getTitulo() {
    return nome;
}