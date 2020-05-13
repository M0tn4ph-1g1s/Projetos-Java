public class Filme {
    public void alugarFilme(int dias){
          if ((dias > 0) && (dias <= 5)){
              System.out.println("Aluguel feito.");
          }else{
              System.out.println("Não é possível alugar um filme por menos de 0 dias ou mais de 5 dias.");
          }
    }
}