package fitocontrol;

import repositorio.ArticuloRepositorio;
import repositorio.CompraRepositorio;
import repositorio.ManoSulfatoRepositorio;
import repositorio.MarcaRepositorio;

public class Repositorio {
    public static MarcaRepositorio Marcas = new MarcaRepositorio();
    public static ArticuloRepositorio Articulos = new ArticuloRepositorio();
    public static CompraRepositorio Compra = new CompraRepositorio();
    public static ManoSulfatoRepositorio ManoSulfato = new ManoSulfatoRepositorio();
}
