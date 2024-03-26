package esafiodiopoo.desafiodiopoo.entitites;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;
@Getter
@Setter
@Data
public class Dev {
    private  String nome;
    private Set<Conteudo>conteudoInscritos = new LinkedHashSet<>();
    private Set<Conteudo>conteudoConcluidos= new LinkedHashSet<>();
    public void InscreverBootcamp(Bootcamp bootcamp){}
    public void progredir(){}
    public void calcularTotalXp(){
    }
}
