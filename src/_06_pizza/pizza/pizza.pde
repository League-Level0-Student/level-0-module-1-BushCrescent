import ddf.minim.*;     //at the top of the sketch
Minim minim;     //at the top of the sketch
AudioPlayer sound;
void setup() {
    size(500, 500);
    fill(250, 100, 0);
    ellipse(250, 250, 150, 150);
    fill(250, 0, 0); 
    ellipse (250, 250, 120, 120);
    fill(250, 250, 0);
    ellipse (250, 250, 100, 100);
}
void draw() {
     
    
    PImage pepperoni = loadImage("pepperoni4.png");
    if(mousePressed){
    pepperoni.resize(10,10);
    image(pepperoni, mouseX, mouseY);
    }
}
