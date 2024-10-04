public class SomaPares {

	public static void main(String[] args) {
	int i, resultado=0;
	for(i=1; i<=500; i ++) {
		if(i%2==0) {
			resultado +=i;
		}else {
			continue;
		}
	}System.out.println("O resultado das somas é: "+resultado);

}
}