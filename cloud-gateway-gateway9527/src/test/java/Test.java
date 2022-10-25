import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author ljw
 * @date 2022/10/25 8:50
 */

public class Test {

   @org.junit.Test
    public void testFor(){
        List<String> a = new ArrayList<String>();
        a.add("1");
        a.add("2");
        for (String s : a) {
            if ("2".equals(s)){
                a.remove(s);
            }
        }
        System.out.println(a);

    }

    
    @org.junit.Test
    public void testIterator(){
        List<String> a = new ArrayList<String>();
        a.add("1");
        a.add("2");

        Iterator<String> iterator = a.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();

            if ("2".equals(next)){
                iterator.remove();
            }
        }
        System.out.println(a);
    }



}
