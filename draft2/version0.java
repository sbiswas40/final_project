PVector m = new PVector(random(width), random(height));

void setup(){
size(600, 600);
}

void draw(){
background(78, 205, 240);
mole(int(m.x), int(m.y));
}

void mole(int x, int y){
//hole
fill(66,58,54);
ellipse(x,y,100,40);
//body
fill(175,82,45);
rect(x-25,y-80,50,80);
//head
fill(175,82,45);
ellipse(x,y-90,75,60);
//eyes
fill(600,600,600);
circle(x-10,y-100,15);
circle(x+10,y-100,15);
fill(0,0,0);
circle(x-10,y-100,2);
circle(x+10,y-100,2);
//mouth
fill(600,600,600);
ellipse(x,y-80,25,20);
//nose
fill(0,0,0);
ellipse(x,y-83,10,5);
//whiskers
line(x,y-83,x+10,y-79);
line(x,y-83,x-10,y-79);
line(x,y-83,x-10,y-79+4);
line(x,y-83,x+10,y-79+4);
//ears
fill(175,82,45);
ellipse(x+40,y-90,8,11);
ellipse(x-40,y-90,8,11);
}
