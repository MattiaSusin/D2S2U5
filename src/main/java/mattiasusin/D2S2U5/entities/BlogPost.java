package mattiasusin.D2S2U5.entities;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BlogPost {

    @Setter(AccessLevel.NONE)
    private int id;
    private String categoria;
    private String titolo;
    private String cover;
    private double tempoDiLettura;


    // TO STRING
    @Override
    public String toString() {
        return "BlogPost{" +
                "id=" + id +
                ", categoria='" + categoria + '\'' +
                ", titolo='" + titolo + '\'' +
                ", cover='" + cover + '\'' +
                ", tempoDiLettura=" + tempoDiLettura +
                '}';
    }
}
