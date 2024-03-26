package esafiodiopoo.desafiodiopoo.entitites;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
@Getter
@Setter
@Data
public class Bootcamp {
    private   String nome;
    protected String descricao;
    private final LocalDate dataAtual = LocalDate.now();
    private final LocalDate dataFinal = dataAtual.plusDays(45);
    private Set<Dev> devsInscritos    = new HashSet<>();
    private Set<Conteudo> conteudos   = new HashSet<>();
}