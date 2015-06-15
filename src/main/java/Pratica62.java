
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import utfpr.ct.dainf.if62c.pratica.Jogador;
import utfpr.ct.dainf.if62c.pratica.JogadorComparator;
import utfpr.ct.dainf.if62c.pratica.Time;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DANIEL
 */
public class Pratica62 {

    public static void main(String[] args) {
        JogadorComparator inspetor = new JogadorComparator(false, true, false);
        Time time = new Time();
        time.addJogador(new Jogador(4, "David Luiz"));
        time.addJogador(new Jogador(1, "David Luiz"));
        time.addJogador(new Jogador(10, "Neymar"));
        time.addJogador(new Jogador(12, "Júlio César"));
        time.addJogador(new Jogador(12, "Júlio Velasquez"));
        time.addJogador(new Jogador(12, "Zuleico"));
        
        List<Jogador> timeOrdenado = time.ordena(inspetor);
        for (Jogador j : timeOrdenado) {
            System.out.println(j);
        }
        
        Jogador teste = timeOrdenado.get(2);
        
        int encontrado = Collections.binarySearch(timeOrdenado, teste);
        System.out.println("Jogador Encontrado: " + timeOrdenado.get(encontrado));
        
    }
}
