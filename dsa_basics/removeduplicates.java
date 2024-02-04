public class removeduplicates {
    
    public static void removeduplicates(String str , int idx, StringBuilder newstr , boolean map[]){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }

        //kaam kya karna hai
        //i need to check if the current char is present in map or not

        char currchar=str.charAt(idx);
        if(map[currchar -'a']==true){//we have already got this char before
            removeduplicates(str, idx+1, newstr, map);
        }

        if(map[ currchar -'a']== false ){ //we do not find this index before
            map[ currchar - 'a']=true;
            removeduplicates(str, idx+1, newstr.append(currchar), map);
        }
    }
    public static void main(String[] args) {
        String str="guruji";
        int idx=0;
        
        StringBuilder newstr=new StringBuilder("");
        removeduplicates(str, 0, newstr, new boolean[26]);
    }
}
