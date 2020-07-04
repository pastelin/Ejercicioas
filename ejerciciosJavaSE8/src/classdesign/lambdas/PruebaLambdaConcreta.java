package classdesign.lambdas;

import java.util.*;

public class PruebaLambdaConcreta implements PruebaLambda{

    @Override
    public List<String> addName() {
        
        List<String> listaName = new ArrayList();
        
        listaName.add("Juan");
        
        return listaName;
        
    }

}
