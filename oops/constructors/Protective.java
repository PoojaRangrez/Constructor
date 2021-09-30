package com.xworkz.oops;

public class Protective {

	public static void main(String[] args) {
		Mask DisposableSurgicalMask=new Mask();
		DisposableSurgicalMask.color="Light Blue";
		DisposableSurgicalMask.durability="once";
		DisposableSurgicalMask.brand="bildos";
		System.out.println(DisposableSurgicalMask.color);
		System.out.println(DisposableSurgicalMask.durability);
		System.out.println(DisposableSurgicalMask.brand);
		DisposableSurgicalMask.protect();
		
		Mask Boldfit=new Mask();
		Boldfit.color="white";
		Boldfit.material="Cotton";
		Boldfit.price=379;
		System.out.println(Boldfit.color);
		System.out.println(Boldfit.material);
		System.out.println(Boldfit.price);
		Boldfit.protect();


	}

}
