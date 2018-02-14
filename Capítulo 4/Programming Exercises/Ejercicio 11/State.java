
package teststate;

public class State {
    
    private String state;
    private Integer poblacion;
    ciudad c1 = new ciudad();
    ciudad c2  = new ciudad();
    
    public State(){
        state = "";
        poblacion =0;
        c1.nombre = "";
        c1.prob = 0;
        c2.nombre = "";
        c2.prob = 0;
    }
    public void setEst(String edo){
        this.state = edo;
    }
    
    public void setPob(Integer poblacion){
        this.poblacion=poblacion;
    }
    
    public String getEst(){
        return this.state;
    }
    
    public int getPob(){
        return this.poblacion;
    }
    
    public void s1(String nom, Integer p){
        this.c1.setnom(nom);
        this.c1.setPob(p);
    }
    
    public void s2(String nom, Integer p){
        this.c2.setnom(nom);
        this.c2.setPob(p);
    }
    
    public String getc1(){
        return c1.getnom();
    }
    
    public String getc2(){
        return c2.getnom();
    }
    
    public Integer getpc1(){
        return c1.getpob();
    }
    
    public Integer getpc2(){
        return c2.getpob();
    }
    private class ciudad{
        private String nombre;
        private int prob;
        
        public void setnom( String nom){
            this.nombre = nom;
        }
        
        public void setPob(Integer pob){
            this.prob= pob;
        }
        
        public String getnom(){
            return this.nombre;
        } 
        
        public int getpob(){
            return this.prob;
        }
    }
}
