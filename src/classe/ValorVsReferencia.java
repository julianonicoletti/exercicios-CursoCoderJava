package classe;

public class ValorVsReferencia {
    public static void main(String[] args) {
        double a = 2;
        double b = a;

        Data d1 = new Data(1, 6, 2022);
        Data d2 = d1;
        d1.dia = 30;
        d2.mes = 05;
        d1.ano = 2015;

        System.out.println(d1.obterDataFormatada() +" "+ d2.obterDataFormatada());
        voltarDataParaValorPadrao(d1);

        System.out.println(d1.obterDataFormatada() +" "+ d2.obterDataFormatada());
        int c = 5;
        int d = alterarPrimitivo(c);
        System.out.println(c);
        System.out.println(d);
    }
    static void voltarDataParaValorPadrao(Data d) {
        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;
    }
    static int alterarPrimitivo(int c) {
        return ++c;

    }
}
