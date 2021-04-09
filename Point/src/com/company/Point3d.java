package com.company;

public class Point3d extends Point2d {
    private float z = 0.0f;
    public Point3d(){

    }

    public Point3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y,float z){
        setX(x);
        setY(y);
        setZ(z);

    }
    public float[] getXYZ(){
        float arr[] = new float[3];
        arr[0] = getX();
        arr[1] = getY();
        arr[2] = getZ();
        return arr;
    }

    @Override
    public String toString() {
        return "Point2d{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", z=" + getZ()+
                '}';
    }
}
