/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

import java.util.Comparator;

/**
 *
 * @author DANIEL
 */
public class JogadorComparator implements Comparator<Jogador> {
    
    private boolean a;
    private boolean b;
    private boolean c;
    
    public JogadorComparator() {
        a=true;
        b=true;
        c=true;
    }
    
    public JogadorComparator(boolean a, boolean b, boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public int compare(Jogador j1, Jogador j2) {
        if(a) {
            if(j1.compareTo(j2) == 0) {
                if(c) {
                    return j1.getNome().compareTo(j2.getNome());
                } else {
                    return -j1.getNome().compareTo(j2.getNome());
                }
            } else {
                if(b) {
                    return j1.compareTo(j2);
                } else {
                    return -j1.compareTo(j2);
                }
            }          
        } else {
            if(j1.getNome().compareTo(j2.getNome()) == 0) {
                if(b) {
                    return j1.compareTo(j2);
                } else {
                    return -j1.compareTo(j2);
                } 
            } else {
                if(c) {
                    return j1.getNome().compareTo(j2.getNome());
                } else {
                    return -j1.getNome().compareTo(j2.getNome());
                }
            }
        }
    }
    
}
