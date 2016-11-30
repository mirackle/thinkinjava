java.util.ArrayList;
java.util.List;

public class Exercise23 {

    public static void main(String[] args) {
        printU(new Medlinker().structer());
    }

    public static void printU(U u) {
        System.out.println("ceo: " + u.ceo());     
        System.out.println("vp: " + u.vp()); 
        System.out.println("pm: " + u.pm());
    }
}

interface U {

    String ceo();

    String vp();

    String pm();
}

class Medlinker {
    
    U structer() {
        return new U() {

            @Override
            public String ceo() {
                return "王诗蕊";
            }
            
            @Override
            public String vp() {
                return "预报名";
            }

            @Override
            public String pm() {
                return "理赔的";
            }
        };
    }
}

class MedicalBusiness {
    
    private List<U> uList;

    MedicalBusiness() {
        uList = new ArrayList<U>();
    }

    void storeU(U u) {
        uList.add(u);
    }
}
