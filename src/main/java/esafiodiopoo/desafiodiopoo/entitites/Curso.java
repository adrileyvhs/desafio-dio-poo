package esafiodiopoo.desafiodiopoo.entitites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Curso {
   private String titulo;
   private String descricao;
   int cargaHoraria;
}
