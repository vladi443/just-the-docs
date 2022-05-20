---
layout: default
title: Sierpinski Triangle
nav_order: 2
parent: Projects
---

# Sierpinski Triangle Simulator

## *C++ Sierpinski Triangle Simulator*

---

Sierpinski triangle is a geometric fractal based on equilateral triangles. The sequence begins with one equilateral triangle with custom size, and by dividing the sides of the triangle in half a pattern emerges which represents the Sierpinski triangle. If the pattern is continued forever, the triangle will contain an infinite amount of smaller equilateral triangles within it.

Triangle fractal C++ algorithm simulates what the Sierpinski triangle will appear like in n iretations. The algorithm uses the Chaos principle to simulate the appearance of the triangle rather than the normal removing triangles technique. The Chaos game states that if a point is placed halfway between two other points, one being a point chosen at random from withing the triangle, and the other chosen at random being from the original triangle, after n iretations the cluster of points will resemble the Sierpinski triangle.

Triangle fractal C++ algorithm follows the Chaos game principles by randomly selecting two points and creating a new point located in the middle of them. The algorithm repeats this process n-times, which is the amount of iretations indicated by the user at the beginning of the program. After cicling through all the iretations, the algorithm creates a simple grid and displays each point on it.

![Sierpinksi Triangle Simulator Sample Output Image](../../assets/images/triangle-fractal-sample-output.png)

Triangle fractal is registered under the GNU GPLv3 software license and its source-code is avaiable on github.

[Sierpinski Triangle on Github](https://github.com/vladi443/triangle-fractal/tree/main){: .btn .btn-blue .mr-2}
[Learn more about Sierpinski Triangle](https://mathigon.org/course/fractals/sierpinski){: .btn }
