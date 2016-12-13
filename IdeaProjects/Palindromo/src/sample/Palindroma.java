package sample;
/**
 * Created by cyndi on 12/12/2016.
 */
public class Palindroma extends Controller{
    String palasinesp;
    String pala2;

    @Override
    public String getPala() {
        return super.getPala();
    }

    ;
    public String palimdromo (String x){
        palasinesp = pala.replace(" ", "");
        StringBuffer sb = new StringBuffer(palasinesp);
        sb = sb.reverse();
        if (palasinesp.equals(sb.toString())){
            return "Es una palabra palindroma";}
            else
            return  "No es una palabra palindroma";
    }
}
