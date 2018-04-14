import ddf.minim.*;
Minim minim;
 AudioPlayer sound; 
 
 
 void setup(){
  size(1000,1000); 
   fill(237,215,106);
   ellipse(500,500,1000,1000);
   fill(206,14,14);
   ellipse(500,500,925,925);
   fill(255,249,198);
   ellipse(500,500,900,900);

  minim = new Minim(this); 
  

  
   sound = minim.loadFile("268557__cydon__explosion-001.mp3");
  
 }
 void draw(){
   
  PImage pineapple = loadImage("pineapple.ppm.gif") ;
   pineapple.resize(50,50);
   image(pineapple, 382,284);
   
   image(pineapple, 460,678);
 
 if(mousePressed){
 image(pineapple,mouseX,mouseY);
sound.trigger();
 }
 }