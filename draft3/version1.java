PVector m;
int xpos;
int ypos;
int value = 0;
int score = 0;

void setup(){
size(600, 600);
xpos = int(random(width));
ypos = int(random(height));
}

void draw(){
//background(78, 205, 240);
PFont font = createFont("Impact", 20);
textFont(font);
fill(0);
text(" \"Whack-a-Mole\" ", 5, 20);
text("by Srejon Biswas", 10, 40);
text("Score:", 400, 20);
text(score, 456, 20);
m = new PVector(xpos, ypos);
mole(int(m.x), int(m.y));
}

void mouseClicked() {
if (value == 0) {
value = 1;
}

else if ( (abs(mouseX - xpos) < 90) && (abs(mouseY - ypos) < 140))
{
xpos = int(random(width));
ypos = int(random(height));
background(random(255), random(255), random(255));
score += 1;
}

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
