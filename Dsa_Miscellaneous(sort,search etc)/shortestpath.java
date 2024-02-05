import java.lang.Math;;
public class shortestpath {
    public static void main(String[] args) {
        
        String path="WNEENESENNN";
        int x=0;
        int y=0;
        for(int i=0;i<path.length();i++){
    char dir=path.charAt(i);
            if(dir=='W'){
                x+=-1;
            }
            if(dir=='N'){
                y+=1;
            }
            if(path.charAt(i)== 'S'){
                y+=-1;
            }
            if(path.charAt(i)== 'E'){
                x+=1;
            }
            
        }

        System.out.println("THE SHORTEST PATH IS " + (float)Math.sqrt(((x)*(x))+((y)*(y))));


    }
    
}
