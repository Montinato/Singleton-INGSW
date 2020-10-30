package logica;

public class FabbricaBMW extends FabbricaAuto
{
	
	private FabbricaBMW() { }			// 1)	Protezione della creazione ( sennò non è un Singleton ma una variante )
	
	
	private static FabbricaBMW unicaIstanza = null;		// 2)	Unico oggetto della mia classe che deve essere privato e statico 
															//		(per accedere all’unico oggetto devo usare getInstance()) 
	
	public static FabbricaBMW getInstance()			// 3)	Metodo statico per inizializzare il singolo oggetto
	{
		if(unicaIstanza == null)
		{
				unicaIstanza = new FabbricaBMW();	// E' come se fosse una new senza conoscere la classe
		}
	
		return unicaIstanza;
		
	}
	// Con i punti 2) e ) creo il Singleton
	
	
	private static Class factoryClass = null;				// Istanza che mi permetterà di istanziare uno ed un solo tipo di oggetto ( Reflection ) 
	
	public static void init(Class fc)						// Sempre Reflection
	{
		assert(fc.isInstance(FabbricaBMW.class));			// Controllo che l'oggetto sia di tipo FabbricaBMW
		assert(fc!=null);									// Controllo che non sia nullo
		assert(unicaIstanza == null); 						// Controllo se è già stato istanziato, se è stato già istanziato non va bene
		
		factoryClass = fc;
	}
	
	private String value; 
	

	public String getValue() {
		return value;
	}


	public void setValue(String value) {
		this.value = value;
	}


	public UtilitariaBMW creaUtilitaria() {
		return new UtilitariaBMW();
		
	}

	
	public SportivaBMW creaSportiva() {
		return new SportivaBMW();
	}

	
	public SuvBMW creaSuv() {
		// TODO BMW-generated method stub
		return new SuvBMW();
	}




}
