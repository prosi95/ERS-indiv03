package ers.indiv03;

public class Producto
{
     String nombre;
     String referencia;
     int unidades;
     Producto(String a, String b, int c)
     {
         nombre = a;
         referencia = b;
         unidades = c;
     }
    String getNombre()
    {
         return nombre;
    }
    void setNombre(String a)
    {
        nombre = a;
    }
    String getReferencia()
    {
         return referencia;
    }
    void setReferencia(String a)
    {
        referencia = a;
    }
    int getUnidades()
    {
         return unidades;
    }
    void setUnidades(int a)
    {
        unidades = a;
    }
    public String toString()
    {
        return nombre+" "+referencia+" "+unidades;
    }
}