package Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rb
 */
public class Main {

    public static void main(String[] args)
    {
        Aluguel a;

        Cliente c = new Cliente("Sicrano");
        DVD d1 = new DVD("Titulo 1", DVD.Tipo.normal);
        DVD d2 = new DVD("Titulo 2", DVD.Tipo.lancamento);
        DVD d3 = new DVD("Título 3", DVD.Tipo.infantil);
        DVD d4 = new DVD("Título 4", DVD.Tipo.normal);

        a = new Aluguel(d1, 3);
        c.adicionaAluguel(a);
        a = new Aluguel(d2, 2);
        c.adicionaAluguel(a);
        a = new Aluguel(d3, 4);
        c.adicionaAluguel(a);
        a = new Aluguel(d4, 10);
        c.adicionaAluguel(a);
        System.out.println(c.extrato());
    }
}