enum Pagamentos {
    CARTAO_CREDITO, CARTAO_DEBITO, PIX, BOLETO
}


public class Enums {
    public static void main(String[] args) {
        
        Pagamentos pagamento = Pagamentos.PIX;
        System.out.println("Pagamento: " + pagamento);

    }
}
