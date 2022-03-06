public class Model {

    public Polynomial conversieDinStringInPolinom(String s){

        char[] c = s.toCharArray();

        Polynomial polinom1 = new Polynomial();
        for(int i=0;i<c.length;i++) {
            if (c[i] >= '0' && c[i] <= '9') {
                if ((c[i - 1] == '+' || c[i - 1] == '-') && c[i + 1] == '*' && c[i + 3] == '^') {
                    int coeficient = Integer.parseInt(String.valueOf(c[i]));
                    int putere = Integer.parseInt(String.valueOf(c[i + 4]));
                    Monomial m = new Monomial(coeficient, putere);
                    polinom1.add(m);
                }
            }
        }
        return polinom1;
    }
}
