package ers.indiv03;

public class Usuario 
{
     String nombre;
     String apellidos;
     int edad;
     String dni;
     Usuario(String a, String b, int c, String d)
     {
         nombre = a;
         apellidos = b;
         edad = c;
         dni = d;
     }
    String getNombre()
    {
         return nombre;
    }
    void setNombre(String a)
    {
        nombre = a;
    }
    String getApellidos()
    {
         return apellidos;
    }
    void setApellidos(String a)
    {
        apellidos = a;
    }
    int getEdad()
    {
         return edad;
    }
    void setEdad(int a)
    {
        edad = a;
    }String getDNI()
    {
         return dni;
    }
    void setDNI(String a)
    {
        dni = a;
    }
    public String toString()
    {
        return nombre+" "+apellidos+" "+edad+" "+dni;
    }
}