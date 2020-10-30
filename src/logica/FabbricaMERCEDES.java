package logica;

public class FabbricaMERCEDES extends FabbricaAuto
{
	
	private FabbricaMERCEDES() { }			// 1)	Protezione della creazione ( sennò non è un Singleton ma una variante )
	
	
	private static FabbricaMERCEDES unicaIstanza = null;		// 2)	Unico oggetto della mia classe che deve essere privato e statico 
															//		(per accedere all’unico oggetto devo usare getInstance()) 
	
	public static FabbricaMERCEDES getInstance()			// 3)	Metodo statico per inizializzare il singolo oggetto
	{
		if(unicaIstanza == null)
		{
			try {
				unicaIstanza = (FabbricaMERCEDES)  factoryClass.newInstance();		// E' come se fosse una new senza conoscere la classe
			} catch (InstantiationException e) {
				// TODO: handle exception
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		return unicaIstanza;
		
	}
	
	// Con i punti 2) e ) creo il Singleton
	
	
	private static Class factoryClass = null;				// Istanza che mi permetterà di istanziare uno ed un solo tipo di oggetto ( Reflection ) 
	
	public static void init(Class fc)						// Sempre Reflection
	{
		assert(fc.isInstance(FabbricaMERCEDES.class));			// Controllo che l'oggetto sia di tipo FabbricaMERCEDES
		assert(fc!=null);									// Controllo che non sia nullo
		assert(unicaIstanza == null); 						// Controllo se è già stato istanziato, se è stato già istanziato non va bene
		
		factoryClass = fc;
	}
	

	
	public UtilitariaMercedes creaUtilitaria() {
		return new UtilitariaMercedes();
		
	}

	public SportivaMercedes creaSportiva() {
		return new SportivaMercedes();
		
	}

	public SuvMercedes creaSuv() {
		// TODO MERCEDES-generated method stub
		return new SuvMercedes();
	}

	

}
