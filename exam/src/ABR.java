
public class ABR extends java.lang.Object {

	public int keys[] ;
	
	public ABR () {  // creates an empty ABR
		this.keys = keys ;
	}
	
	public boolean contains(int a) {
		 for (int i=0; j<this.keys.length; i++) {
			 if (a == this.keys[i]) {
				 return true ;
			 }
		 }
		 return false ;
	}
	
	public void insert (int a) {
		
	}
	
	public boolean isEmpty () {
		return(this.keys.length == 0);
	}
	
	public int nbElements () {
		return this.keys.length ;
	}
	
}
