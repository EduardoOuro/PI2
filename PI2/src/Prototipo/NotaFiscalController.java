/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototipo;


public class NotaFiscalController {
    
    public static boolean salvarCli(String desNomeCli,String desCPF,String desEndereco,int desNumeroCasa,String desComplemento,
            String desCidade,String desUF,String desTelefone ){
         NotaCliente notaCli = new NotaCliente();
        
        System.out.println(" agora estou no controller ");
   
          notaCli.setDescricaoNomeCli(desNomeCli);
          notaCli.setDescricaoCPF(desCPF);
          notaCli.setDescricaoEndereco(desEndereco);
          notaCli.setDescricaoNumeroCasa(desNumeroCasa);
          notaCli.setDescricaoComplemento(desComplemento);
          notaCli.setDescricaoCidade(desCidade);
          notaCli.setDescricaoUF(desUF);
          notaCli.setDescricaoTelefone(desTelefone);
          ClienteDAO dao =new ClienteDAO();  
          dao.addNota(notaCli);          
  
        return true;
    }
    
    
}
