package com.xworkz.association;

public class Syrup2 {
public String BrandName="Nextwell";
public Syrup syrup;
public void usesyrup(Syrup syrup) {
	syrup.setBrandName(null);
	syrup.setName(null);
	syrup.settaste(true);
	syrup.setUsedfor(null);
	syrup.setPrice(0);
	syrup.setMfgDate(0);
	syrup.setExpDate(0);
	syrup.setHydrobromide(0);
	syrup.setcolour(null);
	syrup.setQty(0);
	syrup.setHydrochloride(0);
	syrup.setMaleate(0);
	
	
	
	System.out.println(syrup.getName());
	System.out.println(syrup.gettaste());
	System.out.println(syrup.getUsedfor());
	System.out.println(syrup.getPrice());
	System.out.println(syrup. getMfgDate());
	System.out.println(syrup.getQty());
	System.out.println(syrup.getExpDate());
	System.out.println(syrup.getcolour());
	System.out.println(syrup.getHydrobromide());
	System.out.println(syrup.getHydrochloride());
	System.out.println(syrup.getMaleate());
}

}
