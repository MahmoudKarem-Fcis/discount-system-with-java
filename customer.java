/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beauty.saloon;

/**
 *
 * @author inbrief
 */
public class customer
{

    String name;
    boolean member = false;
    String membertype;
    

    public void customer() {
        name = "karem";
        member =false ;
        membertype= "Premium";

    }
    
    public void setname(String newname) {
        name = newname;
    }

    public String getname() {
        return name;
    }

    public boolean setmember() {
        return member;

    }

    public void setmember(boolean newmember) {
        member = newmember;

    }

    public String getmemberType() {
        return membertype;
    
    }
    
    public void setmembertype(String newmembertype){
       
        membertype = newmembertype ;
        
    }
    
    
   
}
