public class Card{
    String desc;

    Card(String desc){
        this.desc = desc;
    }

    public String getRank(){
        return desc.substring(0,desc.length()-1);
    }

    public String getSuit(){
        return desc.substring(desc.length()-1,desc.length());
    }
}
