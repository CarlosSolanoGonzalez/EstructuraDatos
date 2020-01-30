
package estructuradatos;

/**
 *
 * @author CHARLIE-PC
 */
public class InvestedString {
    
    private String receiveText(String text){
        return text;
    }
    
    private int stringLength(String text){
        return text.length()-1;
         
    }
    
    private void investedString(String text, int pos,int textLength){
        if(pos==textLength){
            System.out.print(text.charAt(pos));
        }else{
            investedString(text,pos+1,textLength);
            System.out.print(text.charAt(pos));
        }
    }
    
    public void star(){
        String text;
        int pos;
        int textLength;
        text=receiveText("Hellow World");
        textLength=stringLength(text);
        pos=0;
        investedString(text,pos,textLength);
        
    
    }
    
}
