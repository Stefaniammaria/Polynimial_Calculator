import java.util.ArrayList;
import java.util.List;

public class TestClass {

    public static void main(String[] args) {
  /*      Monomial m1 = new Monomial(1,1);
        Monomial m2 = new Monomial(2,2);
        Monomial m3 = new Monomial(2,1);
        Monomial m4 = new Monomial(1,2);
        Monomial m5 = new Monomial(3,3);

        List<Monomial> lista1 = new ArrayList<Monomial>();
        List<Monomial> lista2 = new ArrayList<Monomial>();

        Polynomial p1 = new Polynomial();
        Polynomial p2 = new Polynomial();

        lista1.add(m1);
        lista1.add(m2);
        lista2.add(m3);
        lista2.add(m4);
        lista2.add(m5);

        p1.setPolinom(lista1);
        p2.setPolinom(lista2);
        Polynomial p3= p1.adunarePolinom(p1, p2);
        for (Monomial t:p3.getPolinom()) {
            System.out.println(t.getPutere() +" "+t.getCoeficient());
        }*/
        //p1.scaderePolinoame(p1.getPolinom(),p2.getPolinom());
        //p1.derivarePolinom(p2.getPolinom());

        Model model = new Model();
        View view =  new View();
        Controller c = new Controller(model,view);

        //model.conversieDinStringInPolinom("abcde");

    }
}
