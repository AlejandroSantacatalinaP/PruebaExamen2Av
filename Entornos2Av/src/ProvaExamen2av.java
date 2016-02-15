import javax.swing.SingleSelectionModel;

public class ProvaExamen2av {
	public static String mensaje="Paquito es el tio mas guapo que conozco"; //Ponemos la oración a codificar.
	public static String mensajeCodificado=""; //Preparamos un string para codificar la oración.
	public static String temporal=""; //Dejamos un string para los cambios.


	
	
public static void main(String[] args){	
		
	mensajeCodificado=mensaje.toUpperCase(); //Pasamos la frase a mayúscula
	for(int i=0;i<mensaje.length();i+=2){  //Este for recorre de dos en dos el string mensaje.
			
			if(i+1==mensajeCodificado.length()){
				
				temporal=temporal+mensajeCodificado.charAt(i);
			}else{
			temporal=temporal+mensajeCodificado.charAt(i+1)+mensajeCodificado.charAt(i);
		}
	}
		mensajeCodificado=temporal; //Pasamos el string temporal al string definitivo.
		System.out.println(mensajeCodificado); //Sacamos por pantalla el resultado.
		

}
}
