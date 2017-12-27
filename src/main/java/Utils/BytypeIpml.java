package Utils;

public class BytypeIpml {
    private BytypeIpml(){};
    public static Bytype getBytype(String type){
        if(type == null || type.equalsIgnoreCase("xpath")){
            return Bytype.xpath;
        }else if(type.equalsIgnoreCase("id")){
            return Bytype.id;
        }else if(type.equalsIgnoreCase("cssSelector")){
            return Bytype.cssSelector;
        }else if(type.equalsIgnoreCase("name")){
            return Bytype.name;
        }
        return Bytype.xpath;
    }
}
