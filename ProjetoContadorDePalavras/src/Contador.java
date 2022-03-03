import java.util.HashMap;
import java.util.Map;

public class Contador {
	public static void main(String[] args) {

//		String original = "Ave Maria gratia plena Dominus tecum Benedictas tu in molieribus et benedictus frutus ventris tui Iesu Sancta Maria Mater Dei ora pro nobis peccatoribus nunc et ora mostis nostrae Amen";
		String original = "Pater noster qui es in caleis Santificertun Nomen tuum Fiat voluntas tua sicut in Caelum et in Terra. Panes nostrum quotidianus da nobis hodie et dimiti debitoius nostris sicut dimmitimus debitoribus nostris. Ne nos indulcas in tentationes sed liberalos a malo Amen";
		original = original.replaceAll(",","")
				           .replaceAll("\\?","")
				           .replaceAll("\\.", "")
				           .replaceAll("!", "");

		HashMap<String, Integer> mapa = new HashMap<String, Integer>();

		String palavras[] = original.split(" ");
		
		for (String palavra: palavras) {
			if (mapa.get(palavra) != null) {  // ele já existe no mapa
				mapa.replace(palavra, mapa.get(palavra)+1);
			}
			else {
				mapa.put(palavra, 1);
			}
		}
		
		for (Map.Entry<String, Integer> valor: mapa.entrySet()) {
			System.out.println(valor.getKey() + " - " + valor.getValue());
		}
		//System.out.println(mapa);
	}

}
