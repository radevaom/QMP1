import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

import java.util.List;

public class QMP1 {

}

//tempreratura, sol , lluvia, viento, tu vieja xd

class Atuendo {
    List<Prenda> prendas;

    public void agregarPrenda(Prenda prenda) {
        if (prendas.stream().noneMatch(prenda1 -> prenda1.tipoDePrenda.categoria == prenda.tipoDePrenda.categoria)){
            this.prendas.add(prenda);
        }
        else {
            //lanzo excepcion
        }

    }
}

class Prenda {
    @NotNull TipoDePrenda tipoDePrenda;
    @NotNull Material material;
    @NotNull Color colorPrincipal;
    Color colorSecundario;

    public Prenda(@NotNull TipoDePrenda tipoDePrenda,@NotNull Material material, @NotNull Color colorPrincipal, @Nullable Color colorSecundario){
        this.tipoDePrenda=tipoDePrenda;
        this.material=material;
        this.colorPrincipal=colorPrincipal;
        if (colorSecundario != null){
            this.colorSecundario=colorSecundario;
        }


    }

    public Categoria categoriaPrenda(){
        return  this.tipoDePrenda.categoria;
    }
}



class TipoDePrenda {
    Categoria categoria;

    public  TipoDePrenda(Categoria categoria){
        this.categoria=categoria;
    }
}

class  Color {
    Integer red;
    Integer green;
    Integer blue;

    public Color(Integer red,Integer green, Integer blue){
        this.red=red;
        this.green=green;
        this.blue=blue;
    }
}

enum Categoria{
    SUPERIOR,CALZADO,INFERIOR,ACCESORIOS;
}

enum Material{
    NYLON,ALGODON,LINO;
}

//    Prenda pren = new Prenda(new TipoDePrenda(Categoria.CALZADO),Material.LINO,new Color(255,10,44),null);
