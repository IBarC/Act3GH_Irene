
public class NumAleatorios {

	public static void main(String[] args) {
		int[] array=new int[30];

        for (int i=0; i<array.length; i++){
            array[i]=(int)(Math.random()*10+1);
        }
        
        for (int j=0; j<array.length; j++){
            System.out.print(array[j] + "\t");
        }
        System.out.println("\n");

	}

}
