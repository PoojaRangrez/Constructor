package com.xworkz.oops;

public class MobileTest {

	public static void main(String[] args) {
		Mobile redmiNote7Pro=new Mobile();
        redmiNote7Pro.brand="Redmi";
        redmiNote7Pro.internalStorage=64;
        redmiNote7Pro.ram=4;
        redmiNote7Pro.price=16000;
        System.out.println(redmiNote7Pro.brand);
        System.out.println(redmiNote7Pro.internalStorage);
        System.out.println(redmiNote7Pro.ram);
        System.out.println(redmiNote7Pro.price);
        redmiNote7Pro.call();
        

        Mobile oppoA12=new Mobile();
        oppoA12.brand="Oppo";
        oppoA12.imeiNum=827382;
        oppoA12.color="Fantasy White";
        oppoA12.cameraPixel=5;
        oppoA12.price=11490;
        System.out.println(oppoA12.brand);
        System.out.println(oppoA12.imeiNum);
        System.out.println(oppoA12.color);
        System.out.println(oppoA12.cameraPixel);
        System.out.println(oppoA12.price);
        oppoA12.sendMessage();

        
    }

}
