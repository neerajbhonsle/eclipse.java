package com.xworkz.child.Childoverriding;

import com.xworkz.parent.overriding.Jail;

public class PG extends Jail
{
	@Override
	public void jailer() {
		
		System.out.println("food is nt so good");
	}
	public void prisoner() {
		System.out.println("rooms is nt so good");
	}
}
