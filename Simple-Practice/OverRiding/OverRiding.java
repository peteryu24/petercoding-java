class OverRiding {
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    
}
 
class RideOver extends OverRiding {
     
    public void sum() {                                                     // overriding the sum() method
        System.out.println("The result is " +(this.left + this.right)+".");
    }
     
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
