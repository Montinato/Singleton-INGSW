package logica;

public class mainSingleton
{
	public static void main(String[] args) 
	{ 
		FabbricaAuto.init(FabbricaMERCEDES.class);		// Specifico che voglio creare una Fabbrica di tipo AUDI, devo vedere meglio questa cosa
		
		
		//FabbricaAuto F = new FabbricaAuto();
		
		
		// OK FUNZIONA
		
		// L'unico modo per avere una Fabbrica e' usare il getInstance()
		FabbricaMERCEDES F = FabbricaMERCEDES.getInstance();
		
		F.creaSportiva();
		
	}
}


// Provare a vedere perchè non funziona bene, succede questa cosa : unicaIstanza = (FabbricaMERCEDES)  factoryClass.newInstance();  il newInstance() viene cancellato
// Provare ad implementarlo senza usare la reflection