interface Backend {
    void connectServer();
}

interface Frontend {
    void responsive();
}

class Java implements Backend, Frontend {
    @Override
    public void responsive() {
        System.out.println("Java can be used as a front-end technology");
    }

    @Override
    public void connectServer() {
        System.out.println("Java can be used as a back-end technology");
    }
}

public class Multiple{
    public static void main(String[] args) {
        Java java = new Java();
        java.responsive();
        java.connectServer();
    }
}