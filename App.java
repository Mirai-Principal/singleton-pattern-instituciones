package mi_singleton.singleton_pj;
public class App 
{
    public static void main( String[] args )
    {
       	
    	Institucion institucion1 = Institucion.getInstance();
    	institucion1.setNombre("NASA");
    	System.out.println( institucion1.getNombre() );
    }
}
