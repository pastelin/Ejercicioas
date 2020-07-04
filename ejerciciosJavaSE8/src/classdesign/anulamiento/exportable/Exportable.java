
package classdesign.anulamiento.exportable;


public interface Exportable {

    void export();

}

class Tool implements Exportable{

    @Override
    public void export() {  System.out.println("Tool::export");  }

    /*
    
    // genera error porque protected no es mas accesible que public

    @Override
    protected void export() {
        System.out.println("Tool::export");
    }

    */    
}


class ReportTool extends Tool implements Exportable{
    
    public void export(){
        System.out.println("Rtool::export");
    }
    
    public static void main(String[] args) {
        
        Tool aTool = new ReportTool();
        Tool bTool = new Tool();
        callExport(aTool);
        callExport(bTool);
        
    }
    
    public static void callExport(Exportable ex){
        
        ex.export();
        
    }
    
    
}




