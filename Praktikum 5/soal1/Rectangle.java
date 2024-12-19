package soal1;
  
    public class Rectangle extends Shape { 
        private final Double length; 
        private final Double width; 

        public Rectangle(Double l, Double w) { 
            super("Rectangle"); 
            this.length = l; 
            this.width = w; 
        } 

        public Double area() {
            return length * width; 
        } 
        @Override
        public String toString() {
            return super.toString() + " of length " + length + " and width " + width; 
        }     
    }