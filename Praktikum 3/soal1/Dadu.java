package soal1;
	
	import java.util.Random;

	class Dadu {
	    private int nilai; 

	    public Dadu() {
	        this.nilai = 0; 
	    }
	    public void acakNilai() {
	        Random random = new Random();
	        this.nilai = random.nextInt(6) + 1; 
	    }
	    public int getNilai() {
	        return nilai;
	    }
	}


