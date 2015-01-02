/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn;

import java.util.ArrayList;


/**
 *
 * @author Michu
 */
public class FiszkiWork {
    
    private String answer = "";
    
    public void setAnswer(String s) {
        answer = s;
    }
    
    public String getAnswer() {
        return answer;
    }
    
    
    public String randomLine(ArrayList<String> a) {
        int random = (int) (Math.random() * a.size());
        String randomLine = a.get(random);
        return randomLine;
    }
    
    public String question(String unedited) {
        String[] parts = unedited.split("##");
        return parts[0];
    }
    
    public String answer(String unedited) {
        String[] parts = unedited.split("##");
        return parts[1];
    }
}
