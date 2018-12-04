package br.com.db1.db1start;

public class Texto {


	public String textoMaisculo(String texto) {
		return texto.toUpperCase();	
	}
	public String textoMinusculo(String texto) {
		return texto.toLowerCase();		
	}
	public Integer tamanhoTexto(String texto) {
		return texto.length();
	}
	public Integer tamanhoTextoEspacoso(String texto) {
		return texto.length();
	}
	public Integer tamanhoTextoSemEspaco(String texto) {
		texto = texto.replaceAll(" ", "");
		return texto.length();
	}
	
	public String primeiraQuatroLetras(String texto) {
		return texto.substring(0, 4); //texto.lenght - 4 ??
	}
	
	public String aPartirDaTerceiraLetra(String texto) {
		return texto.substring(2);
		
	}
	public String ultimasQuatroLetras(String texto) {
		return texto.substring(texto.length() - 4);
	}
	
	public String substituiNomePorAluno(String texto) {
	    int c =  (texto.indexOf( ' ' ));
	    String str =("Aluno");
		texto.substring(c);
		
		String newStr = str.concat( (texto.substring(c)) );
		
		//int indexEspaco = nome.indexOf(" ");
		//String primeiroNome = nome.substring(0, indexEspaco);
		//return nome.replace(primeiroNome,"Aluno");
		return newStr;

	}
	
	public String[] separaTextoComVirgula(String texto) {
		String[] textoArray = new String[5];
		textoArray = texto.split(",");
		//Remove white space 
		//String[] textoArray = texto.split("\\s*,\\s*");
		return textoArray; 
	}
	
	public Integer contaVogal(String texto) {
		int c = 0;
		for(int i=0;i<texto.length();i++)
        {
            char ch=texto.charAt(i);
           
            if((ch=='a')||(ch=='A')||(ch=='e')||(ch=='E')||(ch=='i')||
               (ch=='I')||(ch=='o')||(ch=='O')||(ch=='u')||(ch=='U'))
            	
            	c++;
        }
        return c ;
	}
	
	public String inverteString(String texto) {
		
		 int j = texto.length();
		 char[] newStr = new char[j];
		 
		 for (int i = 0; i < texto.length(); i++) {
			 newStr[--j] = texto.charAt(i);
		  }
		 //new StringBuilder(texto).reverse().toString();
		 return new String(newStr);

	}
	
	
	
	
}
