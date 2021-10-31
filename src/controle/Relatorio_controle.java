/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import jdk.nashorn.internal.ir.BreakNode;
import model.Relatorio_modelo;

/**
 *
 * @author sulis
 */
public class Relatorio_controle {
    private ArrayList<String>maximoeminimo=new ArrayList<String>(); 

    public DefaultTableModel buscar_relatorio(String mes, String ano, DefaultTableModel tabela) {
        int ano_formatado = Integer.parseInt(ano);
        DefaultTableModel tabelar = tabela;
        ArrayList<Relatorio_modelo> relatorios = new ArrayList<Relatorio_modelo>();
        switch (mes) {

            case "Selecionae o mês":
                break;
            case "janeiro":
                relatorios = new Relatorio_modelo().buscar_relatorio(ano_formatado + "/01/00", ano_formatado + "/02/00");
                break;
            case "fevereiro":
                relatorios = new Relatorio_modelo().buscar_relatorio(ano_formatado + "/02/00", ano_formatado + "/03/00");

                break;
            case "março":
                relatorios = new Relatorio_modelo().buscar_relatorio(ano_formatado + "/03/00", ano_formatado + "/04/00");
                break;
            case "abril":
                relatorios = new Relatorio_modelo().buscar_relatorio(ano_formatado + "/04/00", ano_formatado + "/05/00");
                break;
            case "maio":
                relatorios = new Relatorio_modelo().buscar_relatorio(ano_formatado + "/05/00", ano_formatado + "/06/00");
                break;
            case "junho":
                relatorios = new Relatorio_modelo().buscar_relatorio(ano_formatado + "/06/00", ano_formatado + "/07/00");

                break;
            case "julho":
                relatorios = new Relatorio_modelo().buscar_relatorio(ano_formatado + "/07/00", ano_formatado + "/08/00");
                break;
            case "agosto":
                relatorios = new Relatorio_modelo().buscar_relatorio(ano_formatado + "/08/00", ano_formatado + "/09/00");
                break;
            case "setembro":
                relatorios = new Relatorio_modelo().buscar_relatorio(ano_formatado + "/09/00", ano_formatado + "/10/00");
                break;
            case "outubro":
                relatorios = new Relatorio_modelo().buscar_relatorio(ano_formatado + "/10/00", ano_formatado + "/11/00");
                System.out.println("outubro"+ano_formatado + "/10/00");
                break;
            case "novembro":
                relatorios = new Relatorio_modelo().buscar_relatorio(ano_formatado + "/10/00", ano_formatado + "/11/00");
                break;
            case "dezembro":
                relatorios = new Relatorio_modelo().buscar_relatorio(ano_formatado + "/11/00", ano_formatado + "/12/00");
                break;

        }
        //remover linhas antigas da tabela
        while(tabela.getRowCount()!=0){
            tabela.removeRow(0);
        }
        //adicionando anovas linhas a tabela
        for (int i = 0; i < relatorios.size(); i++) {
                    Object[] relatorio = {relatorios.get(i).getNome_produto(), relatorios.get(i).getQuantidade_total_vendida(), relatorios.get(i).getValor_investido(), relatorios.get(i).getFaturamento_geral(), relatorios.get(i).getFaturamento_final()};
                    tabelar.addRow(relatorio);
                }
        return  tabelar;
    }
    
}
