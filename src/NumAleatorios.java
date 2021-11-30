
public class NumAleatorios {

	public static void main(String[] args) {
		int[] array=new int[20];

        for (int i=0; i<array.length; i++){
            array[i]=(int)(Math.random()*10+1);
        }

        int numero = 1;

        while(numero<=10){
            int contador = 0;
            for (int j=0; j<array.length; j++){
             if(numero==array[j]){
                 contador++;
             }
            }
            System.out.println(numero + " aparece " + contador + " vez/veces");
            numero ++;
        }
	}
}
