package edu.eci.cvds.patterns.shapes;

public class abstract ShapesFactory {
    public Shape create (RegularShapeType type){
        switch (type) { 
    case type instanceof Triangle:
       return new Triangle();
     break;
    case type instanceof Quadrilateral:
       return new Quadrilateral();
     break;
    case type instanceof Pentagon:
       return new Pentagon();
     break;
     case type instanceof Hexagon:
       return new Hexagon();
     break;
  }
    };
}