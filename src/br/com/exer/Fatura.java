package br.com.exer;

import com.sun.prism.PixelFormat;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Created by BRUNO on 04/09/2017.
 */
public class Fatura {
    private String emailDevedor;
    private double valor;
    private LocalDate dataVencimento;
    private boolean notificacaoEnviada;

    public Fatura(String emailDevedor, double valor, LocalDate dataVencimento) {
        this.emailDevedor = emailDevedor;
        this.valor = valor;
        this.dataVencimento = dataVencimento;

    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getEmailDevedor() {
        return emailDevedor;
    }

    public void setEmailDevedor(String emailDevedor) {
        this.emailDevedor = emailDevedor;
    }

    public boolean isNotificacaoEnviada() {
        return notificacaoEnviada;
    }

    public void setNotificacaoEnviada(boolean notificacaoEnviada) {
        this.notificacaoEnviada = notificacaoEnviada;
    }

    public String resumo(){
        String dataVencimento = this.dataVencimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return String.format("Valor R$ %s, vencimento: %s",this.valor,this.dataVencimento);
    }
}
