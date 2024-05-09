package util;


public abstract class MisArrays {
	
	public float mediaNota(float[]array) {
		
		float b = 0;
		for(int i = 0 ; i < array.length ; i++) {
			float a = array[i];
			if(a <0 || a>10) {
				throw new IllegalArgumentException("El valor sobrepasa los limites");
			}
			else {		
			b = b + a;
			}
		}
		
		float media = b/array.length;
		return media;
	}
	
	
	

}
