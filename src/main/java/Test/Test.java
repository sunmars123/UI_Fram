package Test;

import Utils.DriverFactory;
import Utils.Locator;
import Utils.XmlUtils;

import java.util.HashMap;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
		DriverFactory.getChromeDriver();
//        HashMap<String, Locator> map = XmlUtils.readPageXml("xml\\page.xml", "com.maste.pageAction.LoginIndex");
//        Set<String> set = map.keySet();
//        for(String s:set){
//            System.out.println(s+":"+map.get(s));
//        }
    }
}
