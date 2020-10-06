public class Newsfeed {


    public Newsfeed(){

    }

    public String[] getTopics(){ //String array = "String[]"
        String topics[] = {"Opinion","Tech","Science","Health"}; //Husk fucking semicolon
        return topics;
    }

    public static void main(String[] args){
        Newsfeed sampleFeed = new Newsfeed();
    /*
    String[] topics = sampleFeed.getTopics();
    System.out.println(topics);
    */
    }
}
