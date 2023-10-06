package ejercicio1;

enum Vestuario {
    BLUSA("blusa", "morada", 57){
        @Override
        public String DescripcionPrenda() {
            return "la blusa disponible es morada";
        }
    },
    JEAN("pantalon", "skinny", 65){
        @Override
        public String DescripcionPrenda() {
            return "tipo de jean skinny en todas las tallas";
        }
    },
    CAMISETA("camiseta", "azul", 32){
        @Override
        public String DescripcionPrenda() {
            return "la camiseta en stock es azul supreme";
        }
    },
    CAMISA("camisa", "botones", 38){
        @Override
        public String DescripcionPrenda() {
            return "la camisa de botones es manga larga";
        }
    };
    private String nombre;
    private String descripcion;
    private int numeroest;


    Vestuario(String nombre, String descripcion, int numeroest) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numeroest = numeroest;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNumeroest() {
        return numeroest;
    }

    public void setNumeroest(int numeroest) {
        this.numeroest = numeroest;
    }
    public abstract String DescripcionPrenda();

}