import java.util.List;
import java.lang.Integer;
import java.util.ArrayList;


public class ABR extends java.lang.Object {

	public int[] keys ;
	public int[] place;
	
	public ABR () {  // creates an empty ABR
		this.keys = keys ;  // values in the ABR
		this.place = place;  // place of the values in the tree
	}
	
	private int[] k_p (int key) {
		for (int i=0; i<this.keys.length; i++) {
			if (this.keys[i] == key) {
				int[] r = {this.place[i], this.place[i+1]} ;
				return r ;
			}
		}
	}
	
	private int p_k (int p1, int p2) {
		for (int i=0; i<this.keys.length; i++) {
			if (this.place[i] == p1 && this.place[i+1] == p2) {
				return this.keys[i];
			}
		}
	}
	
	public void insert (int a) {
		int i = 0 ;
		int j = 0 ;
		int k = 0 ;
		if (this.isEmpty()) {
			this.keys = append(this.keys, a);
		} else {
			while (i==0) {
				if (this.  // unfinished
			}
		}
	}
	
	public boolean isEmpty () {
		return(this.keys.length == 0);
	}
	
	public int nbElements () {
		return this.keys.length ;
	}
	
	public boolean contains(int a) {
		 for (int i=0; i<this.keys.length; i++) {
			 if (a == this.keys[i]) {
				 return true ;
			 }
		 }
		 return false ;
	}

	public void toList(java.util.List<java.lang.Integer> l) {
			
		}
	}
