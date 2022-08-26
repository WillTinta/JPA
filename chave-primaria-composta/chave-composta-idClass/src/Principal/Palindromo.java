package Principal;
import java.util.Scanner;

public class Palindromo {

public static int contaLetra(String palavra, int letra){
int qtdLetra = 0;

for (int i = 0 ; i < palavra.length();i++){

if (palavra.codePointAt(i) == letra)
{
qtdLetra++;
}
}

return qtdLetra;
}
public static void main(String[] args) {

Scanner ler = new Scanner(System.in);

String palavra = (ler.nextLine()).toUpperCase();

int qtdInpar=0;
int n_palidromo=0;
for(int i = 0;i<26;i++){

if(contaLetra(palavra, i+65)%2!=0){
qtdInpar++;
}

if (qtdInpar == 2){
i = 26;
n_palidromo = 1;
}
}

System.out.println(n_palidromo);
}
}

