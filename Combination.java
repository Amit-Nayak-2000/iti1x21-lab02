public class Combination {

    // Instance variables.
    int firstValue;
    int secondValue;
    int thirdValue;

    // Constructor
    public Combination( int first, int second, int third ) {
        this.firstValue = first;
        this.secondValue = second;
        this.thirdValue = third;
    }

    // An instance method that compares this object
    // to other.
    // Always check that other is not null, i)
    // an error would occur if you tried to
    // access other.first if other was null, ii)
    // null is a valid argument, the method should
    // simply return false.

    public boolean equals( Combination other ) {
        if(other == null){
            return false;
        }
        else if(this.firstValue != other.firstValue){
            return false;
        }
        else if (this.secondValue != other.secondValue){
            return false;
        }
        else if (this.thirdValue != other.thirdValue){
            return false;
        }
        else{
            return true;
        }
    }

    // Returns a String representation of this Combination.

    public String toString() {
        String representation = String.valueOf(this.firstValue) + ":" + String.valueOf(this.secondValue) + ":" + String.valueOf(this.thirdValue);
        return representation;
    }

}
