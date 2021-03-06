/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infra;

import java.util.ArrayList;
import model.Token;

/**
 *
 * @author Joao
 */
public class Container {
    private static ArrayList<Token> tokens = new ArrayList<Token>();
    
    public static Token get(int index){
        
        if(index < tokens.size()){
            return tokens.get(index);
        }
        
        return tokens.get(index-1);
    }
    
    public static int get_size(){
        return tokens.size();
    }
    
    public static void add(Token token){
        tokens.add(token);
    }
    
    public static void list_all(){
        for(Token token : tokens){
            token.describe();
        }
    }
    
}
