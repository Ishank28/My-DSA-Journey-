package greedyalgo;
import java.util.ArrayList;
import java.util.Collections;

public class jobselectionproblem {
    
    static class Job{
        int deadline;
        int id;
        int profit;
        public Job(int i,int a,int j){
            deadline=i;
            id=a;
            profit=j;
        }
    }
    public static void main(String[] args) {
        //a 2d array to store the daedline and the profits 
        int[][] jobinfo={{4,20},{1,10},{1,40},{1,20}};
        //Creating arraylist to store the jobs objects
        ArrayList<Job> jobs = new ArrayList<>();
        //NOW ASSIGNING THE VALUES TO THE NEW OBJECTS
        for(int i=0;i<jobinfo.length;i++){
            jobs.add(i,new Job(jobinfo[i][0],i,jobinfo[i][1]));
        }
        //sorting the arraylist in descending order on basis of profit
        Collections.sort(jobs,(obj1,obj2) -> obj2.profit - obj1.profit);
        //creating a new arraylist for answer
         ArrayList<Integer> jobselected = new ArrayList<>();
        //now using the objects to select the jobs.
        int time=0;
        int profitmade=0;
        for(int i=0;i<jobs.size();i++){
            if((jobs.get(i)).deadline>time){
                time++;
                jobselected.add((jobs.get(i)).id);
                profitmade=profitmade+(jobs.get(i)).profit;
            }
        }

        System.out.println("The jobs selected are");
        for(int i=0;i<jobselected.size();i++){
            System.out.println("JOB -> " + jobselected.get(i));
        }
      
          System.out.println("The Profit Made Is " + profitmade);
    }
}
