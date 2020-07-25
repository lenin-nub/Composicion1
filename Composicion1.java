/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicion1;

/**
 *
 * @author LENIN PAUl
 */
import java.util.*;
class Pagina{
    private String contenido;
    private int numero;

public Pagina(String contenido,int numero){
this.contenido=new String(contenido);
this.numero=numero;
}
public String getContenido(){
return this.contenido;
}
public void setContenido(String nuevo_contenido){
this.contenido=nuevo_contenido;
}
public int getNumero(){
return this.numero;
}
public void setNumero(int nuevo_numero){
this.numero=nuevo_numero;
}
}
class Libro {
    private String titulo;
    private long isbn;
    private String autor;
    private int anioPublicacion;

    private Pagina[]paginas;
    private int numeroPaginas;


    public Libro(String titulo,long isbn,String autor,int anioPublicacion){
        this.titulo=titulo;
        this.isbn=isbn;
        this.autor=autor;
        this.anioPublicacion=anioPublicacion;



        this.paginas=new Pagina[999];
        for(int i=0;i<999;i++){
            this.paginas[i]=new Pagina("",0);

        }
        this.numeroPaginas=0;

    }
    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public long getIsbn(){
        return this.isbn;
    }
    public void setIsbn(long nuevo_Isbn){
        this.isbn=nuevo_Isbn;
    }
    public String getAutor(){
        return this.autor;
    }
    public void setAutor(String nuevo_autor){
        this.autor=nuevo_autor;
    }
    public int getAnioPublicacion(){
        return this.anioPublicacion;
    }
    public void setAnioPublicacion(int nuevo_anioPublicacion){
        this.anioPublicacion=nuevo_anioPublicacion;
    }
    public int getNumeroPagina(){
        return this.numeroPaginas;
    }
    public void AnadirPagina(Pagina nueva_Pagina){
        if (this.numeroPaginas<999){
            this.paginas[this.numeroPaginas]=nueva_Pagina;
            this.numeroPaginas++;
        }
    }
    public Pagina getPaginaNumero(int numero_Pagina){
        for(int i=0;i<this.numeroPaginas;i++){
            if (this.paginas[i].getNumero()==numero_Pagina){
                return this.paginas[i];
            }
        }
        return null;
    }
    public void Datos(){
        for(int i=0;i<this.numeroPaginas;i++){
            System.out.println(paginas[i].getContenido());
        }
    }
}
public class Composicion1 {


    public static void main(String[] args) {

        Libro Controles_Instrumentos=new Libro("Arranque y apagado del motor",1234345296,"Chevrolet",2020);
        Pagina pagina1=new Pagina("Asegurese de que todos los instrumentos esten en la posicion desactivada",4);
        Pagina pagina2=new Pagina("Gire interruptor de arranque a posicion ON verifique luces y combustible normal",5);


        Controles_Instrumentos.AnadirPagina(pagina1);
        Controles_Instrumentos.AnadirPagina(pagina2);
        Controles_Instrumentos.Datos();
    }

}
