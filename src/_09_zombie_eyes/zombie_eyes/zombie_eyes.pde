
void setup() {
PImage face = loadImage("face.jpeg");
image(face, 0, 0);
size(596, 794);
face.resize(596, 794);
}
void draw() {
fill(250, 0, 0);
ellipse(250, 200, 150, 150);
ellipse(375, 210, 110, 110);
fill(0, mouseX, mouseY);
ellipse(250, 200, 50, 50);
ellipse(375, 210, 10, 10);


}
