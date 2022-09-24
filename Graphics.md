---
header-includes:
 - \usepackage{fvextra}
 - \DefineVerbatimEnvironment{Highlighting}{Verbatim}{breaklines,commandchars=\\\{\}}
fontsize: 12pt
geometry: left=2cm,right=2cm,top=2cm,bottom=2cm
---
**Code:**
```{.C .numberLines}
#include <stdio.h>
#include <conio.h>
#include <graphics.h>
void BoundaryFill(int x, int y, int fill, int boundary);
void FloodFill(int x, int y, int floodFill, int interiorColor);
int main()
{
    int gd = DETECT, gm, length, choice;
    initgraph(&gd, &gm, "C:\\TURBOC3\\BGI");
    printf("Enter the length of the square: ");
    scanf("%d", &length);
    printf("Choose the Algorithm to use:\n1. Boundary Fill\n2. Flood Fill");
    scanf("%d", &choice); 
    rectangle((getmaxx() - length) / 2, (getmaxy() - length) / 2, (getmaxx() + length) / 2, (getmaxy() + length) / 2);
    switch (choice)
    {
    case 1:
        BoundaryFill(getmaxx() / 2, getmaxy() / 2, 12, WHITE);
        break;
    
    case 2:
        FloodFill(getmaxx() / 2, getmaxy() / 2, 11, BLACK);
        break;
    default:
        break;
    }
    getch();
    closegraph();
    return 0;
}
void BoundaryFill(int x, int y, int fill, int boundary)
{
    int current;
    current = getpixel(x, y);
    if(current != fill && current != boundary)
    {
        putpixel(x, y, fill);
        BoundaryFill(x + 1, y, fill, boundary);
        BoundaryFill(x, y + 1, fill, boundary);
        BoundaryFill(x - 1, y, fill, boundary);
        BoundaryFill(x, y - 1, fill, boundary);
    }
}
void FloodFill(int x, int y, int floodFill, int interiorColor)
{
    unsigned int current;
    current = getpixel(x, y);
    if(current == interiorColor)
    {
        putpixel(x, y, floodFill);
        FloodFill(x + 1, y, floodFill, interiorColor);
        FloodFill(x, y + 1, floodFill, interiorColor);
        FloodFill(x - 1, y, floodFill, interiorColor);
        FloodFill(x, y - 1, floodFill, interiorColor);
    }
}
```