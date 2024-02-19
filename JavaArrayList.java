import java.util.*; 



public class JavaArrayList{ 


 public static void main(String args[]){ 
  Mobil m1 = new Mobil ("Toyota", "kijang", 2007);
  Mobil m2 = new Mobil ("Toyota", "kijang", 2007);
  Mobil m3 = new Mobil ("Toyota", "kijang", 2007);
  
  ArrayList<Mobil> mbl=new ArrayList<Mobil>(); 
  
  mbl.add(m1);
  mbl.add(m2); 
  mbl.add(m3); 
  
  ArrayList<Mobil> mbl2=new ArrayList<Mobil>(); 
  
  mbl2.add(m1);
  mbl2.add(m2); 
  
  mbl.retainAll(mbl2); 
  
 
 
  Iterator mblitr = mbl.iterator();
  while(mblitr.hasNext()){
	  Mobil item = (Mobil) mblitr.next();
	  System.out.println ("mereknya : " + item.merek);
	  System.out.println ("namanya : " + item.nama);
	  System.out.println ("tahunya : " + item.tahunPembuatan);
  }
 }
}