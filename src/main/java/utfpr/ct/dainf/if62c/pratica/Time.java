/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author DANIEL
 */
public class Time {
    
    private HashMap<String, Jogador> jogadores;
    private List<Jogador> time;
    
    public Time() {
        jogadores = new HashMap<>();
        time = new ArrayList<>();
    }
    
    public List<Jogador> ordena(JogadorComparator comparador) {
        time.sort(comparador);
        return time;
    }
    
    public void addJogador(Jogador jogador) {
        time.add(jogador);
    }
    
    public List<Jogador> getTime() {
        return time;
    }
    
    
    public void addJogador(String posicao, Jogador jogador) {
        jogadores.put(posicao, jogador);
    }
    
    public HashMap<String, Jogador> getJogadores() {
        return jogadores;
    }
    
}