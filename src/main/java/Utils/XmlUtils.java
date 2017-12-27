package Utils;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class XmlUtils {
    private XmlUtils(){}
    public static HashMap<String,Locator> readPageXml(String path,String pageName){
        HashMap<String,Locator> locatorMap = new HashMap<String,Locator>();
        locatorMap.clear();
        File file = new File(path);
        if(!file.exists()){
            try {
                throw new IOException("can't find:"+path);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        //创建解析对象
        SAXReader saxReader = new SAXReader();
        //获取xml对象
        Document document=null;
        Element elementRoot =null;
        try {
            document = saxReader.read(file);
            elementRoot = document.getRootElement();
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        List<Element> elementList = elementRoot.elements();
        for(Element eRoot:elementList){
            if(pageName.equals(eRoot.attribute(0).getValue())){
                List<Element> locatorList = eRoot.elements("locator");
                for(Element eLocat:locatorList){
                    String type = null;
                    String timeOut =null;
                    String value = null;
                    String locatorName =null;
                    locatorName = eLocat.getText();
                    for(Iterator<Attribute> attributList = eLocat.attributeIterator();attributList.hasNext();){
                        Attribute attribute = attributList.next();
                        if(attribute.getName().equalsIgnoreCase("type")){
                            type = attribute.getValue();
                        }else if(attribute.getName().equalsIgnoreCase("timeOut")){
                            timeOut = attribute.getValue();
                        }else{
                            value = attribute.getValue();
                        }
                    }
                    locatorMap.put(locatorName,new Locator(value,Integer.parseInt(timeOut),BytypeIpml.getBytype(type)));
                }
            }
        }
        return locatorMap;
    }
}
