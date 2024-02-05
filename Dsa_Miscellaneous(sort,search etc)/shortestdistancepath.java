public class shortestdistancepath {
    
    public static int shortestdistance(String str){
        int x=0;
        int y=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 'W' ){
               x-=1;
            }
            if(str.charAt(i) == 'E' ){
               x+=1;
            }
            if(str.charAt(i) == 'N' ){
               y+=1;
            }
            if(str.charAt(i) == 'S' ){
               y-=1;
            }
        }
        
        int shortestdistance= (int) Math.sqrt( x*x + y*y );
        return shortestdistance;
    }

    public static void main(String[]Args){

        String str="WNEENESENNN";
        System.out.println(shortestdistance(str));

    }
}
