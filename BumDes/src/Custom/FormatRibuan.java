/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Custom;

import java.text.DecimalFormat;

/**
 *
 * @author Administrator
 */
public class FormatRibuan {

    public FormatRibuan() {
    }
    
    public String pisahRibuan(int value) {
        DecimalFormat m = new DecimalFormat("###,###.##");
        String output = m.format(value);
        return output;
    }
}
