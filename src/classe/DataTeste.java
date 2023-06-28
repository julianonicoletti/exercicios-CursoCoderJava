package classe;

public class DataTeste {
    public static void main(String[] args) {
            Data data1 = new Data(02,06,2015);
            Data data2 = new Data();

           /* data1.dia = 25;
            data1.mes = 05;
            data1.ano = 1981;

            data2.dia = 23;
            data2.mes = 06;
            data2.ano = 2020;*/
    System.out.printf("A data digitada é %s", data1.obterDataFormatada());
    String dataformatada = data2.obterDataFormatada();
    System.out.printf("\nA nova data digitada é %s", dataformatada);



    }
}
