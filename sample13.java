class sample13 {
    
    public static void main(String args[]){
     
     String str="hi hello bitLabs";   
          int max=0;
          String longestword=null;
        String words[]=str.split(" ");
        
        for(int i=0;i<words.length;i++){    
            
            if(max<words[i].length()){     
                max= words[i].length();    
                longestword=words[i];     
            }
            
        }
        System.out.println("Longest word is: "+longestword);
           
           
    }
    
}