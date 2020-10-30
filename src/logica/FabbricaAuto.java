package logica;

public class FabbricaAuto {
	
			// 1)	Protezione della creazione ( sennò non è un Singleton ma una variante )
	
	
	private static FabbricaAuto unicaIstanza = null;		// 2)	Unico oggetto della mia classe che deve essere privato e statico 
															//		(per accedere all’unico oggetto devo usare getInstance()) 
	
	public static FabbricaAuto getInstance()			// 3)	Metodo statico per inizializzare il singolo oggetto
	{
		if(unicaIstanza == null)
		{
				unicaIstanza = new FabbricaAuto();	// E' come se fosse una new senza conoscere la classe
		}
	
		return unicaIstanza;
		
	}
	
	// Con i punti 2) e ) creo il Singleton
	
	
	private static Class factoryClass = null;				// Istanza che mi permetterà di istanziare uno ed un solo tipo di oggetto ( Reflection ) 
	
	public static void init(Class fc)						// Sempre Reflection
	{
		assert(fc.isInstance(FabbricaAuto.class));			// Controllo che l'oggetto sia di tipo FabbricaAuto
		assert(fc!=null);									// Controllo che non sia nullo
		assert(unicaIstanza == null); 						// Controllo se è già stato istanziato, se è stato già istanziato non va bene
		
		factoryClass = fc;
	}
	
	public  String value = null;
	
	
	public Utilitaria creaUtilitaria() { return new Utilitaria(); }
	public Sportiva creaSportiva()	{ return new Sportiva(); }
	public Suv creaSuv() 	{ return new Suv(); }
	
}

 
// Reflection : Capacità del programma di ispezionare se stesso -> Reflection ----->  Class classe = d.getClass(); g.getName(); 
// Quindi posso ispezionare, richiamare metodi di un oggetto senza conoscerlo


