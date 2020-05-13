public class Filme24Horas extends Filme {
 
    @Override
    public void alugarFilme(int dias) {
        if ((dias > 0) && (dias <=1)){
            System.out.println("Aluguel feito.");
        }else{
            System.out.println("Filme 24 horas deve ser alugado por no máximo 1 dia.");
        }
    }
}