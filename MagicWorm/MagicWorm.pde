int i=0;
int X=0;
int Y=600;
void setup(){
size(900,600);
background(124,65,44);
}
void draw(){
if(i<300){
ellipse(X,Y,3,3);
}
else if(i==300){
ellipse(random(300),random(300),3,3);
}
i++;
X=X+3;
Y=Y-2;
}