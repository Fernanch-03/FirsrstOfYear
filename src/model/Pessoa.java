
package model;

public abstract class Pessoa {
    
    private String nome;
    private String rg;
    private String cpf;
    private Integer idade;

    public void setNome(String nome){
    
        if (nome!=""){
            this.nome = nome;
        }
        else{}
    }
    
      public void setRg(String rg){
    
        if (rg!=""){
            this.rg = rg;
        }
        else{}
    }
      
      public void setCpf(String cpf){
          
    
        if (cpf!=""){
            this.cpf = cpf;
        }
        else{}
    }
      
      public void setIdade(Integer idade){
          
          this.idade = idade;
      }
      
      public String getNome(){
        
        return this.nome;
    } 
      public String getCpf(){
          
          return this.cpf;
      }
      
      public String getRg(){
      
          return this.rg;
      }
   
      public Integer getIdade(){
      
          return this.idade;
      }
      
}
