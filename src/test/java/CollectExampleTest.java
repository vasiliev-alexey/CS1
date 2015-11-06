import com.av.domain.R124;
import com.av.domain.R124Item;
import com.av.utils.KIEServices;
import org.junit.Test;
import org.kie.api.runtime.KieSession;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * Created by vasil on 06.11.2015.
 */
public class CollectExampleTest {

    @Test
    public void testCollect() {

        System.out.println("eee");
        KieSession session = KIEServices.getSession("collectSample.drl");

        session.insert(genDoc());

        session.fireAllRules();






    }

    public R124 genDoc() {

        R124 r = new R124();
        r.setS1("1");
        r.setS2("3");


        List<R124Item> list = new ArrayList<R124Item>();
        for (int j = 1; j < 4 ; j++) {


        for (int i = 0; i < 9; i++) {

            R124Item item = new R124Item();
            item.setKosgu("22" + i);
            item.setPpp("100");
            item.setData001(Long.valueOf(i));
            list.add(item);

        }

        r.setLines(list);
        }




        return r;

    }


}
