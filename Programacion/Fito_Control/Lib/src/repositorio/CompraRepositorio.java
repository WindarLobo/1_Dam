package repositorio;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

import modelo.*;

public class CompraRepositorio implements IRepositorio {
    private static final ArrayList<Modelo> Compras = new ArrayList<>();

    @Override
    public Modelo Añadir(Modelo modelo) throws IOException {

        Compra compra = (Compra) modelo;

        if (!Compras.isEmpty()) {

            Modelo last = Compras.get(Compras.size() - 1);

            compra.Id = last.Id + 1;
        } else {
            compra.Id = 1;
        }
        int detalleId = 0;

        for (CompraArticulo detalleCompra : compra.getArticulos()) {

            detalleCompra.Id = ++detalleId;

            detalleCompra.setIdCompra(compra.Id);

            Articulo articulo = detalleCompra.getArticulo();

            articulo.setCantidad(articulo.getCantidad() + detalleCompra.getCantidad());
        }
        Compras.add(compra);

        return compra;
    }

    @Override
    public ArrayList<Modelo> ObtenerTodos() {

        return Compras;
    }

    @Override
    public void cargarDesdeFichero() throws FileNotFoundException {

        File archivo = new File("Compra.txt");
        Scanner scanner = new Scanner(archivo);
        try {
            while (scanner.hasNextLine()) {
                String[] split = scanner.nextLine().split(",");
                SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                Compras.add(new Compra(Integer.parseInt(split[0]), formatoFecha.parse(split[1])));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            scanner.close();
        }

        ArrayList<Modelo> CompraArticulo = new ArrayList<>();
        archivo = new File("CompraArticulo.txt");
        scanner = new Scanner(archivo);
        try {
            while (scanner.hasNextLine()) {
                String[] split = scanner.nextLine().split(",");
                CompraArticulo.add(new CompraArticulo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), Double.parseDouble(split[3]), Double.parseDouble(split[4])));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            scanner.close();
        }

        for (Modelo recorrerCompra : Compras) {
            Compra compra = (Compra) recorrerCompra;
            for (Modelo detalleDeCompraArticulo : CompraArticulo) {
                CompraArticulo compraArticulo = (CompraArticulo) detalleDeCompraArticulo;
                if (compra.Id == compraArticulo.getIdCompra()) {
                    compra.añadirArticulo(compraArticulo);
                }
            }
        }
    }

    @Override
    public void guardarEnFichero() throws IOException {
        File fichero = new File("Compra.txt");
        FileWriter fileWriter = new FileWriter(fichero, false);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        for (Modelo compra : Compras) {
            printWriter.println(((Compra) compra).toStringFichero());

        }
        fileWriter.close();

        fichero = new File("CompraArticulo.txt");
        fileWriter = new FileWriter(fichero, false);
        printWriter = new PrintWriter(fileWriter);
        for (Modelo compra : Compras) {
            for (Modelo detalleCompra : ((Compra) compra).getArticulos()) {
                printWriter.println(((CompraArticulo) detalleCompra).toStringFichero());

            }

        }
        fileWriter.close();

    }
}
