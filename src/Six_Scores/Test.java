package Six_Scores;

public class Test {
    public static void main(String [] args){
        try{
            Date c=Date.getInstance("1-223");

        }catch (DateException e){
            System.err.println(e.getReason());
        }
        try{
            Date c=Date.getInstance("1,2,23");

        }catch (DateException e){
            System.err.println(e.getReason());
        }
        try{
            Date c=Date.getInstance("1fds223");

        }catch (DateException e){
            System.err.println(e.getReason());
        }
    }
}
