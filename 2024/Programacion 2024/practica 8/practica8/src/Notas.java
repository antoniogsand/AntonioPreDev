import java.io.Serializable;

public class Notas implements Serializable{
    
private int id;
private double n1;
private double n2;
private double n3;
private double n4;
private double n5;
private double n6;

public Notas(int id, double n1, double n2, double n3, double n4, double n5, double n6) {
    this.id = id;
    this.n1 = n1;
    this.n2 = n2;
    this.n3 = n3;
    this.n4 = n4;
    this.n5 = n5;
    this.n6 = n6;
}

public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public double getN1() {
    return n1;
}

public void setN1(double n1) {
    this.n1 = n1;
}

public double getN2() {
    return n2;
}

public void setN2(double n2) {
    this.n2 = n2;
}

public double getN3() {
    return n3;
}

public void setN3(double n3) {
    this.n3 = n3;
}

public double getN4() {
    return n4;
}

public void setN4(double n4) {
    this.n4 = n4;
}

public double getN5() {
    return n5;
}

public void setN5(double n5) {
    this.n5 = n5;
}

public double getN6() {
    return n6;
}

public void setN6(double n6) {
    this.n6 = n6;
}

@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + id;
    long temp;
    temp = Double.doubleToLongBits(n1);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    temp = Double.doubleToLongBits(n2);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    temp = Double.doubleToLongBits(n3);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    temp = Double.doubleToLongBits(n4);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    temp = Double.doubleToLongBits(n5);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    temp = Double.doubleToLongBits(n6);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    return result;
}

@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Notas other = (Notas) obj;
    if (id != other.id)
        return false;
    if (Double.doubleToLongBits(n1) != Double.doubleToLongBits(other.n1))
        return false;
    if (Double.doubleToLongBits(n2) != Double.doubleToLongBits(other.n2))
        return false;
    if (Double.doubleToLongBits(n3) != Double.doubleToLongBits(other.n3))
        return false;
    if (Double.doubleToLongBits(n4) != Double.doubleToLongBits(other.n4))
        return false;
    if (Double.doubleToLongBits(n5) != Double.doubleToLongBits(other.n5))
        return false;
    if (Double.doubleToLongBits(n6) != Double.doubleToLongBits(other.n6))
        return false;
    return true;
}

@Override
public String toString() {
    return "Notas [id=" + id + ", n1=" + n1 + ", n2=" + n2 + ", n3=" + n3 + ", n4=" + n4 + ", n5=" + n5 + ", n6=" + n6
            + "]";
}









}
