public class Processa1{
	public static void main(String[] args){
	System.out.println("eae carai");
	char c1 = 'x';
	byte b1 = 25;
	short s1 = 31548;
	int i1 = 2456877;
	long  lo1 = 879879879;
	//logica
	boolean bo1 = false;
	//ponto flutuante 1
	float f1 = 25.45f;
	double d1 = 45687987.456d;
	//printf,println,print
	System.out.println(c1 +"\n"+ b1 +"\n"+ s1 +"\n"+ i1 +"\n"+ lo1 +"\n"+ bo1 +"\n"+ f1 +"\n"+ d1);
	System.out.printf("A variavel c1  tipo char contém %c \n:", c1);
	System.out.printf("A variavel b1  tipo byte contém %d \n:", b1);
	System.out.printf("A variavel s1  tipo short contém %d \n:", s1);
	System.out.printf("A variavel i1  tipo int contém %d \n:", i1);
	System.out.printf("A variavel lo1  tipo long contém %d \n:", lo1);
	System.out.printf("A variavel bo1  tipo boolean contém %s \n:", bo1);
	System.out.printf("A variavel f1  tipo float contém %.2f \n:", f1);
	System.out.printf("A variavel d1  tipo double contém %.3f \n:", d1);

	}
}